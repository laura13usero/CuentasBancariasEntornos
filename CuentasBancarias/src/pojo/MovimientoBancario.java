package pojo;

import java.util.Date;

import java.util.Date;

public class MovimientoBancario {
    private String codigoMovimiento;
    private Date fecha;
    private String concepto;
    private String tipoMovimiento;  // "Ingreso" o "Gasto"
    private double importe;

    // Constructor
    public MovimientoBancario(String codigoMovimiento, Date fecha, String concepto, String tipoMovimiento, double importe) {
        this.codigoMovimiento = codigoMovimiento;
        this.fecha = fecha;
        this.concepto = concepto;
        this.tipoMovimiento = tipoMovimiento;
        this.importe = importe;
    }

    // Método para devolver la fecha
    public Date getFecha() {
        return fecha;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return fecha + " - " + concepto + " (" + tipoMovimiento + "): " + importe + " €";
    }
}
