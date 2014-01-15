package com.gof.structural.adapter.client;
/**
 * AdapterClient.java
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
import com.gof.structural.adapter.ObjectAdapter;
import com.gof.structural.adapter.ClassAdapter;
import com.gof.structural.adapter.TheInterfaceTheClientKnowsAbout;

public class AdapterClient {
	
	public static void main (String args[]) {
		
		/**
		 * try out the object version of the adapter pattern...
		 */
		TheInterfaceTheClientKnowsAbout candidate = null;
		int i = 12;
		candidate = new ObjectAdapter();
		System.out.println(candidate.anAccessibleMethod(12));
		
		candidate = new ClassAdapter();
		System.out.println(candidate.anAccessibleMethod(23));
	}
}

