package com.strings;

public class Example1 {

	public static void main(String[] args) {
		String str = "ABCDEFGH";
		for (int i=0; i<=str.length();i++) {
//			System.out.println("----------------------------");
			for(int j=i+1;j<=str.length();j++) {
				
				String st = str.substring(i,j);
				if(st.length()==4) {
					System.out.println(st);
					System.out.println();
				}
			}
		}
				

	}

}
