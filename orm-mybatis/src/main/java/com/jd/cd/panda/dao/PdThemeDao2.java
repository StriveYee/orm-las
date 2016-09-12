package com.jd.cd.panda.dao;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.jd.cd.panda.theme.PdTheme;

public class PdThemeDao2 extends SqlSessionDaoSupport {	
	
	public PdTheme getThemeByID(int id) {
		return (PdTheme)this.getSqlSession().selectList("com.jd.cd.panda.dao.PdThemeDao2.getThemeByID", id,new RowBounds(0,1)).get(0);
	}
	
	public PdTheme getThemeByID2(int id) {
		PdThemeDao2 pdThemeDao2 = this.getSqlSession().getMapper(PdThemeDao2.class);
		return pdThemeDao2.getThemeByID2(id);
	}
	
}
