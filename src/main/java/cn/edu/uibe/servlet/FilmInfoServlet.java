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
 * �û���ҳ��������ӳ���URL��film
 */
@SuppressWarnings("serial")
// ��URLӳ��Ϊ/film
@WebServlet("/film")
public class FilmInfoServlet extends HttpServlet {
    // ����get����
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //��õ�ӰID
        String id = request.getParameter("id");
        String url=""; //��ͼҳ�棬�����ǲ�ͬ��ģ�壬Ҳ�����Ǵ�����ҳ��
        FilmInfo filmInfo=null; //������ʾ��ͬ��ģ��
    
        if(id==null||id.trim().equals("")){
            url = "error.jsp";
        }else{
            //�½���Ӱ��Ϣ���ʶ���
        	FilmInfoDao filmInfoDao = new FilmInfoDaoImpl();
            //���ݵ�ӰID��ȡ��Ӱ��Ϣ
            filmInfo = filmInfoDao.getFilmInfoById(id);
            if(filmInfo!=null){
                //��õ�Ӱ��ҳ��ģ��
                url = filmInfo.getTemplate();
                //��request�����ϰ��û���Ϣ��������Ϊfilm��${film.}
                request.setAttribute("film", filmInfo);
            }else{
                url = "error.jsp"; //���û�ҵ��û���Ϣ
            }
        }
        //�������ת������ת������url�Ѿ������
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        //ת������
        dispatcher.forward(request, response);
    }
    // ����post����
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}

