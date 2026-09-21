package Clase2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

public class Exercici2 {

    static String rutaFitxer = "./Exercici2Agenda.txt";
    static BufferedReader teclat = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        File fitxer = new File(rutaFitxer);
        if (!fitxer.exists()) {
            AfegirContactesInici();
        }
        iniciarMenu();
    }

    public static void AfegirContactesInici() {
        String[] linies = {"Pol Valverde;647582917;polvalverde@vedrunavall.cat", "Jan Carrasque;574813859;jancarrasque@vedrunavall.cat", "Gerard Vaghi;748917462;gerardvaghi@vedrunavall.cat", "MartinGomez;654718492;martingomez@vedrunavall.cat", "Ariel Miranda;361840589;arielmiranda@vedrunavall.cat"};
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaFitxer));
            for (String line : linies) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.out.println("Error al obrir el fitxer: " + e.getMessage());
        }
    }

    public static void iniciarMenu() {
        boolean sortir = false;
        int n = 0;
        
        while (!sortir) {
            System.out.println("\n -----AGENDA-----");
            System.out.println("1. Afegir contacte.");
            System.out.println("2. Llistar contactes.");
            System.out.println("3. Cercar per nom.");
            System.out.println("4. Sortir.");
            System.out.print("Tria una opcio: ");

            try {
                String opcio = teclat.readLine();
                n = Integer.parseInt(opcio);
                
                switch (n) {
                    case 1:
                        afegirContacte();
                        break;
                    case 2:
                        llistarContactes();
                        break;
                    case 3:
                        cercarContacte();
                        break;
                    case 4:
                        System.out.println("\nSortint.");
                        sortir = true;
                        break;
                    default:
                        System.out.println("Opcio invalida");
                }
            } catch (Exception e) {
                System.out.println("\nError, introdueix una opcio correcte.");
            }
        }
    }

    public static void afegirContacte() {
        try {
            System.out.print("Nom: ");
            String nom = teclat.readLine();
            System.out.print("Telefon: ");
            String tel = teclat.readLine();
            System.out.print("Email: ");
            String correu = teclat.readLine();
            String novalinea = nom + ";" + tel + ";" + correu;

            BufferedWriter bwr = new BufferedWriter(new FileWriter(rutaFitxer, true));
            bwr.write(novalinea);
            bwr.newLine();
            bwr.close();
            System.out.println("Contacte afegit correctament.");
        } catch (Exception e) {
            System.out.println("Error al afegir el contacte: " + e.getMessage());
        }
    }

    public static void llistarContactes() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaFitxer));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] paraules = linea.split(";");
                if (paraules.length >= 3) {
                    System.out.println("Nom: " + paraules[0] + " | Telefon: " + paraules[1] + " | Email: " + paraules[2]);
                }
            }
            br.close(); 
        } catch (Exception e) {
            System.out.println("Error al llegir els contactes: " + e.getMessage());
        }
    }

    public static void cercarContacte() {
        try {
            System.out.print("Escriu el nom de la busqueda: ");
            String textBusqueda = teclat.readLine().toLowerCase();
            
            BufferedReader brr = new BufferedReader(new FileReader(rutaFitxer));
            String linea;
            boolean trobat = false;
            
            while ((linea = brr.readLine()) != null) {
                String[] paraules = linea.split(";");
                if (paraules.length >= 3 && paraules[0].toLowerCase().contains(textBusqueda)) {
                    System.out.println("Contacte trobat -> Nom: " + paraules[0] + " | Telefon: " + paraules[1] + " | Email: " + paraules[2]);
                    trobat = true;
                }
            }
            brr.close();
            
            if (!trobat) {
                System.out.println("No s'ha trobat a ningu.");
            }
        } catch (Exception e) {
            System.out.println("Error al cercar al fitxer: " + e.getMessage());
        }
    }
}