package com.gof.creational.abstractFactory;

import org.junit.Test;

import com.gof.creational.abstractFactory.impl.ConcreteFactory1;
import com.gof.creational.abstractFactory.impl.ConcreteFactory2;
import com.gof.creational.abstractFactory.FactoryClient;

public class FactoryTest {

	@Test
	public void test() {
		FactoryClient fc1 = new FactoryClient(ConcreteFactory1.instance());
		FactoryClient fc2 = new FactoryClient(ConcreteFactory2.instance());
	}

	@Test
	public void testCreateProductA() {
		AbstractFactory f = ConcreteFactory1.instance();
		f.createProductA().doIt();
	}

	@Test
	public void testDifferentProductA() {
		AbstractFactory f = ConcreteFactory2.instance();
		f.createProductA().doIt();
	}

	@Test
	public void testCreateProductB() {
		AbstractFactory f = ConcreteFactory1.instance();
		f.createProductB().doSomethingElse();
	}

	@Test
	public void testDifferentProductB() {
		AbstractFactory f = ConcreteFactory2.instance();
		f.createProductB().doSomethingElse();
	}

}
