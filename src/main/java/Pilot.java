public class Pilot extends Flugzeugpersonal {

    private String lizenzart;
    private int pilotStufe;

    public Pilot(String fluglinie, int flugstundenProWoche,
                 String lizenzart, int pilotStufe) {
        super(fluglinie, flugstundenProWoche);
        this.lizenzart = lizenzart;
        this.pilotStufe = pilotStufe;
    }

    public String getLizenzart() {
        return lizenzart;
    }

    public void setLizenzart(String lizenzart) {
        this.lizenzart = lizenzart;
    }

    public int getPilotStufe() {
        return pilotStufe;
    }

    public void setPilotStufe(int pilotStufe) {
        this.pilotStufe = pilotStufe;
    }

    @Override
    public void FlugZuteilung() {
        System.out.println("Pilot wurde einem Flug zugeteilt."); // implement file-list methods
    }
}