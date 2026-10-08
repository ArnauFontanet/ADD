package Clase6;
import java.io.*;
import java.util.Scanner;

public class Ejercicio1Examen {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String nombreCarpeta = sc.nextLine();
        String nombreArchivo = sc.nextLine();

        File dir = new File(nombreCarpeta);
        File archivo1 = new File(dir, nombreArchivo);

        if(dir.exists()){
            System.err.println("El directorio ya existe.");
        }
        else{
            if(dir.mkdir()){
                System.out.println("Directorio creador correctamente");
            }
            else{
                System.out.println("Error al crear el directorio.");
            }
        }
        try{
            archivo1.createNewFile();
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}