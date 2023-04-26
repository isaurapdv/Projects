public class MainTema8 {

    public static void main(String[] args) {
        //Creamos y definomos vehiculo coche
        Vehiculo coche= new Vehiculo();
        coche.setTipo("Coupe");
        coche.setVelocidadMaxima(120);

        //Creamos y definomos vehiculo moto
        Vehiculo moto= new Vehiculo();
        moto.setTipo("Scooter");
        moto.setVelocidadMaxima(50);

        //Caracteristias coche
        System.out.println(coche.getTipo());
        System.out.println(coche.getVelocidadMaxima());

        //Caracteristias moto
        System.out.println(moto.getVelocidadMaxima());
        System.out.println(moto.getTipo()+ " " + moto.getVelocidadMaxima());
    }
}
class Vehiculo {
    private String tipo;
    private int velocidadMaxima;

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
     }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }


    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

