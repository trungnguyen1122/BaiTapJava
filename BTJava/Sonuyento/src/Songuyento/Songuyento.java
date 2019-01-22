
package Songuyento;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Songuyento {
  
           
 
    public static boolean Songuyento(int n) {
       
        int squareRoot = (int) sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t___BT Số nguyên tố___");
        System.out.print("Xin mời nhập n = ");
        int n = scanner.nextInt();
        if(n<2){
             System.out.println("Không có số nguyên tố nào.");
        }else
        {
        System.out.println("Tất cả các số nguyên tố nhỏ hơn "+ n + " là: ");
        System.out.print(2);
        for (int i = 3; i < n; i++) {
            if (Songuyento(i)) {
                System.out.print(" " + i);
            }
            }
        }
    }

    
}

    

