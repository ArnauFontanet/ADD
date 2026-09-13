import java.io.File;

public class ExploradorDirectoris {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No s'ha proporcionat cap directori.");
            return;
        }

        File dir = new File(args[0]);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("El directori proporcionat no existeix o no és un directori vàlid.");
            return;
        }

        System.out.println("Explorant directori: " + dir.getAbsolutePath() + "\n");

        File[] elements = dir.listFiles();

        long totalElements = 0;
        long midaTotalFitxers = 0;

        if(elements != null){
            for(File f: elements){
                totalElements++;

                String nom = f.getName();
                long mida = f.length();
                boolean esDirectori = f.isDirectory();
                boolean potEscriure = f.canWrite();

                String tipus = "Fitxer";
                if(esDirectori){
                    tipus = "Carpeta";
                }
                else{
                    midaTotalFitxers += mida;
                }
                
                System.out.printf("%-25s tipus: %-7s %8d bytes escriptura: %-5b%n", nom, tipus, mida, potEscriure);

            }
        }

        System.out.printf("\nTotal d'elements trobats: %d%n", totalElements);
        System.out.printf("Mida total fitxers: %d bytes%n", midaTotalFitxers);

    }
}

