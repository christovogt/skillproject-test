package lieblingsfarbe.model;

public class Lieblingsfarbe {

    private String farbe;

    public Lieblingsfarbe(String farbe){
        setFarbe(farbe);
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public boolean isValid(){
        return (this.farbe != null && !this.farbe.isEmpty());
    }

}
