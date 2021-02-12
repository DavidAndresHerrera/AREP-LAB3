package edu.escuelaing.arep.Ejercicios;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio2 {

        public static void main(String[] args) {

            urlAnalisis("https://renovaliainmobiliaria.com/islas-privadas-en-venta/" );
            urlAnalisis("https://campusvirtual.escuelaing.edu.co/moodle/mod/assign/view.php?id=74411");
            urlAnalisis("https://lh3.googleusercontent.com/JJY82vgKMg9t_xXpFL0GaAueTussXvKXkcbRcx64YDntBOBjaRblgb1lshqmSOF9LU-ygDE=s170");
            urlAnalisis("https://campusvirtual.escuelaing.edu.co/moodle/grade/report/user/index.php?id=892");
            urlAnalisis("https://daniel@ldbn.is.escuelaing.edu.co/events/ArqIS2020/index.html#TemasC");
        }

        public static void urlAnalisis(String siteurl) {
            try {
                URL site = new URL(siteurl);
                System.out.println(site);
                System.out.println("------------");
                System.out.println("Protocol: " + site.getProtocol());
                System.out.println("Host: " + site.getHost());
                System.out.println("Port: " + site.getPort());
                System.out.println("Path: " + site.getPath());
                System.out.println("File: " + site.getFile());
                System.out.println("Query: " + site.getQuery());
                System.out.println("Ref.: " + site.getRef());
                System.out.println("Authority: " + site.getAuthority());
                System.out.println("------------");
                System.out.println("------------");

            } catch (MalformedURLException ex) {
                Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
