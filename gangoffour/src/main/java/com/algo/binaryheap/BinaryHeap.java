package com.algo.binaryheap;

/**
 * Binary heap implementation. Particularly useful when fast access is needed to
 * the lowest value in an array.
 * <P>
 * The structure is a semi-sorted array of elements navigated like a tree. The
 * top of 'heap' is considered to be array index position 0. The bottom of the
 * heap is array index [array.length].
 * </P>
 * <P>
 * When a new element is added, it goes onto the <i>bottom</i> of the heap,
 * (i.e. the end of the array) and a sort (a <i>bubble</i>) then occurs.
 * Similarly, when the first (and smallest) element is removed from the tree,
 * the top element is then moved to the <i>bottom</i> of the heap and a sort
 * then occurs (a <i>bubble up</i>).
 * </P>
 * <P>
 * The <strong>salient</strong> feature of the binary heap is that, when
 * sorting, a relatively small number of comparisons need to be made to shuffle
 * elements to their correct position quickly. Two elements are compared and the
 * smallest value remains highest - or is moved higher - in the tree, by
 * swapping the compared elements. The elements that are compared with each
 * other are those with a relationship based on their position in an array
 * structure. (Since this structure models a tree, each node has 0, 1 or 2
 * branches; a node at level <i>n</i> with 2 branches will have children at
 * levels (<i>n</i> * 2) and (<i>n</i> * 2 + 1)).
 * </P>
 * 
 * @author jobbingsjo
 * 
 */
public final class BinaryHeap {

	// the heap! initialised to size 0
	private Object[] elements = new Object[0];

	// supply the default no args - to prevent unwanted use...
	private BinaryHeap() {
		throw new IllegalAccessError(
				"You are not allowed to use the default no args constructor from anywhere, including from inside this class!");
	}

	/**
	 * provide a constructor that takes an array of objects and does the initial
	 * sort
	 * 
	 * @param chars
	 */
	public BinaryHeap(Object[] arg) {

		if (null == arg || 0 == arg.length)
			throw new IllegalArgumentException(
					"You can't instantiate one of these "
							+ this.getClass().getName()
							+ " objects without at least one item to store.  "
							+ "Come back when you are ready.");

		// do the initial sort, adding each item to the array one at a time...
		for (Object o : arg) {
			push(o);
		}

	}

	/**
	 * Copy the array of elements into another array that is one element longer.
	 * Assign this new array to the instance variable that stores the heap.
	 */
	private void grow() {
		Object[] biggerArray = new Object[this.elements.length + 1];
		System.arraycopy(this.elements, 0, biggerArray, 0, this.elements.length);
		this.elements = biggerArray;
	}

	/**
	 * Copy the array of elements into another array that is one element
	 * shorter. Assign this new array to the instance variable that stores the
	 * heap.
	 */
	private void shrink() {
		Object[] smallerArray = new Object[this.elements.length - 1];
		System.arraycopy(this.elements, 0, smallerArray, 0,
				this.elements.length - 1);
		this.elements = smallerArray;
	}

	/**
	 * Remove and return the first (and smallest) element from the root of the
	 * tree (bottom of the heap). Then move the element from the top of the heap
	 * (i.e. the last element) to the bottom of the heap and sort it.
	 */
	public Object pop() {
		if (this.elements.length == 0)
			throw new IllegalAccessError(
					"You are trying to pop an element off an empty heap");

		Object smallest = this.elements[0];

		if (this.elements.length == 1) {
			shrink();
		} else {
			Object last = this.elements[this.elements.length - 1];
			this.elements[0] = last;
			shrink();
			last = null;
			sink(0);
		}

		return smallest;

	}

	/**
	 * Put a new element on top of the heap and sort it.
	 */
	public void push(Object o) {
		grow();
		this.elements[this.elements.length - 1] = o;
		bubble(this.elements.length - 1);
	}

	/**
	 * 'sink' the new element moved to the top of the heap (i.e. array index
	 * position 0). Note the tree is expressed in terms of levels beginning at
	 * 1.
	 */
	private void sink(int arrayPos) {

		// one item in the array
		if (this.elements.length == 1)
			return;

		// last item in the array
		if (arrayPos == this.elements.length - 1)
			return;

		// zero children
		if (arrayPos * 2 >= this.elements.length
				|| arrayPos * 2 + 1 >= this.elements.length)
			return;

		int parentLevel = arrayPos + 1;
		int childLevel = parentLevel * 2;

		Object parent = this.elements[arrayPos];
		Object child = this.elements[childLevel - 1];

		// try the first child (i.e. n * 2)
		if (greaterThan(parent, child)) {
			// swap
			this.elements[childLevel - 1] = parent;
			this.elements[arrayPos] = child;
			sink(childLevel - 1);
		} else {
			// try the other child (i.e. n * 2 + 1)
			child = this.elements[childLevel];
			if (greaterThan(parent, child)) {
				// swap
				this.elements[childLevel] = parent;
				this.elements[arrayPos] = child;
				sink(childLevel);
			}
		}

	}

	/**
	 * Bubble up the element added on the bottom of the heap (the last item in
	 * the array).
	 * <P>
	 * Don't forget that an element can't go higher than level 1.
	 */
	private void bubble(int arrayPos) throws IllegalArgumentException {

		if (arrayPos < 0) {
			throw new IllegalArgumentException(
					"Array index parameter value cannot be less than 0.");
		}

		if (arrayPos == 0 || this.elements.length == 1)
			return;

		int childLevel = arrayPos + 1;
		int parentLevel = (int) Math.floor(childLevel / 2);

		Object child = this.elements[arrayPos];
		Object parent = this.elements[parentLevel - 1];
		if (greaterThan(parent, child)) {
			// swap
			this.elements[arrayPos] = parent;
			this.elements[parentLevel - 1] = child;
			bubble(parentLevel - 1);
		}
	}

	/**
	 * 
	 * @param a
	 *            the Object in the heap being sorted
	 * @param b
	 *            the Object in the heap being compared against
	 * @return true if a is greater than b (based on rudimentary efforts to
	 *         compare in the absence of known type)
	 */
	private boolean greaterThan(Object a, Object b) {
		// a number?
		try {
			Integer intA = (Integer) a;
			Integer intB = (Integer) b;
			return intA.intValue() > intB.intValue();
		} catch (ClassCastException cce) {
			System.out
					.println("This element not happy about a cast to Integer");
		}
		// alpha numeric?
		try {
			String strA = (String) a;
			String strB = (String) b;
			return strA.compareTo(strB) > 0 ? true : false;
		} catch (ClassCastException cce) {
			System.out.println("This element not happy about a cast to String");
		}
		// anything else don't bother trying to sort...
		return false;
	}

}