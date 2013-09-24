package com.gof.builder;
/**
 * AbstractBuilder.java
 * 
 * Copyright 2013 britford <britford@joe>
 * 
 * <p>
 * The abstract class defining the methods a collaborating 'director', 
 * i.e. client code, will call on a concrete builder to execute the 
 * various steps required (often to assemble a 'composite' or complex 
 * object).  
 * </p>
 * <p>
 * Concrete builders may also have their own specific method to get the
 * end product but this will typically be called directly from the end 
 * client rather than the 'director'.  The director will typically get 
 * the builder passed into it on construction.
 * </p>
 * 
 */


public abstract class AbstractBuilder {
	
	public abstract void buildPartA();
	
	public abstract void buildPartB();
	
	public abstract void buildPartC();
}

