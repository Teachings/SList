package com.mtcl.list;

import org.junit.Before;
import org.junit.Test;

public class SListNodeTest {

	SListNode sListNode0;

	@Before
	public void setUp() throws Exception {
		sListNode0 = new SListNode(1);
	}

	@Test
	public void test() {
		SListNode sListNode1 = new SListNode(2);
		sListNode0.setNext(sListNode1);

	}

}
