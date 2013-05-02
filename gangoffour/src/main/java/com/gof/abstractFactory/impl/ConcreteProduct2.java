package com.gof.abstractFactory.impl;

import com.gof.abstractFactory.AbstractProductB;

public class ConcreteProduct2 extends AbstractProductB {

	@Override
	protected void doSomethingElse() {
		System.out
				.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out
				.println("Printing system environment (if the system supports environment variables): "
						+ System.getenv());
		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}

}
