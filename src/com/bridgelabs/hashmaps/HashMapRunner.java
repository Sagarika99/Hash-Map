package com.bridgelabs.hashmaps;

public class HashMapRunner {
	public static void main(String[] args) {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myhashmap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value =	myhashmap.get(word);
			if (value == null) {
				value = 1;
			}
			else {
				value = value +1;
			}
			myhashmap.add(word, value);
		}
		System.out.println(myhashmap.get("to"));
		System.out.println(myhashmap);

	}
}