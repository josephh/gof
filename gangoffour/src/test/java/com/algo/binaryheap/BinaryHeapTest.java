package com.algo.binaryheap;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

public class BinaryHeapTest {

	@Test
	public void constructorSort() {
		//@formatter:off
		/* for the tree
		        4
		  7           9
	 12  25           13  24
 81 92	79 78     80 81  80 80
 */
		//@formatter:on
		Integer[] in = { 4, 7, 9, 12, 25, 13, 24, 81, 92, 79, 78, 80, 81, 80,
				80 };
		// we can do this because arrays are covariant...
		// new up a BinaryHeap
		BinaryHeap h = new BinaryHeap(in);
		// check the first 3 pops...
		Assert.assertThat(h.pop(), new IsEqual<Object>(new Integer(4)));
		Assert.assertThat(h.pop(), new IsEqual<Object>(new Integer(7)));
		Assert.assertThat(h.pop(), new IsEqual<Object>(new Integer(9)));

	}

	@Test
	public void initialSort() {
	}

	@Test
	public void pop() {
	}

	@Test
	public void push() {
	}

}
