public abstract class Flugzeugpersonal {

    private String fluglinie;
    private int flugstundenProWoche;

    public Flugzeugpersonal(String fluglinie, int flugstundenProWoche) {
        this.fluglinie = fluglinie;
        this.flugstundenProWoche = flugstundenProWoche;
    }

    public String getFluglinie() {
        return fluglinie;
    }

    public void setFluglinie(String fluglinie) {
        this.fluglinie = fluglinie;
    }

    public int getFlugstundenProWoche() {
        return flugstundenProWoche;
    }

    public void setFlugstundenProWoche(int flugstundenProWoche) {
        this.flugstundenProWoche = flugstundenProWoche;
    }

    public abstract void FlugZuteilung();
}