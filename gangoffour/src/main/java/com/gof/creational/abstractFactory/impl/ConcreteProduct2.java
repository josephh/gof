package com.gof.creational.abstractFactory.impl;

import com.gof.creational.abstractFactory.AbstractProductB;

public class ConcreteProduct2 extends AbstractProductB {

	@Override
	public void doSomethingElse() {
		System.out
				.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out
				.println("Printing system environment (if the system supports environment variables): "
						+ System.getenv());
		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}

}
