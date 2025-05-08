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
public class NilaiMahasiswaOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        PerhitunganNilai nilai = new PerhitunganNilai();
        
        System.out.print("Masukan Nama Mahasiswa : ");
        nilai.nama = scan.nextLine();
        System.out.print("Masukan NIM Mahasiswa : ");
        nilai.nim = scan.nextLine();
        System.out.print("Masukan Nilai Kehadiran : ");
        nilai.kehadiran = scan.nextInt();
        System.out.print("Masukan Nilai tugas : ");
        nilai.tugas = scan.nextInt();
        System.out.print("Masukan Nilai UTS : ");
        nilai.uts = scan.nextInt();
        System.out.print("Masukan Nilai UAS : ");
        nilai.uas = scan.nextInt();
        
        double nilaiAkhir = nilai.hitungNilaiOOP();
        
        nilai.showScore(nilaiAkhir);
    }
    
}
