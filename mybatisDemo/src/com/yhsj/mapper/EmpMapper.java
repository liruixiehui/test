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
	public int deleteEmp(int empno);
	
	/**
	 * 通过ID查询EMP
	 * @param id
	 * @return
	 */
	public Emp findEmpById(int empno);
	
	/**
	 * 查询所有EMP
	 * @return
	 */
	public List<Emp> findAll();
	
	/**
	 * 根据姓名查询Emp
	 * @param emp
	 * @return
	 */
	public List<Emp> findEmpByEname(Emp emp);
	
	/**
	 * 根据姓名查询Emp
	 * @param emp
	 * @return
	 */
	public List<Emp> findEmpByWhere(Emp emp);
	
	public List<Emp> findEmpByChoose(Emp emp);
	
	public List<Emp> findEmpByForeach(Object[] objs);
	
	public List<Emp> findEmpByForeachList(List<Integer> list);
	
	public List<Emp> findEmpByForeachList1(List<Emp> list);
	
	public int updateEmp1(Emp emp);

}
