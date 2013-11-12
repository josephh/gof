package com.gof.creational.abstractFactory.impl;

import com.gof.creational.abstractFactory.AbstractFactory;
import com.gof.creational.abstractFactory.AbstractProductA;
import com.gof.creational.abstractFactory.AbstractProductB;

public class ConcreteFactory2 extends AbstractFactory {

	private static AbstractFactory f;

	private ConcreteFactory2() {
		/**
		 * no operations, just here to support enforcing singleton pattern
		 */
	}

	@Override
	public AbstractProductA createProductA() {
		return new DifferentFlavouredProduct1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new DifferentFlavouredProduct2();
	}

	public static AbstractFactory instance() {
		// not thread safe!
		if (f == null)
			f = new ConcreteFactory2();
		return f;
	}

}
