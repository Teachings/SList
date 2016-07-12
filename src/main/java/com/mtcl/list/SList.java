package com.mtcl.list;

/**
 * Created by mukul on 7/12/2016.
 */
public class SList {

    private SListNode node;

    public SList(SListNode node) {
        this.node = node;
    }

    public void addNode(Object item) {
        // create a new node in the list.
        SListNode newNode = new SListNode(item);
        // find the last node in the list
        while (node != null) {
            node = node.getNext();
        }
    }
}
