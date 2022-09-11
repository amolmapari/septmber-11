package com.ait.jdbc.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.ait.jdbc.dao.BonuesDao;
@Repository
public class BonusDaoImpl implements BonuesDao {

	
	@Autowired
	SimpleJdbcCall simplejdbcCall;
	
	
	
	@Override
	public double findBonusFindById(Integer id) {
simplejdbcCall.withFunctionName("new_function");
Map<String,Object>result=simplejdbcCall.execute(id);

return (double)result.get("return");
	}

}
