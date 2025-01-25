package Modelos;

public class Carro extends Transporte {
    private String color;
    private String marca;
    private String modelo;

    public Carro(int numeroDePasajeros, String velocidadEnKm,
            String color, String marca, String modelo) {
        super("Por tierra", 4, numeroDePasajeros, velocidadEnKm);
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String conducir() {
        return "room room";
    }
}
