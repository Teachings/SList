package com.mtcl.list;

public class SListNode {

    private Object item;
    private SListNode next;

    public SListNode() {
    }

    public SListNode(Object item) {
        this.item = item;
        this.next = null;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public SListNode getNext() {
        return next;
    }

    public void setNext(SListNode next) {
        this.next = next;
    }

}
