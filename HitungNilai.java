/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nhaary.program;

import java.util.Scanner;

/**
 *
 * @author Haryanto
 */
public class HitungNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nama, nim;
        int kehadiran, tugas, uts, uas;
        
        System.out.print("Masukan Nama Mahasiswa : ");
        nama = input.nextLine();
        System.out.print("Masukan NIM Mahasiswa : ");
        nim = input.nextLine();
        System.out.print("Masukan Nilai Kehadiran : ");
        kehadiran = input.nextInt();
        System.out.print("Masukan Nilai tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukan Nilai UTS : ");
        uts = input.nextInt();
        System.out.print("Masukan Nilai UAS : ");
        uas = input.nextInt();
        
        double nilaiAkhir = (kehadiran * 0.1)+(tugas * 0.2)+(uts * 0.3)+(uas * 0.4);

        System.out.println(" ");
        System.out.println("==============================");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("NIM Mahasiswa = " + nim);
        System.out.println("Nama Kehadiran = " + kehadiran);
        System.out.println("Nama Tugas = " + tugas);
        System.out.println("Nama UTS = " + uts);
        System.out.println("Nama UAS = " + uas);
        
        System.out.println(" ");
        System.out.println("==============================");
        System.out.println("Nilai Akhir Mahasiswa : " + nilaiAkhir);


        
    }
    
}
