package ExerciciPR3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class GeneradorFutbolistes {
    public static void main(String[] args) {
        String[] noms = {"Messi", "CR7", "Neymar", "Lamine", "Mbappe"};
        int[] edats = {39, 41, 37, 19, 28};
        int[] golsMarcats = {930, 970, 450, 150, 400};
        int[] partitsJugats = {900, 950, 700, 90, 500};
        File fitxerManual = new File("ExerciciPR3/escriurefutbolistes1.dat");
        File fitxerBucle = new File("ExerciciPR3/escriurefutbolistes2.dat");

        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fitxerManual)))
        {
            oos.writeObject(new Futbolistes(noms[0], edats[0], golsMarcats[0], partitsJugats[0]));
            oos.writeObject(new Futbolistes(noms[1], edats[1], golsMarcats[1], partitsJugats[1]));
            oos.writeObject(new Futbolistes(noms[2], edats[2], golsMarcats[2], partitsJugats[2]));
            oos.writeObject(new Futbolistes(noms[3], edats[3], golsMarcats[3], partitsJugats[3]));
            oos.writeObject(new Futbolistes(noms[4], edats[4], golsMarcats[4], partitsJugats[4]));

        }catch(IOException e){
            System.err.println("Error al obrir " + e.getMessage());
        }
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fitxerBucle)))
        {
            for(int i = 0; i < noms.length; i++){
                Futbolistes futbolista = new Futbolistes(noms[i], edats[i], golsMarcats[i], partitsJugats[i]);
                oos.writeObject(futbolista);
            }

        }catch(IOException e){
            System.err.println("Error al obrir " + e.getMessage());
        }
    }
}
