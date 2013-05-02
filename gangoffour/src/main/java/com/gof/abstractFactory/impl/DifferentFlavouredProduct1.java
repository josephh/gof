package com.gof.abstractFactory.impl;

import com.gof.abstractFactory.AbstractProductA;

public class DifferentFlavouredProduct1 extends AbstractProductA {

	@Override
	protected void doIt() {
		System.out
				.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out
				.println("Getting a random number (via java.lang.Math.random()) : "
						+ Math.random());
		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

	}

}
