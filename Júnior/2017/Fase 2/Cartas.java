package controller;

import java.util.Scanner;

public class Cartas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d;
		
		if(a == b){
			d = c ;
			System.out.println(d);
		}else if(a == c){
			d = b ;
			System.out.println(d);
		}else{
			d = a;
			System.out.println(d);
		}

	}

}
