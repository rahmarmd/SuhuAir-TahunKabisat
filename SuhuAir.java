/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasuss;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        /* Contoh pemakaian IF tiga kasus: Wujud Air */
        
        /*Kamus*/
        int T;
        
        /*Program*/
        System.out.println("Contoh If tiga kasus");
        System.out.print("Suhu (der. C) = ");
        
        //Scanner untuk masukkan suhu air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); //Masukkan suhu air dengan type int
        
        //Proses pengecekan dengan IF
        if (T < 0) {
            System.out.println("Wujud air beku " + T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Wujud air cair " + T);
        } else if (T > 100) {
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
