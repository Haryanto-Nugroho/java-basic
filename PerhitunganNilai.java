/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhaary.program;

/**
 *
 * @author Haryanto
 */
public class PerhitunganNilai {
    String nama, nim;
    int kehadiran, tugas, uts, uas;
    double hasil;
    
    double hitungNilaiOOP() {
        hasil = (kehadiran * 0.1)+(tugas * 0.2)+(uts * 0.3)+(uas * 0.4);
        return hasil;
    }
    
    void showScore(double nilaiAkhir) {
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
