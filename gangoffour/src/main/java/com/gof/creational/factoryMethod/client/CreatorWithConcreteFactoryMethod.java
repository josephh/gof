package com.gof.creational.factoryMethod.client;

import com.gof.creational.factoryMethod.CreatorWithAbstractFactoryMethod;
import com.gof.creational.factoryMethod.thingy.SomeAbstractObject;
import com.gof.creational.factoryMethod.thingy.SomeJoeObject;
import com.gof.creational.factoryMethod.thingy.SomeJackObject;

import java.util.Random;

public class CreatorWithConcreteFactoryMethod extends CreatorWithAbstractFactoryMethod {
	
	public CreatorWithConcreteFactoryMethod() {
				
		System.out.println("In CreatorWithConcreteFactoryMethod's constructor");
						
	}
	
	public SomeAbstractObject createSomeObject(){
		Random r = new Random();
		int i = r.nextInt();
		System.out.println("Next random int, " + i);
		if(i  % 2 == 0){
			return new SomeJackObject();
		}
		else{
			return new SomeJoeObject();
		}
	}
	
}

