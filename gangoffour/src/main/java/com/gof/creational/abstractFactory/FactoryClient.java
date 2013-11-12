package com.gof.creational.abstractFactory;

public class FactoryClient {

	public FactoryClient(AbstractFactory factory) {
		super();

		// get products send them messages
		factory.createProductA().doIt();

		// new up another...
		factory.createProductB().doSomethingElse();
	}
}
