package com.gof.abstractFactory.impl;

import com.gof.abstractFactory.AbstractProductB;

public class DifferentFlavouredProduct2 extends AbstractProductB {

	@Override
	public void doSomethingElse() {
		long l = System.currentTimeMillis();
		System.out
				.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("The square root of the current system time (" + l
				+ " milliseconds): " + Math.sqrt(l));
		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}
}
