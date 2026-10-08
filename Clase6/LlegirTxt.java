package Clase6;

import java.io.File;
import java.io.FileReader;

public class LlegirTxt {
    public static void main(String[] args){
        File dir = new File("Clase6/archivo.txt");
        String linea = "";
        try{
            FileReader fr = new FileReader(dir);
            int i;
            while((i=fr.read())!=-1){
                String[] paraules = linea.split(";");
                for(String paraula : paraules){
                    System.out.print(paraula);
                }
            }
            fr.close();
        }catch(Exception e){
            System.out.println("Error al llegir els arxius: " + e.getMessage());
        }
    }
}
