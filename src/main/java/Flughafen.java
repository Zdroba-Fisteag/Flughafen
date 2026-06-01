import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void exportMitarbeiter() {

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
