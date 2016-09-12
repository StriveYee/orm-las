package com.jd.cd.panda.dao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.jd.cd.panda.dao.PdThemeDao2;
import com.jd.cd.panda.theme.PdTheme;

@ContextConfiguration({"classpath:spring/spring-config2.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class PdThemeDaoTest2 {
	
	@Autowired
	private PdThemeDao2 pdThemeDao;
	
	@Test
	public void getThemeByIDTest() {
		try {
			PdTheme theme = pdThemeDao.getThemeByID(1);
			System.out.println(JSON.toJSONString(theme,SerializerFeature.DisableCircularReferenceDetect));
			
//			PdTheme theme2 = pdThemeDao.getThemeByID2(1);
//			System.out.println(JSON.toJSONString(theme2,SerializerFeature.DisableCircularReferenceDetect));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
