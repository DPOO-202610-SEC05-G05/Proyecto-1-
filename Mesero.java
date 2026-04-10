import java.util.List;
import java.util.ArrayList;

public class Mesero extends Empleado {
    private List<String> juegosConocidos;
    private List<String> juegosFavoritos;

    public Mesero(int id, String username, String email, String password, Turno turno, List<String> juegosFavoritos, List<String> juegosConocidos){
        super(id, username, email, password, turno);
        this.juegosFavoritos = juegosFavoritos;
        this.juegosConocidos = juegosConocidos;
    }

    public List<String> getJuegosConocidos(){
        return juegosConocidos;
    }

    public List<String> getJuegosFavoritos(){
        return juegosFavoritos;
    }

    public void setJuegosConocidos(String juego){
        juegosConocidos.add(juego);
    }

    public void setJuegosFavoritos(String juego){
        juegosFavoritos.add(juego);
    }

    public void reservarJuegos(String juego1, String juego2, int idEmpleado, Turno turno, List<String> clientesPorAtender){
    }

    public List<String> juegosDisponibles(String filtro){
        return new ArrayList<>();
    }

    public void regresarJuego(String juego1, String juego2){
    }
}
