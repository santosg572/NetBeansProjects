/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

public class EscribeFichero
{
    EscribeFichero(String args)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        String pat = new File (".").getAbsolutePath();
        int len = pat.length();  
        String file = pat.substring(0, len-1)+"pruebas6.txt";
        
        System.out.println("file: " + file);
        try
        {
            fichero = new FileWriter(file);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}

