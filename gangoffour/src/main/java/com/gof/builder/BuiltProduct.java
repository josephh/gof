package com.gof.builder;
/*
 * BuiltProduct.java
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

public final class BuiltProduct {
	
	private String first;
	private String second;
	private String third;
			
	public void setFirst(String f){
		this.first = f;
		}
		
	public void setSecond(String s){
		this.second  = s;
		}
	
	public void setThird(String t){
		this.third= t;
		} 
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("Here's some textual "+ 
		" output intended to demonstrate the builder has done its "+
		"work...\n")
		.append("The first value is : " + this.first)
		.append("\nThe second value is : " + this.second)
		.append("\nThe third value is : " + this.third);
		return sb.toString();
		}
	
}

