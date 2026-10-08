package Clase2;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;

public class ExempleSplit {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader ("ReaderSplit.txt"));
            
            String linea;
            int n = 0;
            String[][] personas = new String[200][3];

            while ((linea = br.readLine()) != null) {
                String[] paraules = linea.split(";");
                personas[n][0] = paraules[0];
                personas[n][1] = paraules[1];
                personas[n][2] = paraules[2];
                n++;
            }

            int mayorDinero = Integer.MIN_VALUE;
            String nombre = "";
            int edad = 0;

            for (int i = 0; i < n; i++) {
                int dinero = Integer.parseInt(personas[i][2]);
                if (dinero > mayorDinero) {
                    mayorDinero = dinero;
                    nombre = personas[i][0];
                    edad = Integer.parseInt(personas[i][1]);
                }
            }

            System.out.println("La persona con mas dinero es: " + nombre + " (" + edad + " anys, " + mayorDinero + " euros)");
            br.close();
        }catch(Exception e){
            System.out.println("Error al llegir en l'arxiu" + e.getMessage());
        }
    }
}
