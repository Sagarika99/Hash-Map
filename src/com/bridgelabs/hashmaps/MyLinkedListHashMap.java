package com.bridgelabs.hashmaps;

public class MyLinkedListHashMap <K> {

	private INode head;
	private INode tail;
	
	public MyLinkedListHashMap(){
		this.head=null;
		this.tail=null;
	}
	
	public void add(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} 
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}		
	}
	
	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public INode search(K key) {
		INode tempNode = this.head;
		while (tempNode != null) {
			if(tempNode.getKey().equals((K)key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public void printLinkedList() {
		StringBuffer printformat = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode != null) {
			printformat.append(tempNode.getKey());
			if (tempNode != tail) {
				printformat.append("-->");
			}
			tempNode = tempNode.getNext();
		}
		System.out.println(printformat);
	}
	
	@Override
	public String toString() {
		return "MyLinkedListNodes {" +head+ "}";
	}
}
