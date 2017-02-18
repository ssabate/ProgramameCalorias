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
        try{
        Scanner ent=new Scanner(System.in);
//        System.out.println("2");
//        System.out.println("100");
//        String largo="5000";
//        for (int i = 1; i < 100; i++) {
//            largo+=" 5000";
//            
//        }
//        System.out.println(largo);
//        System.out.println("0");
//        System.exit(0);
//        String[] dd=largo.split("\\p{Space}+");
        int consumidas=Integer.valueOf(ent.nextLine().trim());
        if(consumidas==0) System.out.println("");
        while (consumidas!=0) {
            
            
            int comidas=Integer.valueOf(ent.nextLine().trim());
            if(comidas<=0){
                System.out.println("0");
                ent.nextLine().trim();
                consumidas=Integer.valueOf(ent.nextLine().trim());
                continue;
            
            }
            //String ocult=entSt.nextLine().replaceAll("\\p{Space}", "");
            //String regexp="[^"+ocult+"]";
            //text.replaceAll(regexp, "");
            //text=Pattern.compile(regexp).matcher(text).replaceAll("");
            
            String[] datos=ent.nextLine().trim().split("\\p{Space}+");
            int ingeridas=0;
            for (String dato : datos) {
                try{
                int valor=Integer.valueOf(dato);
                ingeridas+=valor;
                }catch(Exception e){}
            }
//            while (comidas-->0) {
//                ingeridas+=Long.valueOf(ent.next());
//            }
            if(ingeridas==0 || consumidas==0){
                System.out.println("0");
                consumidas=Integer.valueOf(ent.nextLine().trim());
                continue;
            }
            if(ingeridas%consumidas==0)
                System.out.println(ingeridas/consumidas);
            else System.out.println((ingeridas/consumidas)+1);

            consumidas=Integer.valueOf(ent.nextLine().trim());
        }
        ent.close();}
        catch(Exception e){System.out.print("0");}
    }
    
}
 