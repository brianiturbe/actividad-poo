package Modelos;

public class Moto extends Bicicleta {
    private int cilidraje;
    private String capacidadDeGasolina;
    private boolean tieneABS;
    private String peso;

    public Moto(int numeroDePasajeros, String velocidadEnKm, String color, String diseño, int cilidraje,
            String capacidadDeGasolina, boolean tieneABS, String peso) {
        super(numeroDePasajeros, velocidadEnKm, color, diseño);
        this.cilidraje = cilidraje;
        this.capacidadDeGasolina = capacidadDeGasolina;
        this.tieneABS = tieneABS;
        this.peso = peso;
    }

    public int getCilidraje() {
        return cilidraje;
    }

    public void setCilidraje(int cilidraje) {
        this.cilidraje = cilidraje;
    }

    public String getCapacidadDeGasolina() {
        return capacidadDeGasolina;
    }

    public void setCapacidadDeGasolina(String capacidadDeGasolina) {
        this.capacidadDeGasolina = capacidadDeGasolina;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String conducir() {
        return "vrroommm!";
    }

    public String frenar() {
        if (tieneABS) {
            return "logras frenar";
        } else {
            return "te caes";
        }
    }
}
