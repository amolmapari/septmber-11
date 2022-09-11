package com.ait.jdbc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.ait.jdbc.dao.BonuesDao;

public class MyRunner implements ApplicationRunner {


	@Autowired
	BonuesDao daoRef;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Bonus for empno:6771 "+daoRef.findBonusFindById(76771));
	}

}
