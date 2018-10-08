package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Scanner inputan = new Scanner(System.in);
	   Kalkulator kalkulasi = new Kalkulator();

	   System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukan Bilangan ke-1\t: ");
        kalkulasi.value1 = inputan.nextDouble();

        System.out.print("Masukan Bilangan ke-2\t: ");
        kalkulasi.value2 = inputan.nextDouble();

        System.out.println("");

        System.out.println("Hasil Pertambahan\t: "+kalkulasi.tambahBilangan());
        System.out.println("Hasil Pengurangan\t: "+kalkulasi.kurangBilangan());
        System.out.println("Hasil Perkalian\t: "+kalkulasi.kaliBilangan());
        System.out.println("Hasil Pembagian\t: "+kalkulasi.bagiBilangan());
        System.out.println("Sisa Hasil\t: "+kalkulasi.sisaBilangan());
    }
}
