public class Flugzeug {
    String reg;
    String typ;
    int kapazitaet;
    int reichweite;
    Fluglinie fluglinie;

    public Flugzeug(String reg, String typ, int kapazitaet, int reichweite, Fluglinie fluglinie) {
        this.reg = reg;
        this.typ = typ;
        this.kapazitaet = kapazitaet;
        this.reichweite = reichweite;
        this.fluglinie = fluglinie;
    }

    public Flugzeug() {

    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getKapazitaet() {
        return kapazitaet;
    }

    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }

    public int getReichweite() {
        return reichweite;
    }

    public void setReichweite(int reichweite) {
        this.reichweite = reichweite;
    }

    public Fluglinie getFluglinie() {
        return fluglinie;
    }

    public void setFluglinie(Fluglinie fluglinie) {
        this.fluglinie = fluglinie;
    }

    public int reichweiteProPassagierUndGewicht () {
        return reichweite/kapazitaet;
    }
}
