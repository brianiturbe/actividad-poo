package Modelos;

public class Transporte {
    private String medioDeTransporte;
    private int numeroDeRuedas;
    private int numeroDePasajeros;
    private String velocidadEnKm;

    public Transporte(String medioDeTransporte, int numeroDeRuedas, int numeroDePasajeros, String velocidadEnKm) {
        this.medioDeTransporte = medioDeTransporte;
        this.numeroDeRuedas = numeroDeRuedas;
        this.numeroDePasajeros = numeroDePasajeros;
        this.velocidadEnKm = velocidadEnKm;
    }

    public String getMedioDeTransporte() {
        return medioDeTransporte;
    }

    public void setMedioDeTransporte(String medioDeTransporte) {
        this.medioDeTransporte = medioDeTransporte;
    }

    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public int getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    public void setNumeroDePasajeros(int numeroDePasajeros) {
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public String getVelocidadEnKm() {
        return velocidadEnKm;
    }

    public void setVelocidadEnKm(String velocidadEnKm) {
        this.velocidadEnKm = velocidadEnKm;
    }

    public String conducir() {
        return "*coducir*";
    }

}
