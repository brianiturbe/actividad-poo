package Modelos;

public class Barco extends Transporte {
    private String tamaño;
    private String tipoDePropulsion; // usualmente motores (diésel, gasolina, nucleares) pero tambien pueden ser
                                     // velas, remos o incluso la fuerza de la corriente.
    private String capacidadDeCarga;
    private String autonomia;
    private String tipoDeFuncion; // pesquero, carga, pasajeros, etc...

    public Barco(int numeroDeRuedas, int numeroDePasajeros, String velocidadEnKm,
            String tamaño, String tipoDePropulsion, String capacidadDeCarga, String autonomia, String tipoDeFuncion) {
        super("Por mar", numeroDeRuedas, numeroDePasajeros, velocidadEnKm);
        this.tamaño = tamaño;
        this.tipoDePropulsion = tipoDePropulsion;
        this.capacidadDeCarga = capacidadDeCarga;
        this.autonomia = autonomia;
        this.tipoDeFuncion = tipoDeFuncion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipoDePropulsion() {
        return tipoDePropulsion;
    }

    public void setTipoDePropulsion(String tipoDePropulsion) {
        this.tipoDePropulsion = tipoDePropulsion;
    }

    public String getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(String capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public String getTipoDeFuncion() {
        return tipoDeFuncion;
    }

    public void setTipoDeFuncion(String tipoDeFuncion) {
        this.tipoDeFuncion = tipoDeFuncion;
    }

    @Override
    public String conducir() {
        return "fum fum";
    }
}
