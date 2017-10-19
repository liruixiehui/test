package com.yhsj.mapper;

import java.util.List;

import com.yhsj.bean.Emp;

public interface EmpMapper {
	
	/**
	 * ����EMP
	 * @param emp
	 * @return
	 */
	public int saveEmp(Emp emp);
	
	/**
	 * �޸�EMP
	 * @param emp
	 * @return
	 */
	public int updateEmp(Emp emp);
	
	/**
	 * ɾ��EMP
	 * @param id
	 * @return
	 */
	public int deleteEmp(Integer id);
	
	/**
	 * ͨ��ID��ѯEMP
	 * @param id
	 * @return
	 */
	public Emp findEmpById(Integer id);
	
	/**
	 * ��ѯ����EMP
	 * @return
	 */
	public List<Emp> findAll();
	

}
