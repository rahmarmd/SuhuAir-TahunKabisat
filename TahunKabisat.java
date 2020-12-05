/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasuss;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Tahun Kabisat");
        System.out.println("-------------------------------------------------");
        System.out.println("Silahkan masukkan tahun");
        int Thn = input.nextInt();
        if ((Thn % 4 == 0 && Thn % 100 != 0) ||  Thn % 400 == 0){
            System.out.println(Thn + " adalah tahun Kabisat");
        }
        else{
        System.out.println(Thn + " adalah bukan tahun KABISAT");
        }
    }
}

