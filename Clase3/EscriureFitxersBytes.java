package Clase3;
import java.io.*;
public class EscriureFitxersBytes {
    public static void main(String[] args){
        File fitxer = new File("fitxerBytes.dat");
        try(FileOutputStream out = new FileOutputStream(fitxer))
        {
            
            for(int i = 0; i< 100; i++){
                out.write(i);
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        try(FileInputStream in = new FileInputStream(fitxer)){
            int b;
            while((b = in.read()) != -1){
                System.out.println(b);
            }
        }catch(IOException e){
            System.out.println("Error al llegir: " + e.getMessage());
        }

    }
}
