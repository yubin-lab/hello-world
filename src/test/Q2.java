package test;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		System.out.println("홀수 값을 입력해 주세요.");
		Scanner scan = new Scanner(System.in);
		int lineCnt = scan.nextInt();
		int star = lineCnt / 2 + 1;
		for (int i = 0; i < lineCnt; i++) {
			 if(i < star) {
				 for(int j = 0; j < lineCnt-i; j++) {
					 System.out.print(" ");
				 }
				 for(int j = 0; j < 2*i+1; j++) {
					 System.out.print("*");
				 }
			 }else {
				 for(int j = 0; j < i+1; j++) {
					 System.out.print(" ");
				 }
				 int z = lineCnt -(i+1);
				 for(int j = 1; j <= 2*z+1; j++) {
					 System.out.print("*");
				 }
			 }
			System.out.println(" ");
		}

	}
}
