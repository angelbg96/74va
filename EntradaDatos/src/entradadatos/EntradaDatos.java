/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatos;
import java.io.*;
import java.util.*;
/**
 *
 * @author Angel BG
 */
public class EntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bInput = new BufferedReader(input);
        /* Ahora con clase Scan */
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.println("Introduce un dato:");
            captura = bInput.readLine();
            System.out.println("\nDato introducido: " + captura);
            
            System.out.println("\n\nIntroduce otro dato:");
            captura = scan.nextLine();
            System.out.println("\nDato capturado con Scan: "+captura);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
