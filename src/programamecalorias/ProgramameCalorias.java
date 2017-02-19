/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamecalorias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author salcu
 */
public class ProgramameCalorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent=new Scanner(System.in);
        
        double consumidas;
        consumidas=Double.valueOf(ent.nextLine().trim());
        //if(consumidas==0.0) System.out.println("");
        while (consumidas!=0.0) {
            
            
            Double comidas;
            comidas=Double.valueOf(ent.nextLine().trim());
            
            String[] datos;
            datos=ent.nextLine().trim().split("\\p{Space}+");
            double ingeridas=0.0;
            for (String dato : datos) {
                double valor=Double.valueOf(dato);
                ingeridas+=valor;
                
            }
            if(ingeridas==0.0 || consumidas==0.0){
                System.out.println("0");
                consumidas=Double.valueOf(ent.nextLine().trim());
                continue;
            }
            System.out.println((int)Math.ceil(ingeridas/consumidas));
          try{consumidas=Double.valueOf(ent.nextLine().trim());}catch(Exception e){consumidas=0.0;};
        }
        ent.close();
    }
    
}
 