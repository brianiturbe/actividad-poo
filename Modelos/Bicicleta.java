package Modelos;

public class Bicicleta extends Transporte {
    private String color;
    private String diseño;

    public Bicicleta(int numeroDePasajeros, String velocidadEnKm,
            String color, String diseño) {
        super("Por tierra", 2, numeroDePasajeros, velocidadEnKm);
        this.color = color;
        this.diseño = diseño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    @Override
    public String conducir() {
        return "(no produce sonido)";
    }

}
