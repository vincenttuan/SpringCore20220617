package com.spring.core.session03.beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Car> {

	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
