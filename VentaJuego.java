import java.time.LocalDate;

public class VentaJuego extends Venta {
    private double iva;
    private double descuentoAplicado;

    public VentaJuego(int id, LocalDate fecha, double total, double iva, double descuentoAplicado){
        super(id, fecha, total);
        this.iva = iva;
        this.descuentoAplicado = descuentoAplicado;
    }

    public double getIva(){
        return iva;
    }

    public double getDescuento(){
        return descuentoAplicado;
    }
}