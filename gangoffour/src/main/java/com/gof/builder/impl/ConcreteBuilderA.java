package com.gof.builder.impl;
/*
 * ConcreteBuilderA.java
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
import com.gof.builder.BuiltProduct;
import com.gof.builder.AbstractBuilder;
import java.util.Calendar;

public class ConcreteBuilderA extends AbstractBuilder{
	
	private BuiltProduct product;
	private Calendar now;
	
	public ConcreteBuilderA(){
		product = new BuiltProduct();
		now = Calendar.getInstance();
		}
	
	@Override
	public void buildPartA(){
		product.setFirst(String.valueOf(now.get(Calendar.WEEK_OF_YEAR)));
		}
	
	@Override
	public void buildPartB(){
		product.setSecond(String.valueOf(now.get(Calendar.DAY_OF_MONTH)));
		}
	
	@Override
	public void buildPartC(){
		product.setThird(String.valueOf(now.get(Calendar.ERA)));
		}
	
	public BuiltProduct getBuiltProduct (){
		return this.product;
		}
}

