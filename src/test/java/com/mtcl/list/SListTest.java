package com.mtcl.list;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mukul on 7/12/2016.
 */
public class SListTest {

    SListNode node;
    SList list;


    @Before
    public void setUp() throws Exception {
        list = new SList(1);
        list.addNode(2).addNode(3).addNode(4).addNode(5);
    }

    @Test
    public void addNode() throws Exception {

    }

    @Test
    public void printList() throws Exception {
        list.printList();
    }

}