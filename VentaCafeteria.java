import java.time.LocalDate;

public class VentaCafeteria extends Venta {
    private double impuestoConsumo;
    private double propina;

    public VentaCafeteria(int id, LocalDate fecha, double total, double impuestoConsumo, double propina){
        super(id, fecha, total);
        this.impuestoConsumo = impuestoConsumo;
        this.propina = propina;
    }

    public double getImpuesto(){
        return impuestoConsumo;
    }

    public double getPropina(){
        return propina;
    }
}
