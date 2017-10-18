package com.yhsj.mapper;

import com.yhsj.bean.Country;

public interface CountryMapper {
	public Country findCountryById(int cid);
	
	public Country selectCountryById(int cid);

}
