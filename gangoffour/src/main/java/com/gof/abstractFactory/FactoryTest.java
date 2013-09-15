package com.gof.abstractFactory;

import org.junit.Test;

import com.gof.abstractFactory.impl.ConcreteFactory1;
import com.gof.abstractFactory.impl.ConcreteFactory2;
import com.gof.abstractFactory.FactoryClient;

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
