package com.bridgelabs.hashmaps;

public class MyMapNode<K,V> implements INode <K> {
	private K key;
	private V value;
	MyMapNode<K,V> next;
	
	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public INode getNext() {
		return next;
	}

	@Override
	public void setNext(INode next) {
		this.next = (MyMapNode<K,V>) next;
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("My Map Node { K=").append(key).append(" V= ").append(value).append("}");
		if (next != null) {
			myMapNodeString.append("-->").append(next);
		}
		return myMapNodeString.toString();
	}
}
