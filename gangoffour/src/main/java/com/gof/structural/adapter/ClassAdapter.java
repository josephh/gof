package com.gof.structural.adapter;
/**
 * Adapter.java
 * 
 * Copyright 2013 britford <britford@joe>
 * 
 * This pattern's intent is to let classes work together that otherwise
 * can't because of incompatible interfaces.
 * <ol>To get different classes working together, an adapter is provided 
 * in the middle: this might mean,
 * <li>inherit both implementations of the 2 different types (the 
 * <strong>class</strong> version of the adapter pattern)</li>
 * <li>compose one instance inside the other and implement the 
 * container object in terms of the interface of the contained object (the 
 * <strong>object</strong> version of the adapter pattern)</li>
 * </ol>
 *
 */
 import com.gof.structural.adapter.objectAdapter.ObjectAdaptee;
 import com.gof.structural.adapter.objectAdapter.TheInterfaceTheClientDoesNotKnowAbout;
 import com.gof.structural.adapter.classAdapter.TheInterfaceTheClientDoesKnowAbout;


public class ClassAdapter implements TheInterfaceTheClientDoesKnowAbout, TheInterfaceTheClientDoesNotKnowAbout {
	
	/**
	 * Default no args constructor
	 */
	public Adapter(){
		// nothing doing here
		}
	
	@Override
	public String anAccessibleMethod(Integer i){
		return "";
	}
	
	@Override
	public String anAccessibleMethod(Long l){
		return "";
	}
	
}

