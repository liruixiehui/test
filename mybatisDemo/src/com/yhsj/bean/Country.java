package com.yhsj.bean;

import java.util.Set;

public class Country {
	
	private Integer cId;
	private String cName;
	private Set<Minister> ministers;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Set<Minister> getMinisters() {
		return ministers;
	}
	public void setMinisters(Set<Minister> ministers) {
		this.ministers = ministers;
	}
	@Override
	public String toString() {
		return "Country [cId=" + cId + ", cName=" + cName + ", ministers=" + ministers + "]";
	}
	
	

}
