package com.gof.abstractFactory.impl;

import com.gof.abstractFactory.AbstractFactory;
import com.gof.abstractFactory.AbstractProductA;
import com.gof.abstractFactory.AbstractProductB;

public class ConcreteFactory1 extends AbstractFactory {

	private static AbstractFactory f;

	private ConcreteFactory1() {
		/**
		 * no operations, just here to support enforcing singleton pattern
		 */
	}

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProduct1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProduct2();
	}

	public static AbstractFactory instance() {
		// not thread safe!
		if (f == null)
			f = new ConcreteFactory1();
		return f;
	}
}
