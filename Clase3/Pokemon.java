package Clase3;
import java.io.Serializable;

public class Pokemon implements Serializable{
    private String nombre;
    private int vida;


    public Pokemon()
    {
        nombre = "Ditto";
        vida = 60;
    }
    public Pokemon(String nombre, int vida)
    {
        this.nombre = nombre;
        this.vida = vida;
    }
    public String GetNombre()
    {
        return nombre;
    }
    public int GetVida()
    {
        return vida;
    }
    
}
