package test;

import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����ڸ� �Է��� �ּ���! ");
		Scanner scan = new Scanner(System.in);	
		String operator = scan.next();
		int a =10;
		int b = 5;
		int c = 0;
		System.out.println(operator);
		switch (operator) {
		case "+":
			c = a + b;
			break;
		case "-":
			c = a - b;
			break;	
		case "*":
			c = a * b;
			break;	
		case "/":
			c = a / b;
			break;
		default:
			break;
		}
		
		System.out.println("�������� : "+ c);
	}

}
