package Clase2;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscriureFitxerText {
    public static void main(String[] args) {
        String[] linies = {"Hola, primera linea", "Segona linea", "Tercera linea"};
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Clase2/Writer.txt"));
            for(String linea : linies){
                bw.write(linea);
                bw.newLine();
            }
            bw.close();
        }catch(Exception e){
            System.out.println("Error al escriure en el fitxer: " + e.getMessage());
        }
    }
}
