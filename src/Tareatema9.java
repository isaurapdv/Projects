package Tareatema9;

public class Tareatema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Frodo", 45, "666-2565", 250000.0);
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        Trabajador curro  = new Trabajador("Frodo", 45, "666-2565", 250000.0);
        System.out.println("Nombre: " + curro.getNombre());
        System.out.println("Edad: " + curro.getEdad());
        System.out.println("Teléfono: " + curro.getTelefono());
        System.out.println("Salario: " + curro.getSalario());
    }
}
class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public Persona(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public Cliente(String nombre, int edad, String telefono, double credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona {
    private double salario;
    public Trabajador(String nombre, int edad, String telefono, double salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

