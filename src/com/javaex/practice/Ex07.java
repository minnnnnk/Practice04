package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] wonArray = new int[10] ;
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		
		System.out.print("금액: ");
		int money = sc.nextInt();
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int sum = money;
		
		while (true) {
			if (sum>=wonArray[0]) {
				count0++;
				sum = sum-wonArray[0];
			} else if (sum>=wonArray[1]) {
				count1++;
				sum = sum-wonArray[1];
			} else if (sum>=wonArray[2]) {
				count2++;
				sum = sum-wonArray[2];
			} else if (sum>=wonArray[3]) {
				count3++;
				sum = sum-wonArray[3];
			} else if (sum>=wonArray[4]) {
				count4++;
				sum = sum-wonArray[4];
			} else if (sum>=wonArray[5]) {
				count5++;
				sum = sum-wonArray[5];
			} else if (sum>=wonArray[6]) {
				count6++;
				sum = sum-wonArray[6];
			} else if (sum>=wonArray[7]) {
				count7++;
				sum = sum-wonArray[7];
			} else if (sum>=wonArray[8]) {
				count8++;
				sum = sum-wonArray[8];
			} else if (sum>=wonArray[9]) {
				count9++;
				sum = sum-wonArray[9];
			} else {
				break;
			}
		}
	
		
		System.out.println("50000원: "+count0+ "개");
		System.out.println("10000원: "+count1+ "개");
		System.out.println("5000원: "+count2+ "개");
		System.out.println("1000원: "+count3+ "개");
		System.out.println("500원: "+count4+ "개");
		System.out.println("100원: "+count5+ "개");
		System.out.println("50원: "+count6+ "개");
		System.out.println("10원: "+count7+ "개");
		System.out.println("5원: "+count8+ "개");
		System.out.println("1원: "+count9+ "개");
		
		sc.close();
	}

}
