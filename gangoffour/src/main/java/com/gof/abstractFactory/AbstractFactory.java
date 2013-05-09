package com.gof.abstractFactory;

/**
 * <P>
 * The Abstract Factory pattern provides an, "...interface for creating families
 * of related or dependent objects without specifying their concrete classes."
 * </P>
 * <P>
 * The GoF textbook describes switching widget toolkits in a system to
 * illustrate use of this pattern. It is appropriate to support the following
 * aims or purposes,
 * <ol>
 * <li>de-couple a system from how its products are created, composed and
 * represented;</li>
 * <li>configure a system with <strong>one of multiple</strong> families of
 * products;</li>
 * <li>a family of related product objects is designed to be used together and
 * it is necessary to enforce this constraint;</li>
 * <li>provide a class library of products, only exposed via their interfaces</li>
 * </ol>
 * </P>
 * <P>
 * <b>Notes</b>
 * <ul>
 * <li>Typically one instance of each factory will be enough for an application.
 * </li>
 * <li>Each different product requires a new subclass - even if it only differs
 * very slightly from another class. This is typically achieved by delegating
 * responsibility for creating subclasses to individual factories. The net
 * result can be many factories. A different approach is to use the
 * {@link com.gof.Prototype} pattern.</li>
 * <li>An abstract factory that has dedicated methods for creating each product
 * is quite regid and requires a change each time a new product is introduced -
 * and all the classes that depend on it. "A more flexible but less safe design
 * is to add a parameter to operations that create objects". The lack of
 * certainty is because a client cannot know in advance which implementation of
 * an abstract type will provided.</li>
 * <li></li>
 * <li></li>
 * <li></li>
 * </ul>
 * </P>
 * <P>
 * </P>
 * 
 * @author jobbingsjo
 * 
 */
public abstract class AbstractFactory {

	public abstract AbstractProductA createProductA();

	public abstract AbstractProductB createProductB();

	protected void whereabouts() {
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		if (ste.length >= 1) {
			// get previous method on the stack
			System.out.println("In method " + ste[1].getMethodName());
		}
	}

}
