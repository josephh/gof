package com.gof.prototype;

/**
 * <p>
 * Class kicking-off prototype pattern-related classes.
 * </p>
 * <p>
 * The prototype pattern intends to address this problem:
 * we want to avoid lots of specialized sub-classing - and composition 
 * is one way to achieve that; but how can we use composition to 
 * parameterize instances of a class that belongs to a framework in 
 * order to use the framework class to instantiate and deal with classes
 * that are specific to our own application?
 * </p>
 * <p>
 * The solution is have a number of prototypical classes and cloning 
 * each of these when we need a new one...if all classes support a Clone
 * operation, then the external framework class can clone any of the 
 * objects that are handed to it (or that it knows about somehow).
 * </p>
 * <p>
 * This pattern is applicable, "...when a system should be independent 
 * of how its products are created, composed and represented...and..."
 * </p>
 * <p>
 * <strong>Note, Java's Cloneable interface is a dodgy one and should be
 * employed judiciously.  It DOES NOT advertise behaviour, it's used to 
 * override the protected #clone() on java.lang.Object.  And the effect
 * is <i>extra-linguistic</i> - it creates an object without calling a 
 * constructor.  Given that, "...if you override #clone() in a nonfinal 
 * class, you should return an object obtained by invoking 
 * super#clone..."; then implementing a properly functioning public
 * #clone() method is very difficult unless every superclass in an
 * object's hierarchy has also provided a properly functioning clone 
 * method.</strong>
 * </p>
 */
public abstract class Prototype implements Cloneable{
	
	public Prototype clone();

}
