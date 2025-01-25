package Modelos;

public class Avion extends Transporte {
    private String tamaño;
    private String capacidadDeCarga;
    private String alcanceDeVuelo;

    public Avion(int numeroDeRuedas, int numeroDePasajeros, String velocidadEnKm,
            String tamaño, String capacidadDeCarga, String alcanceDeVuelo) {
        super("Por aire", numeroDeRuedas, numeroDePasajeros, velocidadEnKm);
        this.tamaño = tamaño;
        this.capacidadDeCarga = capacidadDeCarga;
        this.alcanceDeVuelo = alcanceDeVuelo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(String capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public String getAlcanceDeVuelo() {
        return alcanceDeVuelo;
    }

    public void setAlcanceDeVuelo(String alcanceDeVuelo) {
        this.alcanceDeVuelo = alcanceDeVuelo;
    }

    @Override
    public String conducir() {
        return "fiaum";
    }

}
