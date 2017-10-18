package com.yhsj.test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yhsj.bean.Country;
import com.yhsj.bean.Emp;
import com.yhsj.mapper.CountryMapper;
import com.yhsj.mapper.EmpMapper;

public class Test1 {
	
	public static void main(String[] args) {
//		one2many();
		one2many1();
	}
	
	public static void one2many1(){


		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sessionFactory.openSession();
		    CountryMapper cm = session.getMapper(CountryMapper.class);
			Country c = cm.selectCountryById(1);
			System.out.println(c.getcName());
			System.out.println(c.getMinisters());
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}	
	
	
	}
	
	public static void one2many() {

		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sessionFactory.openSession();
		    CountryMapper cm = session.getMapper(CountryMapper.class);
			Country c = cm.findCountryById(1);
			System.out.println(c);
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}	
	
	}

}
