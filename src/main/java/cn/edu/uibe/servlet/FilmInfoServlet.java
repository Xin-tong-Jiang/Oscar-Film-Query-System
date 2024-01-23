package cn.edu.uibe.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.uibe.dao.FilmInfoDao;
import cn.edu.uibe.dao.impl.FilmInfoDaoImpl;
import cn.edu.uibe.domain.FilmInfo;

/**
 * 用户主页控制器，映射的URL是film
 */
@SuppressWarnings("serial")
// 将URL映射为/film
@WebServlet("/film")
public class FilmInfoServlet extends HttpServlet {
    // 处理get方法
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得电影ID
        String id = request.getParameter("id");
        String url=""; //视图页面，可以是不同的模板，也可能是错误处理页面
        FilmInfo filmInfo=null; //用于显示不同的模型
    
        if(id==null||id.trim().equals("")){
            url = "error.jsp";
        }else{
            //新建电影信息访问对象
        	FilmInfoDao filmInfoDao = new FilmInfoDaoImpl();
            //根据电影ID获取电影信息
            filmInfo = filmInfoDao.getFilmInfoById(id);
            if(filmInfo!=null){
                //获得电影主页的模板
                url = filmInfo.getTemplate();
                //在request对象上绑定用户信息，属性名为film：${film.}
                request.setAttribute("film", filmInfo);
            }else{
                url = "error.jsp"; //如果没找到用户信息
            }
        }
        //获得请求转发对象，转发到的url已经计算好
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        //转发请求
        dispatcher.forward(request, response);
    }
    // 处理post方法
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}

