package Clase2;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

public class Exercici2 {
    public static void AfegirContactesInici(String[] args) {
        String[] linies = {"Pol Valverde;647582917;polvalverde@vedrunavall.cat", "Jan Carrasque;574813859;jancarrasque@vedrunavall.cat", "Gerard Vaghi;748917462;gerardvaghi@vedrunavall.cat", "MartinGomez;654718492;martingomez@vedrunavall.cat", "Ariel Miranda;361840589;arielmiranda@vedrunavall.cat"};
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Clase2/Exercici2Agenda.txt"));
            for(String line : linies){
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error al obrir el fitxer: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Exercici2Llegir.txt"));
            String linea;
            int n = 0;
            while ((linea = br.readLine()) != null); {
                
            }
        } catch (Exception e) {
            System.out.println("Error al llegir el fitxer: " + e.getMessage());
        }
    }
}
