import java.time.LocalDate;
import java.util.List;

public abstract class Venta {
    protected int id;
    protected LocalDate fecha;
    protected double total;

    public Venta(int id, LocalDate feecha, double total){
        this.id = id;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId(){
        return id;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public double getTotal(){
        return total;
    }

    protected double calcularTotal(double productos, double impuestos){
        return productos + impuestos;
    }

    protected double calcularImpuestos(double total, double impuesto){
        return total * impuesto;
    }

    public void registrarVenta(List<Venta> historialCompras, Venta venta){
        historialCompras.add(venta);
    }
}
