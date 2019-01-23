/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysofibonacci;

import java.util.Scanner;

/**
 *
 * @author TrungNguyen
 */
public class daysofibonacci {
	
	private static int fibonacci(int n) {
		int f0 = 0, f1 = 1, fn = 1;
		if(n<0) {
			return n;
		}else if((n==0)||(n==1)) {
			return n;
		}else {
			while(fn<n) {
				f0 = f1;
				f1 = fn;
				fn = f0 + f1;
			}
		}
		return fn;
	}

	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\t___Tổng dãy số Fibonacci ___");
            System.out.print("Xin mời nhập n: ");
            int n = scanner.nextInt();
            System.out.println("10 số đầu tiên trong dãy Fibonacci:");
            for(int i=0; i<n; i++) {
              
		System.out.print((fibonacci(i))+"\t");
                
		}
	}

}