
package hitung0201;

import java.util.Scanner;
public class Hitung0201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilaimil;
        double nilaim;
        System.out.print("masukkan Mil =");
       nilaimil = input.nextDouble();
       
       nilaim = nilaimil*1.609;
        
       System.out.println( "hasil= mil " +nilaim );
        
        
    }
    
}
