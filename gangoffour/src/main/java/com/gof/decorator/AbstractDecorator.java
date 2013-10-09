package com.gof.decorator;
/**
 * <p>IT'S A WRAPPER!!!</p>
 * <p>Use this pattern to to extend functionality without sub-classing.
 * </p>
 * <p>Achieve this by enclosing one component in another component that
 * provides the behaviour or property.</p>
 * <p>By conforming to the interface of the component it 'decorates', the 
 * decorator is essentially invisible.</p>
 * <p></p>
 * <p></p>
 * 
 * 
 */
  
public abstract class AbstractDecorator {
	
	public abstract void doSomethingWithANumber();
}

