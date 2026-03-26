package com.matrix;

import java.util.Arrays;
//import java.util.Iterator;

public class Matrix {

	public static void main(String[] args) {
		int row = 3;
		int col = 3;
		int [][] arr = new int[row][col];
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr);
			}
//			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
		

	}

}
