package com.bridgelabs.hashmaps;

public class MyHashMap<K,V> {

	MyLinkedListHashMap<K> mylinkedlisthashmap;
	
	public MyHashMap() {
		this.mylinkedlisthashmap = new MyLinkedListHashMap<>();
	}

	public V get(K key) {
		MyMapNode<K,V> mymapnode = (MyMapNode<K,V>) this.mylinkedlisthashmap.search(key);
		return (mymapnode == null) ? null : mymapnode.getValue();

	}

	public void add(K key, V value) {
		MyMapNode<K,V> mymapnode = (MyMapNode<K,V>) this.mylinkedlisthashmap.search(key);
		if (mymapnode == null) {
			mymapnode = new MyMapNode<>(key, value);
			this.mylinkedlisthashmap.append(mymapnode);
		}
		else {
			mymapnode.setValue(value);
		}
	}
	
	@Override
	public String toString() {
		return "MyHashMapNodes {" +mylinkedlisthashmap+ "}";
	}
}
