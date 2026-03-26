package com.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Diagonal_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 3;
		int col = 3;
		int[][] arr = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter the " + i + "," + j + " element");
				arr[i][j] = sc.nextInt();
				if (i == j) {
					System.out.println(arr[i][j]);
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");

		}

	}
}
