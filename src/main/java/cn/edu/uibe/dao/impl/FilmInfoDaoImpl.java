package cn.edu.uibe.dao.impl;

import java.sql.*;
import java.text.SimpleDateFormat;
import cn.edu.uibe.dao.FilmInfoDao;
import cn.edu.uibe.domain.FilmInfo;

// ���ݷ��ʽӿ�ʵ����
public class FilmInfoDaoImpl implements FilmInfoDao{
    
    private String url;    //�������ݿ��URL
    private String dbUser; //���ݿ��û�
    private String dbPass; //���ݿ�����
    public FilmInfoDaoImpl(){
        url = "jdbc:mysql://127.0.0.1:3306/mydb"
                + "?useUnicode=true&characterEncoding=gbk"
                + "&useSSL=false&serverTimezone=Asia/Shanghai";
        dbUser = "root";
        dbPass = "123456";
    }
    /**
     * ���ݵ�ӰID��ѯ��Ӱ��Ϣ
     * @param id ��ӰID
     * @return ��Ӱ��Ϣ�������û�鵽����null
     */
    public FilmInfo getFilmInfoById(String id){
        Connection conn=null; //���ݿ�����
        Statement stmt=null;  //������
        ResultSet rs=null;    //�����
        FilmInfo filmInfo = new FilmInfo();
        String sql = "select * from film_info where id='"+id+"'";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,dbUser,dbPass);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(sql);//�ڿ���̨���SQL���
            if(rs.next()){
            	filmInfo.setId(id);//��ӰID
            	filmInfo.setName(rs.getString("name"));//����
            	filmInfo.setTemplate(rs.getString("template"));//��ҳģ��
            	filmInfo.setPrize(rs.getString("prize"));//����
            	filmInfo.setPoster(rs.getString("poster"));//����
            	filmInfo.setDirector(rs.getString("director"));//����
            	filmInfo.setCountry(rs.getString("country")); //����
            	filmInfo.setSummary(rs.getString("summary"));//������
                Date release = rs.getDate("releaseDate");//��ӳ����
                SimpleDateFormat df = new SimpleDateFormat("yyyy��MM��dd��");
                filmInfo.setRelease(df.format(release));
                filmInfo.setScore(rs.getString("score")); //��������
            }else{
                return null; //���û�в鵽ID�������û����򷵻�null
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
