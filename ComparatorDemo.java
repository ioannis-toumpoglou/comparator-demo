package java_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Implementation of a comparator to sort data according to string length
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if (len1 > len2) {
			return 1;
		}
		else if (len1 < len2) {
			return -1;
		}
		return 0;
	}
}

// Implementation of a comparator to sort data according to string length in reverse order
class ReverseStringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if (len1 < len2) {
			return 1;
		}
		else if (len1 > len2) {
			return -1;
		}
		return 0;
	}
}

// Implementation of an alphabetical comparator to sort data in alphabetical order
class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
	}
}

// Implementation of an alphabetical comparator to sort data in reverse alphabetical order
class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s2.compareTo(s1);
	}
}

public class ComparatorDemo {
	
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		
		animals.add("elephant");
		animals.add("cat");
		animals.add("kangaroo");
		animals.add("bird");
		animals.add("dog");
		animals.add("snake");
		
		System.out.println("No sorting");
		System.out.println("----------------");
		
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("\nString length sorting");
		System.out.println("----------------");
		
		Collections.sort(animals, new StringLengthComparator());
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("\nReverse String length sorting");
		System.out.println("----------------");
		
		Collections.sort(animals, new ReverseStringLengthComparator());
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("\nAlphabetical sorting");
		System.out.println("----------------");
		
		Collections.sort(animals, new AlphabeticalComparator());
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("\nReverse alphabetical sorting");
		System.out.println("----------------");
		
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		for (String animal : animals) {
			System.out.println(animal);
		}	
	}
	
}
