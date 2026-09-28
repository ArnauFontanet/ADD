package ExerciciPR3;
import java.io.Serializable;

public class Futbolistes implements Serializable{
    private String nom;
    private int edat;
    private int gols;
    private int partits;
    private String club;

    public Futbolistes(){
        nom = "bot";
        edat = 25;
        gols = 10;
        partits = 400;
    }

    public Futbolistes (String nom, int edat, int gols, int partits){
        this.edat = edat;
        this.nom = nom;
        this.gols = gols;
        this.partits = partits;
    }
        public String GetNom()
    {
        return nom;
    }
        public int GetEdat()
    {
        return edat;
    }
     public int GetGols()
    {
        return gols;
    }
    public int GetPartits()
    {
        return partits;
    }
}

