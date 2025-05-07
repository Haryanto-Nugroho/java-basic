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
public class NilaiMahasiswa2 {

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
       
       if(nilai >= 80) {
           System.out.println("Nilai " + nama + " : ");
            System.out.println("   ###   ");
            System.out.println("  #   #  ");
            System.out.println(" #     # ");
            System.out.println(" ####### ");
            System.out.println(" #     # ");
            System.out.println(" #     # ");
            System.out.println(" #     # ");
       } else if (nilai >= 70){
           System.out.println("Nilai " + nama + " : ");
            System.out.println("#########");
            System.out.println("#        #");
            System.out.println("#        #");
            System.out.println("########");
            System.out.println("#        #");
            System.out.println("#        #");
            System.out.println("#########");
       } else if (nilai >= 60){
           System.out.println("Nilai " + nama + " : ");
            System.out.println("   ########");
            System.out.println(" #         ");
            System.out.println("#          ");
            System.out.println("#          ");
            System.out.println("#          ");
            System.out.println(" #         ");
            System.out.println("   ########");
       } else if (nilai >= 50) {
           System.out.println("Nilai " + nama + " : ");
            System.out.println("######## ");
            System.out.println("#        #");
            System.out.println("#         #");
            System.out.println("#         #");
            System.out.println("#         #");
            System.out.println("#        #");
            System.out.println("######## ");
       } else {
           System.out.println("Nilai " + nama + " : ");
            System.out.println("#########");
            System.out.println("#        ");
            System.out.println("#        ");
            System.out.println("#########");
            System.out.println("#        ");
            System.out.println("#        ");
            System.out.println("#########");
       }
    }
    
}
