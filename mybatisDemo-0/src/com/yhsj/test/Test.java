package com.yhsj.test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yhsj.bean.Emp;
import com.yhsj.mapper.EmpMapper;

public class Test {
	public static void main(String[] args) throws IOException {
		 //使用MyBatis提供的Resources类加载mybatis的配置文件
		Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
	    //建立会话工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		
		//开启会话
		SqlSession session = sessionFactory.openSession();
		Emp emp = new Emp(new Integer(1234), "李四", "人事", new Integer(7788), new Date(new java.util.Date().getTime()), new Double(3000), new Double(1000), 20);
		
        EmpMapper em = (EmpMapper)session.getMapper(EmpMapper.class);
        em.saveEmp(emp);
		//提交事务
		session.commit();
	}

}
