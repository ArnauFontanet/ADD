package Ejercicio3Examen;
import java.io.Serializable;
public class npc {
    private String nombre;
    private int vida;
    private float coordenadas[] = new float[3];
    
    public npc(){
        nombre = "Default";
        vida = 100;
        coordenadas[0] = 0;
        coordenadas[1] = 0;
        coordenadas[2] = 0;
    }

    public npc(String nombre, int vida, float coordenadas[]){
        this.nombre = nombre;
        this.vida = vida;
        this.coordenadas = coordenadas;
    }
    public String GetNombre(){
        return nombre;
    }
    public int GetVida(){
        return vida;
    }
    

}
