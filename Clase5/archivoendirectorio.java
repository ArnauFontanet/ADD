package Clase5;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class archivoendirectorio {
    static Scanner sc = new Scanner(System.in);
    
    public void ImprimirArchivo(File f1){
        try
        {
            f1.createNewFile();
        }
        catch(IOException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public void main(String[] args) {
        System.out.println("Dime la ruta que quieras guardar el archivo: ");
        String ruta = sc.nextLine();
        File dir = new File(ruta);
        System.out.println("Dime como quieres llamar el archivo , con la extension: ");
        String ruta2 = sc.nextLine();
        File dir2 = new File(ruta2);
        ImprimirArchivo(dir2);
    }
}
