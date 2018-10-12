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
import javax.swing.UIManager.LookAndFeelInfo;
import java.io.IOException;
import java.awt.HeadlessException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
public class JoptiionPane {
   public static void main(String[] args) {
       String nilai1=null,nilai2=null,nilai3=null;
       String lookAndFeel = javax.swing.UIManager.getSystemLookAndFeelClassName();
       try {
             nilai1 = JOptionPane.showInputDialog(nilai1);
       nilai2 = JOptionPane.showInputDialog("masukkan nilai kedua");
       nilai3 = JOptionPane.showInputDialog("masukkan nilai ketiga");
       int n1 =Integer.parseInt(nilai1);
       int n2 =Integer.parseInt(nilai2);
       int n3= Integer.parseInt(nilai3);
       
       String msg= "anda memilih angka " + n1+" "+n2+ " " + n3 ;
       JOptionPane.showMessageDialog(null, msg);
      javax.swing.UIManager.setLookAndFeel(lookAndFeel);
       
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Jangan masukkan selain angka");
           
       }
     
}
}
