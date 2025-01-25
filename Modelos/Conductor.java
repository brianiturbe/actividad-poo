package Modelos;

public class Conductor {
    private String nombre;
    private int añosDeExperiencia;
    private Transporte transporte;

    public Conductor(String nombre, int añosDeExperiencia, Transporte transporte) {
        this.nombre = nombre;
        this.añosDeExperiencia = añosDeExperiencia;
        this.transporte = transporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public String manejarVehiculo() {
        return nombre + ": " + transporte.conducir();
    }

    public String describirVehiculo() {
        return "Este vehiculo conduce " + transporte.getMedioDeTransporte() + " con "
                + transporte.getNumeroDePasajeros() + " persona/s a una velocidad de " + transporte.getVelocidadEnKm();
    }

}
