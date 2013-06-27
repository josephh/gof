package com.gof.factoryMethod;

import com.gof.factoryMethod.client.CreatorWithConcreteFactoryMethod;
import com.gof.factoryMethod.thingy.SomeObject;

/**
 * The FactoryMethod pattern is also known as the 'Virtual Constructor'.
 * 
 * An interface for creating an object - but subclasses make the decision about
 * which class to instantiate.
 * 
 * This presents a solution to the situation: an application knows it needs to 
 * create a concrete instance of some abstract type - but doesn't know which 
 * concrete instance is the one required - it only trades in terms of abstracts.
 * 
 * */
public class CreatorWithAbstractFactoryMethod {
	
	/**
	 * Default no args constructor
	 */
	public CreatorWithAbstractFactoryMethod(){
		System.out.println("In CreatorWithAbstractFactoryMethod's constructor...!");
	};
		
	public abstract SomeObject createSomeObject();
		
}

