//Author: Bhagyashree Mulage

package com.question1;

import java.util.Scanner;
public class TransposeMatrix {


		public static void main(String[] args) {
			
			
			int i,j,m,n;

		    Scanner in = new Scanner(System.in);
		    System.out.println("Enter the number of rows and columns of matrix");
		    m = in.nextInt();
		    n = in.nextInt();

		    int matrix[][] = new int[m][n];

		    System.out.println("Enter elements of the matrix");

		    for (i = 0; i < m; i++)
		      for (j = 0; j < n; j++)
		        matrix[i][j] = in.nextInt();

		    int transpose[][] = new int[n][m];

		    for (i = 0; i < m; i++)
		      for (j = 0; j < n; j++)
		        transpose[i][j] = matrix[i][j];

		    System.out.println("Transpose of the matrix:");

		    for (i = 0; i < m; i++)
		    {
		      for (j = 0; j < n; j++)
		        System.out.print(transpose[i][j]+"\t");

		      System.out.print("\n");
		    }
	}
	}
