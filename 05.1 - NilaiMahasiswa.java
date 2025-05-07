/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nhaary.program;

/**
 *
 * @author Haryanto
 */

import java.util.*;
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int nilai;
        
        
       Scanner masukan = new Scanner(System.in);
       
       System.out.print("Masukan Nama : ");
       nama = masukan.nextLine();
       System.out.print("Masukan Nilai : ");
       nilai = masukan.nextInt();
       
       if(nilai > 60) {
           System.out.println("==============================");
           System.out.println("Mahasiswa dengan nama " + nama);
           System.out.println("Dinyatakan Lulus");
           System.out.println("==============================");
       } else {
           System.out.println("==============================");
           System.out.println("Mahasiswa dengan nama " + nama);
           System.out.println("Dinyatakan Tidak Lulus");
           System.out.println("==============================");
       }
    }
    
}
