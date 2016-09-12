package com.jd.cd.panda.dao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.jd.cd.panda.dao.PdThemeDao;
import com.jd.cd.panda.theme.PdTheme;

@ContextConfiguration({"classpath:spring/spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class PdThemeDaoTest {
	
	@Autowired
	private PdThemeDao pdThemeDao;
	
	@Test
	public void getThemeByIDTest() {
		try {
			PdTheme theme = pdThemeDao.getThemeByID(28);
			System.out.println("返回结果：" + JSON.toJSONString(theme,SerializerFeature.DisableCircularReferenceDetect));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
