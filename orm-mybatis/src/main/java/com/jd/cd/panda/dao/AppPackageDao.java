package com.jd.cd.panda.dao;


import com.jd.cd.panda.theme.AppPackage;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class AppPackageDao extends SqlSessionDaoSupport {


	    public void insert(AppPackage record) {
	        this.getSqlSession().insert("app_package.insert", record);
	    }




	    public AppPackage selectByPrimaryKey(Integer id) {
	        AppPackage key = new AppPackage();
	        key.setId(id);
	        AppPackage record = (AppPackage) this.getSqlSession().selectOne("app_package.selectByPrimaryKey", key);
	        return record;
	    }




	  


	

}
