package com.gof.abstractFactory;

public abstract class FactoryClient {

	public FactoryClient(AbstractFactory factory) {
		super();

		// get products send them messages
		factory.createProductA().doIt();

		// new up another...
		factory.createProductB().doSomethingElse();
	}
}
