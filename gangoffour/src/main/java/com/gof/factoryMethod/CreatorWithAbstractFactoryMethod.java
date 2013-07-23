package com.gof.factoryMethod;

import com.gof.factoryMethod.client.CreatorWithConcreteFactoryMethod;
import com.gof.factoryMethod.thingy.SomeAbstractObject;

/**
 * <p>
 * The FactoryMethod pattern is also known as the 'Virtual Constructor'.
 * </p>
 * <p>
 * An interface for creating an object - but subclasses make the 
 * decision  about which class to instantiate.
 * </p>
 * <p>
 * This presents a solution to the situation: an application knows it 
 * needs to create a concrete instance of some abstract type - but 
 * doesn't know which concrete instance is the one required - it only
 * trades in terms of abstracts.
 * </p>
 * <p>
 * This pattern often goes with a framework.  Frameworks can't know 
 * every single possible permutation of every possible concrete class
 * at runtime, so the abstract factory presents a way of moving the 
 * knowledge about which class is required at runtime, out of the 
 * framework and into the application subclass.
 * </p>
 * */
public abstract class CreatorWithAbstractFactoryMethod {
	
	/**
	 * Default no args constructor
	 */
	public CreatorWithAbstractFactoryMethod(){
		System.out.println("In CreatorWithAbstractFactoryMethod's constructor...!");
	};
		
	public abstract SomeAbstractObject createSomeObject();
		
}

