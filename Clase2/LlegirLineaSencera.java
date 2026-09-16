package Clase2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LlegirLineaSencera {
    public static void main(String[] args){
        try (
            BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            String linea;
            int n = 1;
            while ((linea = br.readLine()) != null) {
                System.out.println("Linea " + n + ": " + linea);
                n++;
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer los archivos: " + e.getMessage());
        }
    }
}
