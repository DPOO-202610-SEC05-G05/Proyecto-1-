import java.util.List;

public abstract class Empleado extends Usuario {
    protected Turno turno;

    public Empleado(int id, String username, String email, String password, Turno turno){
        super(id, username, email, password);
        this.turno = turno;
    }

    public Turno getTurno(){
        return turno;
    }

    public void setTurno(Turno newTurno){
        this.turno = newTurno;
    }

    public boolean enTurno(Turno turno){
        return this.turno == turno;
    }

    public void solicitarCambioTurno(Turno newTurno, Turno actualTurno, int idEmpleado){
    }

    public void comprarJuego(List<String> juegosSeleccionados, String codigoDescuento, int idEmpleado){
    }

    public void comprarProducto(List<String> platillosSeleccionados, String codigoDescuento, int idEmpleado, int idMesa){
    }

    public void sugerirPlatillo(String newPlatillo){
    }
}

///////
/// aca
///////