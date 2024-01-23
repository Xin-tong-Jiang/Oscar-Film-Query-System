package cn.edu.uibe.dao.impl;

import java.sql.*;
import java.text.SimpleDateFormat;
import cn.edu.uibe.dao.FilmInfoDao;
import cn.edu.uibe.domain.FilmInfo;

// 数据访问接口实现类
public class FilmInfoDaoImpl implements FilmInfoDao{
    
    private String url;    //连接数据库的URL
    private String dbUser; //数据库用户
    private String dbPass; //数据库密码
    public FilmInfoDaoImpl(){
        url = "jdbc:mysql://127.0.0.1:3306/mydb"
                + "?useUnicode=true&characterEncoding=gbk"
                + "&useSSL=false&serverTimezone=Asia/Shanghai";
        dbUser = "root";
        dbPass = "123456";
    }
    /**
     * 根据电影ID查询电影信息
     * @param id 电影ID
     * @return 电影信息对象，如果没查到返回null
     */
    public FilmInfo getFilmInfoById(String id){
        Connection conn=null; //数据库连接
        Statement stmt=null;  //语句对象
        ResultSet rs=null;    //结果集
        FilmInfo filmInfo = new FilmInfo();
        String sql = "select * from film_info where id='"+id+"'";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,dbUser,dbPass);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(sql);//在控制台输出SQL语句
            if(rs.next()){
            	filmInfo.setId(id);//电影ID
            	filmInfo.setName(rs.getString("name"));//名称
            	filmInfo.setTemplate(rs.getString("template"));//主页模板
            	filmInfo.setPrize(rs.getString("prize"));//奖项
            	filmInfo.setPoster(rs.getString("poster"));//海报
            	filmInfo.setDirector(rs.getString("director"));//导演
            	filmInfo.setCountry(rs.getString("country")); //国家
            	filmInfo.setSummary(rs.getString("summary"));//剧情简介
                Date release = rs.getDate("releaseDate");//上映日期
                SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
                filmInfo.setRelease(df.format(release));
                filmInfo.setScore(rs.getString("score")); //豆瓣评分
            }else{
                return null; //如果没有查到ID给定的用户，则返回null
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(rs!=null) try{rs.close();}catch(Exception ignore){}
            if(stmt!=null) try{stmt.close();}catch(Exception ignore){}
            if(conn!=null) try{conn.close();}catch(Exception ignore){}    
        }
        return filmInfo;
    }
}
