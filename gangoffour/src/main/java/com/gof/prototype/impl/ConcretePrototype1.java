package com.gof.prototype.impl;
/*
 * ConcreteProtoype1.java
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
import java.lang.Override;
import java.lang.StringBuffer;
import com.gof.prototype.Prototype;

public class ConcretePrototype1 extends Prototype {
	
	public static void main (String args[]) {
		
	}
	
	private final int firstInt = 8;
	private final int secondInt = 16;
	private final int thirdInt = 32;
	
	private final String s = "s";
	private final String t = "t";
	private final String u = "u";
		
	@Override
	public Prototype clone(){
		return this.clone();
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Variable firstInt, value : " + firstInt + "\n");
		sb.append("Variable secondInt, value : " + secondInt + "\n");
		sb.append("Variable thirdInt, value : " + thirdInt + "\n");
	
		sb.append("Variable s, value : " + s + "\n");
		sb.append("Variable t, value : " + t + "\n");
		sb.append("Variable u, value : " + u + "\n");
	
	    return sb.toString();		
	}
}

