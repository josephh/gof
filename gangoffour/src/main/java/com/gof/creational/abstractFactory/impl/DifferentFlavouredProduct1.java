package com.gof.creational.abstractFactory.impl;

import com.gof.creational.abstractFactory.AbstractProductA;

public class DifferentFlavouredProduct1 extends AbstractProductA {

	@Override
	public void doIt() {
		System.out
				.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out
				.println("Getting a random number (via java.lang.Math.random()) : "
						+ Math.random());
		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

	}

}
