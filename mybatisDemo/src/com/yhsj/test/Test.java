package com.yhsj.test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yhsj.bean.Emp;
import com.yhsj.mapper.EmpMapper;

public class Test {
	public static void main(String[] args)  {
//        delete();
//		save();
//		update();
//		findEmpById();
//		findAll();
//		findEmpByEname();
//		findEmpByWhere();
//		findEmpByChoose();
//		findEmpByForeach();
//		findEmpByForeachList();
		findEmpByForeachList1();
//		updateEmp1();
	}
	
	public static void updateEmp1(){
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sessionFactory.openSession();
			EmpMapper em = session.getMapper(EmpMapper.class);
			Emp emp = new Emp(new Integer(123),"zhangsan", "renshi",new Integer(7369),new Date(new java.util.Date().getTime()),new Double(80),new Double(100),50);
			
			em.updateEmp1(emp);
			
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	
	
		
	
	
		
	
	
	}
	
	
	public static void findEmpByForeachList1(){

		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sessionFactory.openSession();
			EmpMapper em = session.getMapper(EmpMapper.class);
			
			List<Emp> params = new ArrayList<Emp>();
			Emp emp1 = new Emp(new Integer(7369), "", new Double(20));
			Emp emp2 = new Emp(new Integer(7499), "", new Double(20));
			Emp emp3 = new Emp(new Integer(7566), "", new Double(20));
			Emp emp4 = new Emp(new Integer(7698), "", new Double(20));
			params.add(emp1);
			params.add(emp2);
			params.add(emp3);
			params.add(emp4);
			
			List<Emp> list = em.findEmpByForeachList1(params);
			
			for(Emp e : list){
				System.out.println(e);
			}
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	
	
		
	
	
		
	
	}
	public static void findEmpByForeachList(){




		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sessionFactory.openSession();
			EmpMapper em = session.getMapper(EmpMapper.class);
			
			List<Integer> params = new ArrayList<Integer>();
			params.add(7369);
			params.add(7499);
			params.add(7566);
			List<Emp> list = em.findEmpByForeachList(params);
			
			for(Emp e : list){
				System.out.println(e);
			}
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	
	
		
	
	
		
	}
	public static void findEmpByForeach(){



		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sessionFactory.openSession();
			EmpMapper em = session.getMapper(EmpMapper.class);
			
			Object[] objs = new Object[]{7369,7499,7654,7902};
			List<Emp> list = em.findEmpByForeach(objs);
			
			for(Emp e : list){
				System.out.println(e);
			}
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	
	
		
	
	}
	public static void findEmpByChoose(){


		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sessionFactory.openSession();
			EmpMapper em = session.getMapper(EmpMapper.class);
			
			Emp emp = new Emp(new Integer(0), "", new Double(20));
			List<Emp> list = em.findEmpByChoose(emp);
			for(Emp e : list){
				System.out.println(e);
			}
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	
	
		
	}
	
	public static void findEmpByWhere(){

		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sessionFactory.openSession();
			EmpMapper em = session.getMapper(EmpMapper.class);
			
			Emp emp = new Emp(new Integer(0), "A", new Double(25));
			List<Emp> list = em.findEmpByWhere(emp);
			for(Emp e : list){
				System.out.println(e);
			}
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	
	}
	
	
	
	public static void findEmpByEname(){
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sessionFactory.openSession();
			EmpMapper em = session.getMapper(EmpMapper.class);
			
			Emp emp = new Emp(new Integer(0), "A", new Double(25));
			List<Emp> list = em.findEmpByEname(emp);
			for(Emp e : list){
				System.out.println(e);
			}
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	public static void findAll(){
		


		SqlSession session =null;
		try { //使用MyBatis提供的Resources类加载mybatis的配置文件
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
		    //建立会话工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			//开启会话
			 session = sessionFactory.openSession();
			 EmpMapper em = (EmpMapper)session.getMapper(EmpMapper.class);
		     List<Emp> list = em.findAll();
		     for(Emp e : list){
		    	 System.out.println(e);
		     }
			 session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			
		}finally{
			session.close();
		}
	
	
	}
	public static void findEmpById(){

		SqlSession session =null;
		try { //使用MyBatis提供的Resources类加载mybatis的配置文件
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
		    //建立会话工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			//开启会话
			 session = sessionFactory.openSession();
			 EmpMapper em = (EmpMapper)session.getMapper(EmpMapper.class);
		     Emp emp = em.findEmpById(123);
		     System.out.println(emp);
			 session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			
		}finally{
			session.close();
		}
	
	}
	public static void update(){
		SqlSession session =null;
		try { //使用MyBatis提供的Resources类加载mybatis的配置文件
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
		    //建立会话工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			//开启会话
			 session = sessionFactory.openSession();
			 EmpMapper em = (EmpMapper)session.getMapper(EmpMapper.class);
			 Emp emp = new Emp(new Integer(123),"lisi", "renshi",new Integer(7369),new Date(new java.util.Date().getTime()),new Double(30),new Double(200),20);
		     em.updateEmp(emp);
				
			 session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			
		}finally{
			session.close();
		}
	}
	public static void delete() {
		SqlSession session =null;
		try { //使用MyBatis提供的Resources类加载mybatis的配置文件
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
		    //建立会话工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			//开启会话
			 session = sessionFactory.openSession();
			 EmpMapper em = (EmpMapper)session.getMapper(EmpMapper.class);
		     em.deleteEmp(123);
				
			 session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public static void save(){
		 //使用MyBatis提供的Resources类加载mybatis的配置文件
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			//建立会话工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//开启会话
			SqlSession session = sessionFactory.openSession();
//			/Emp emp = new Emp(new Integer(123), "lisi", "renshi", new Integer(7788), new Date(new java.util.Date().getTime()), new Double(3000), new Double(100), 20);
			Emp emp = new Emp(new Integer(123),"lisi", "renshi",new Integer(7369),new Date(new java.util.Date().getTime()),new Double(30),new Double(100),20);
			
	       EmpMapper em = (EmpMapper)session.getMapper(EmpMapper.class);
	       em.saveEmp(emp);
			//提交事务
			session.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		
		
	}
		
	

}
