/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Haryanto
 */
public class MenuMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int input = 0;
        
        while(input != 4) {
            System.out.println("====== Menu Makanan ======");
            System.out.println("1. Ayam Geprek");
            System.out.println("2. Ayam Bakar Kecap");
            System.out.println("3. Ikan Bakar");
            System.out.println("4. Quit");
            
            System.out.print("Pilih Menu (Masukan Angka) : ");
            
            input = scan.nextInt();
            
            if(input == 1){
                System.out.println("");
                System.out.println("Kamu memilih Ayam Geprek!!");  
                System.out.println("");
                System.out.println("==========================");
            } else if (input == 2) {
                System.out.println("");
                System.out.println("Kamu memilih Ayam Bakar Kecap!!");
                System.out.println("");
                System.out.println("==========================");
            } else if (input == 3) {
                System.out.println("");
                System.out.println("Kamu memilih Ikan Bakar!!");
                System.out.println("");
                System.out.println("==========================");
            } else if (input == 4) {
                System.out.println("");
                System.out.println("BYE!!..");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("Yang Kamu plih tidak ada!! ");
                System.out.println("");
                System.out.println("==========================");
            }

        }
    }
    
}
