/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrituradearchivos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EscrituradeArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        escritura escriturita = new escritura();
        
        Scanner entrada = new Scanner(System.in);
        //escriturita.ejemploEscrituraTxt();
        
        System.err.println("Ingrese el nombre del archivo");
        String nombreArchivo = entrada.next();
        escriturita.ejemploEscrituraCsv(nombreArchivo);
    }
    
}





