package cn.edu.uibe.dao;

import cn.edu.uibe.domain.FilmInfo;
//数据访问接口
//业务逻辑模型：数据访问对象，定义接口
public interface FilmInfoDao {
	FilmInfo getFilmInfoById(String id);
}

