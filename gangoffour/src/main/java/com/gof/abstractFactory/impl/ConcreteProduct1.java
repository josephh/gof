package com.gof.abstractFactory.impl;

import com.gof.abstractFactory.AbstractProductA;

public class ConcreteProduct1 extends AbstractProductA {

	@Override
	public void doIt() {
		System.out
				.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		double d = Math.random();
		System.out
				.println("Raising 'e' by the power of a randomly supplied double value ("
						+ d
						+ "), i.e. (java.lang.Math.exp("
						+ d
						+ "): "
						+ Math.exp(d));
		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

	}
}
