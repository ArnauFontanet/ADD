package ExerciciPR3;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LectorFutbolistes {

    public static void main(String[] args) throws ClassNotFoundException {
        File fitxerManual = new File("ExerciciPR3/escriurefutbolistes1.dat");
        File fitxerBucle = new File("ExerciciPR3/escriurefutbolistes2.dat");

        String[] noms = {"a", "b", "c", "d", "e"};
        int[] edats;
        int[] gols;
        int[] partits;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fitxerManual))){
            while(true){
                Futbolistes futbolista = (Futbolistes) ois.readObject();
                System.out.println("Nom: "+ futbolista.GetNom() + " | Edat" + futbolista.GetEdat() + " | Gols: " + futbolista.GetGols() + " | Partits: " + futbolista.GetPartits());

            }
        }
        catch(EOFException e ){
            System.err.println("\nFi de arxiu.");
        }
        catch(IOException e){
            System.err.println("\nError al llegir el arxiu: " + e.getMessage());
        }

        ArrayList<Futbolistes> llista = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fitxerBucle))){
            while(true){
                Futbolistes futbolista = (Futbolistes) ois.readObject();
                llista.add(futbolista);
            }
        }
        catch(EOFException e ){
            System.err.println("\nFi de arxiu.");
            System.out.println("\n--- Dades de futbolistes recuperades ---");
            for(int i = 0; i< llista.size(); i++){
                Futbolistes f = llista.get(i);
                System.out.println("Nom: "+ f.GetNom() + " | Edat: " + f.GetEdat() + " | Gols: " + f.GetGols() + " | Partits: " + f.GetPartits());
            }
        }
        catch(IOException e){
            System.err.println("\nError al llegir el arxiu: " + e.getMessage());
        }

    }
}