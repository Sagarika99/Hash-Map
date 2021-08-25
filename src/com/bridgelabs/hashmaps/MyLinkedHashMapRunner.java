package com.bridgelabs.hashmaps;

public class MyLinkedHashMapRunner {

	public static void main(String[] args) {
		String paragraph = "Paranoids are not paranoid because they are paranoid but because" 
							+ " they keep putting themselves deliberately into paranoid avoidable situations";
		
		MyLinkedListUsingHashTable<String, Integer> myLinkedHashMap = new MyLinkedListUsingHashTable<>();
		
		String[] words = paragraph.toLowerCase().split(" ");
		for(String word : words) {
			Integer value =	myLinkedHashMap.get(word);
			if (value == null) {
				value = 1;
			}
			else {
				value = value +1;
			}
			myLinkedHashMap.add(word, value);
		}
		System.out.println(myLinkedHashMap.get("paranoid"));
		System.out.println(myLinkedHashMap);

	}
	
}
