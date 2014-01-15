package com.gof;

/*
 * Main.java
 * 
 * Copyright 2013 britford <britford@joe>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import com.gof.creational.factoryMethod.client.CreatorWithConcreteFactoryMethod;
import com.gof.creational.factoryMethod.thingy.SomeAbstractObject;
import com.gof.creational.prototype.Prototype;
import com.gof.creational.prototype.impl.ConcretePrototype1;
import com.gof.creational.prototype.impl.ConcretePrototype2;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import com.gof.creational.builder.BuilderClient;
import com.gof.structural.adapter.client.AdapterClient;

public class Main {
	
	public static void main (String args[]) {
				
		System.out.println("In main...");
				
		AdapterClient.main(new String[0]);
		
		//SomeAbstractObject someObject  = 
			//(new CreatorWithConcreteFactoryMethod()).createSomeObject();
		
		//someObject.printYourName();
		
		//Prototype p = new ConcretePrototype1();
		//Prototype q = new ConcretePrototype2();
		
		//List<Prototype> prototypes = new ArrayList<Prototype> ();
		
		//for(int i = 0 ; i < 10; i++ ){
			//prototypes.add(p.clone());
			//prototypes.add(q.clone());
		//}
		
		//System.out.println("Show what a clone looks like > ");
		//int i = new Random().nextInt(10);
		//prototypes.get(i).toString();
		
		//System.out.println("Show what another one looks like > ");
		//i = new Random().nextInt(10);
		//prototypes.get(i).toString();
				
		
	}
}

