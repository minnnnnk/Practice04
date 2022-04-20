package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] nums = new double[5];
		double sum = 0;
		
		for (int i = 0; i<nums.length; i++) {
			nums [i] = sc.nextInt();
			sum = sum+nums[i];
			
		}
		System.out.println("평균은 " +(sum/nums.length)+ " 입니다.");
		
		
		
		
		sc.close();
	}

}
