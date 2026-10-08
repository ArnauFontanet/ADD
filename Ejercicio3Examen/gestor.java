package Ejercicio3Examen;
import java.io.*;
import java.util.*;
public class gestor {
    Scanner sc = new Scanner(System.in);
    void GuardarNPC(){
        System.out.println("Dime el nombre, la vida y su posicion: ");
        int vida;
        String nombre;
        float pos[] = new float[3];
        vida = Integer.parseInt(sc.nextLine());
        nombre = sc.nextLine();
        pos[0] = Integer.parseInt(sc.nextLine());
        pos[1] = Integer.parseInt(sc.nextLine());
        pos[2] = Integer.parseInt(sc.nextLine());

        npc pepe = new npc(nombre, vida, pos);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("archivo.dat")))){
            oos.writeObject(pepe);
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    void LeerNPC(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("archivo.dat")))){
            
            while(true){
            npc npc = (npc) ois.readObject();
            System.out.println("NPC = " + npc.GetNombre());

            }
            
        }catch(EOFException e){
            System.out.println("Archivo finalizado.");
        }catch(ClassNotFoundException e){
            System.err.println("Error: Clase no encontrada - " + e.getMessage());
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
