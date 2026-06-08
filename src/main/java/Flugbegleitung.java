public class Flugbegleitung extends Flugzeugpersonal {

    private int stufe;
    private boolean ersteHilfeThreshold;

    public Flugbegleitung(String fluglinie, int flugstundenProWoche,
                          int stufe, boolean ersteHilfeThreshold) {
        super(fluglinie, flugstundenProWoche);
        this.stufe = stufe;
        this.ersteHilfeThreshold = ersteHilfeThreshold;
    }

    public int getStufe() {
        return stufe;
    }

    public void setStufe(int stufe) {
        this.stufe = stufe;
    }

    public boolean isErsteHilfeThreshold() {
        return ersteHilfeThreshold;
    }

    public void setErsteHilfeThreshold(boolean ersteHilfeThreshold) {
        this.ersteHilfeThreshold = ersteHilfeThreshold;
    }

    @Override
    public void FlugZuteilung() {
        System.out.println("Flugbegleitung wurde einem Flug zugeteilt."); // implement file-list methods
    }
}
