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

    public void importMitarbeiter() {

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
