package com.matrix;

import java.util.Scanner;

public class Add_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][2];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter the " + i + "," + j + " element");
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];

			}
		}
		System.out.println(sum);
	}
}
