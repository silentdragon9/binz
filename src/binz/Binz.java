/*
 Mohammad Ariff Bin Idris
 */
package binz;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Binz {

    public static void main(String[] args) throws IOException {
       File readFIRST = new File ("C:/Users/User06/Documents/NetBeansProjects/binz/B.txt");
       
       if (!(readFIRST.exists())){
           System.out.println("File NOT exists");
           System.exit(0);
       }
       String txt, s1 = "";
       Scanner inf = new Scanner(readFIRST);
       while (inf.hasNext())
       {
           txt = inf.nextLine();
           System.out.println(txt);
           byte[] infoBin = null;
           infoBin = txt.getBytes("UTF-8");
           
           for(byte b : infoBin){
               System.out.println("C:" + (char) b + "->" + Integer.toBinaryString(b));
               s1 += Integer.toBinaryString(b);
                          }
       }
       System.out.println(s1);
       PrintStream fileOut = new PrintStream ("C.bin");
            try{
                fileOut.printf (s1);
            }finally{
                fileOut.close();
            }
    }
    
}
