import java.io.*;
import java.util.List;

public class Flughafen {
    public String ICAO_Code;
    public List<Flugzeug> flugzeuge;

    public Flughafen(String ICAO_Code, List<Flugzeug> flugzeuge) {
        this.ICAO_Code = ICAO_Code;
        this.flugzeuge = flugzeuge;
    }

    public Flughafen() {
    }

    public void importMitarbeiter() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("mitarbeiter.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Einlesen der Datei mitarbeiter.csv: " + e.getMessage());
        }
    }

    public void exportMitarbeiter(String vorname, String nachname, int alter, double gehalt) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("mitarbeiter.csv", true))) {
            bw.write(vorname + ";" + nachname + ";" + alter + ";" + gehalt);
            bw.newLine();
            System.out.println("Mitarbeiter wurde erfolgreich gespeichert.");
        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben in die Datei.");
            e.printStackTrace();
        }
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Flughafen flughafen)) return false;

        return ICAO_Code.equals(flughafen.ICAO_Code);
    }

    @Override
    public int hashCode() {
        return ICAO_Code.hashCode();
    }
}
