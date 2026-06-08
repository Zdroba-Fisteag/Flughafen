public abstract class Flughafenpersonal {

    private String abteilung;
    private String position;

    public Flughafenpersonal(String abteilung, String position) {
        this.abteilung = abteilung;
        this.position = position;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}