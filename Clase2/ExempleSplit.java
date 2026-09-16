package Clase2;
import java.io.FileReader;
import java.io.BufferedReader;

public class ExempleSplit {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader ("ReaderSplit.txt"));
            String linea;
            while((linea = br.readLine()) != null){
                String[] paraules = linea.split(";");

                for (String paraula : paraules){
                    System.out.println(paraula);
                }
            }
            br.close();
        }catch(Exception e){
            System.out.println("Error al llegir en l'arxiu" + e.getMessage());
        }
    }
}
