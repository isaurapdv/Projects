public class MainTema8Tarea {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(40);
        persona.setNombre("Brucey");
        persona.setTelefono("6648225814");

        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());


    }

}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public Persona() {
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