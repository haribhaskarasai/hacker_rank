package com.doubleonmatch;

import java.util.Arrays;


import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DoubleOnMatch {
	public static long makedouble(long[] array, int key) {
//		Arrays.sort(array);
//		for(int i=0;i<array.length;i++) {
//			if(array[i]==key) {
//				key=key*2;
//			}
//		}
		for(int i=0;i<array.length;i++) {
		return key;
		}
		System.out.println("pora swami");
		return key;
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the key :");
//		int key = scanner.nextInt();
//		System.out.println("enter size of array :");
//		int n = scanner.nextInt();
		long[] array = new long[5];
		array[0]=1;
//		System.out.println("enter the array :");
//		for (int i = 0; i < n; i++) {
//			array[i] = scanner.nextLong();
//			
//		}
//		scanner.close();
		long result = makedouble(array, 2);
		System.out.println("result is :"+result);
	}

}
