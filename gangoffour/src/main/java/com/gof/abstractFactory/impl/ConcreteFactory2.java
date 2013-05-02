package com.gof.abstractFactory.impl;

import com.gof.abstractFactory.AbstractFactory;
import com.gof.abstractFactory.AbstractProductA;
import com.gof.abstractFactory.AbstractProductB;

public class ConcreteFactory2 extends AbstractFactory {

	public ConcreteFactory2() {
		super.whereabouts();
	}

	@Override
	protected AbstractProductA createProductA() {
		return new DifferentFlavouredProduct1();
	}

	@Override
	protected AbstractProductB createProductB() {
		return new DifferentFlavouredProduct2();
	}

}
