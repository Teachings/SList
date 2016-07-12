package com.mtcl.list;

/**
 * Created by mukul on 7/12/2016.
 */
public class SList {

	private SListNode firstNode, lastNode;
	private int size;

	public int getSize() {
		return size;
	}

	public SList(Object item) {
		firstNode = new SListNode(item);
		lastNode = firstNode;
		size = 1;
	}

	public SList addNode(Object item) {
		SListNode newNode = new SListNode(item);
		lastNode.setNext(newNode);
		lastNode = lastNode.getNext();
		this.size++;
		return this;
	}
	
	public void printList() {

		SListNode node = firstNode;

		while (node != null) {
			if (node == firstNode) {
				System.out.print("Contents of the SList are :: ");
			}
			System.out.print(node.getItem() + " ");
			node = node.getNext();
		}
		System.out.println("\nfirstNode :: " + firstNode.getItem());
		System.out.println("lastNode :: " + lastNode.getItem());
		System.out.println("size :: " + this.getSize());

	}

}
