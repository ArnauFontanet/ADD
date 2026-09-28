package Clase3;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class LectorPokemon {
    public static void main(String[] args){
        File fitxer = new File("FitxerPokemons.dat");

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fitxer))){
            while(true){
                Pokemon p = (Pokemon) ois.readObject();
                System.out.println("Nombre: " + p.GetNombre() + " | Vida: " + p.GetVida());
            }
        }
        catch(EOFException e){
            System.out.println("Fin de archivo.");
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
