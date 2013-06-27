package com.gof.factoryMethod.client;

import com.gof.factoryMethod.CreatorWithAbstractFactoryMethod;

public class CreatorWithConcreteFactoryMethod extends CreatorWithAbstractFactoryMethod {
	
	public CreatorWithConcreteFactoryMethod() {
				
		System.out.println("In CreatorWithConcreteFactoryMethod's constructor");
						
	}
	
	public SomeObject createSomeObject(){
		int random = java.util.Random.nextInt();
		if(random % 2 == 0){
			return new SomeJackObject();
		}
		else{
			return new SomeJackObject();
		}
	}
	
}

