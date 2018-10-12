/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul;

/**
 *
 * @author havis
 */
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.IIOException;
public class sccanner {
    public static void main(String[] args) {
        Double nilai1,nilai2,nilai3;
        Scanner X= new Scanner(System.in);
        try {
             System.out.print("masukkan nilai1 = ");
        nilai1= X.nextDouble();
        System.out.print("masukkan nilai2 = ");
        nilai2=X.nextDouble();
        System.out.print("masukkan nilai = ");
        nilai3= X.nextDouble();
        double Rata_rata = (nilai1+nilai2+nilai3)/3;
            System.out.println("Rata-rata = "+ Rata_rata);
        } catch (Exception e) {
            System.out.println("jangan masukkan selain angka");
        }
        
        
        
    }
    
}
