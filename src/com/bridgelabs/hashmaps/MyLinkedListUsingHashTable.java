package com.bridgelabs.hashmaps;
import java.util.ArrayList;

public class MyLinkedListUsingHashTable <K,V> {

	private final int numBuckets;
	ArrayList<MyLinkedListHashMap<K>> myBucketArray;
	
	public MyLinkedListUsingHashTable() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);
		
		for(int i=0;i<numBuckets;i++) {
			this.myBucketArray.add(null);
		}
	}

	public void add(K key,V value) {
		int index = this.getBucketIndex(key);
		MyLinkedListHashMap<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedListHashMap<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		MyMapNode<K,V> mymapnode = (MyMapNode<K,V>) myLinkedList.search(key);
		if (mymapnode == null) {
			mymapnode = new MyMapNode<>(key, value);
			myLinkedList.append(mymapnode);
		}
		else {
			mymapnode.setValue(value);
		}
	}
	

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		//System.out.println("Key: " +key+ " hashcode: " +hashCode+ " index: " +index);
		return index;
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedListHashMap<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			return null;
		}
		MyMapNode<K,V> mymapnode = (MyMapNode<K,V>) myLinkedList.search(key);
		return (mymapnode == null) ? null : mymapnode.getValue();
		
	}
	
	@Override
	public String toString() {
		return "MyLinkedHashMap List {" +myBucketArray+ "}";
	}

	
	
}
