package com.jd.cd.panda.dao.test;

import com.alibaba.fastjson.JSON;
import com.jd.cd.panda.dao.AppPackageDao;
import com.jd.cd.panda.theme.AppPackage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 *
 */
@ContextConfiguration({"classpath:spring/spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppPackageDaoTest {

    @Resource
    private AppPackageDao appPackageDao;

    @Test
    public void test() {
        AppPackage appPackage = appPackageDao.selectByPrimaryKey(14);
        System.out.println("结果为：" + JSON.toJSONString(appPackage));
    }

}
