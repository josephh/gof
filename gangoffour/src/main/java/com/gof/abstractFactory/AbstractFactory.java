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
 * </P>
 * <P>
 * </P>
 * 
 * @author jobbingsjo
 * 
 */
public abstract class AbstractFactory {

	protected abstract AbstractProductA createProductA();

	protected abstract AbstractProductB createProductB();

	protected void whereabouts() {
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		if (ste.length > 0) {
			System.out.println("In method " + ste[0].getMethodName());
		}
	}
}
