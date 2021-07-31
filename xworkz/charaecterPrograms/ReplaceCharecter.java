package com.xworkz.charaecterPrograms;

public class ReplaceCharecter {

	public static void main(String[] args) {
		String s1 = "javatpoint is a very good website";
		String replaceString = s1.replaceAll("a", "e");
		System.out.println(replaceString);
		String replaceString1 = s1.replace('a', 'e');
		System.out.println(replaceString1);

	}

}
