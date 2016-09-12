package com.jd.cd.panda.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jd.cd.panda.theme.PdTheme;

public interface PdThemeDao {
	
	@Select("SELECT * FROM PD_THEME WHERE id = #{id}")
	PdTheme getThemeByID(@Param("id") int id);
	
}
