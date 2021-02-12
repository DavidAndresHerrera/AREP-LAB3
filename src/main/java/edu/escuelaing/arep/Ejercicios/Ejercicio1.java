package edu.escuelaing.arep.Ejercicios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio1 {

    public static void Ejercicio1(){
        try{
            URL siteUrl= new URL("https://campusvirtual.escuelaing.edu.co/moodle/mod/assign/view.php?id=74411");

            System.out.println("Protocol: "+siteUrl.getProtocol());
            System.out.println("Authority: "+siteUrl.getAuthority());
            System.out.println("Host: "+siteUrl.getHost());
            System.out.println("Port: "+siteUrl.getPort());
            System.out.println("Path: "+siteUrl.getPath());
            System.out.println("Query: "+siteUrl.getQuery());
            System.out.println("File:"+siteUrl.getFile());
            System.out.println("Ref: "+siteUrl.getRef());


        }catch (MalformedURLException ex){
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE,null,ex);
        }

    }
}
