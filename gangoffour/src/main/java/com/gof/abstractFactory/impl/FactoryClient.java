package com.gof.abstractFactory.impl;

import com.gof.abstractFactory.AbstractFactory;

public class FactoryClient {

	public FactoryClient(AbstractFactory factory) {
		super();

		// get products send them messages
		factory.createProductA().doIt();

		// new up another...
		factory.createProductB().doSomethingElse();
	}
}
