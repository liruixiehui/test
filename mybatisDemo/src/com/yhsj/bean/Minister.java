package com.yhsj.bean;

public class Minister {
	private Integer mId;
	private String mName;
	
	private Integer countryId;
	public Integer getmId() {
		return mId;
	}
	public void setmId(Integer mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	@Override
	public String toString() {
		return "Minister [mId=" + mId + ", mName=" + mName + "]";
	}
	

}
