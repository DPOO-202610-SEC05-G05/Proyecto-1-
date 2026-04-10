import java.time.LocalDate;

public class Prestamo {
    private int id;
    private LocalDate fecha;
    private String estado;
    private LocalDate fechaDevolucion;
    //no estoy seguro
    private Juego juego;

    public Prestamo(int id, LocalDate fecha, String estado, LocalDate fechaDevolucion){
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getId(){
        return id;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public String geEstado(){
        return estado;
    }

    public LocalDate getFechaDevolucion(){
        return fechaDevolucion;
    }

    public void registrarPrestamo(Juego juego){
        this.juego = juego;
        this.estado = "activo";
        this.fecha = LocalDate.now();
    }
}
