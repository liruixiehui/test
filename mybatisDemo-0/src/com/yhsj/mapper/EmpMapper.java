package com.yhsj.mapper;

import java.util.List;

import com.yhsj.bean.Emp;

public interface EmpMapper {
	
	/**
	 * 保存EMP
	 * @param emp
	 * @return
	 */
	public int saveEmp(Emp emp);
	
	/**
	 * 修改EMP
	 * @param emp
	 * @return
	 */
	public int updateEmp(Emp emp);
	
	/**
	 * 删除EMP
	 * @param id
	 * @return
	 */
	public int deleteEmp(Integer id);
	
	/**
	 * 通过ID查询EMP
	 * @param id
	 * @return
	 */
	public Emp findEmpById(Integer id);
	
	/**
	 * 查询所有EMP
	 * @return
	 */
	public List<Emp> findAll();
	

}
