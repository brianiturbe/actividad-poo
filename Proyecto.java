import Modelos.*;

class Proyecto {
    public static void main(String[] args) {
        Carro carro = new Carro(5, "75km/h", "negro", "toyota", "");
        Moto moto = new Moto(1, "300km/h", "Naranja", "rayas", 500, "18l", true, "Pesada");

        Conductor yo = new Conductor("Brian", 3, carro);

        System.out.println("");
        System.out.println("");
        System.out.println(yo.describirVehiculo());
        System.out.println(yo.manejarVehiculo());

        yo.setTransporte(moto);
        System.out.println(yo.describirVehiculo());
        System.out.println(yo.manejarVehiculo());
        System.out.println(yo.getTransporte());
        System.out.println(moto.frenar());

    }
}