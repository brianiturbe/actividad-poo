package Modelos;

public class Buseta extends Transporte {
    private String ruta;
    private String tamaño;
    private String color;
    private int numeroDePuertas;

    public Buseta(String medioDeTransporte, int numeroDeRuedas, int numeroDePasajeros, String velocidadEnKm,
            String ruta, String tamaño, String color, int numeroDePuertas) {
        super("Por tierra", 4, numeroDePasajeros, velocidadEnKm);
        this.ruta = ruta;
        this.tamaño = tamaño;
        this.color = color;
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

}
