//Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
//Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1

package Domaci0312;

import java.util.Scanner;

public class Faktorijel {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite neki broj: ");

        int broj = s.nextInt();
        int faktorijel = 1;

        for(int i = 1; i <= broj; i++){
            faktorijel = faktorijel * i;
        }
        System.out.println("Faktorijel tog broja je " + faktorijel );

    }
}

