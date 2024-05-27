public class Jugador {
    private static int contadorID = 0;
    private int id;
    private String nombre;

    public Jugador(String nombre) {
        this.id = ++contadorID;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

    
