package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CuentaBancaria {
    private String codigoCuenta;
    private Titular titular;
    private Date fechaApertura;
    private String tipoCuenta;
    private double saldo;
    private List<MovimientoBancario> movimientos;

    // Constructor
    public CuentaBancaria(String codigoCuenta, Titular titular, Date fechaApertura, String tipoCuenta, double saldoInicial) {
        this.codigoCuenta = codigoCuenta;
        this.titular = titular;
        this.fechaApertura = fechaApertura;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldoInicial;
        this.movimientos = new ArrayList<>();
    }

    // Método para agregar un movimiento
    public void agregarMovimiento(MovimientoBancario movimiento) {
        movimientos.add(movimiento);
        if (movimiento.getTipoMovimiento().equalsIgnoreCase("Ingreso")) {
            saldo += movimiento.getImporte();
        } else if (movimiento.getTipoMovimiento().equalsIgnoreCase("Gasto")) {
            saldo -= movimiento.getImporte();
        }
    }

    // Método para consultar todos los movimientos
    public List<MovimientoBancario> consultarMovimientos() {
        return movimientos;
    }

    // Método para consultar movimientos por rango de fechas
    public List<MovimientoBancario> consultarMovimientos(Date fechaInicio, Date fechaFin) {
        List<MovimientoBancario> resultado = new ArrayList<>();
        for (MovimientoBancario mov : movimientos) {
            long fechaMov = mov.getFecha().getTime();
            if (fechaMov >= fechaInicio.getTime() && fechaMov <= fechaFin.getTime()) {
                resultado.add(mov);
            }
        }
        return resultado;
    }

    // Método para consultar movimientos por rango de fechas y tipo
    public List<MovimientoBancario> consultarMovimientos(Date fechaInicio, Date fechaFin, String tipoMovimiento) {
        List<MovimientoBancario> resultado = new ArrayList<>();
        for (MovimientoBancario mov : movimientos) {
            long fechaMov = mov.getFecha().getTime();
            if (fechaMov >= fechaInicio.getTime() && fechaMov <= fechaFin.getTime() &&
                    mov.getTipoMovimiento().equalsIgnoreCase(tipoMovimiento)) {
                resultado.add(mov);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Cuenta IBAN: " + codigoCuenta + "\n" +
                "Titular: " + titular + "\n" +
                "Tipo de Cuenta: " + tipoCuenta + "\n" +
                "Saldo: " + saldo + " €\n";
    }
}


