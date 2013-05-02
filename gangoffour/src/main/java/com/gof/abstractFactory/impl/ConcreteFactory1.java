package com.gof.abstractFactory.impl;

import com.gof.abstractFactory.AbstractFactory;
import com.gof.abstractFactory.AbstractProductA;
import com.gof.abstractFactory.AbstractProductB;

public class ConcreteFactory1 extends AbstractFactory {

	public ConcreteFactory1() {
		super.whereabouts();
	}

	@Override
	protected AbstractProductA createProductA() {
		return new ConcreteProduct1();
	}

	@Override
	protected AbstractProductB createProductB() {
		return new ConcreteProduct2();
	}

}
