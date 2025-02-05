import pojo.CuentaBancaria;
import pojo.MovimientoBancario;
import pojo.Titular;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Juan", "Pérez", "12345678A");

        // Crear cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("ES12345678901234567890", titular, new Date(), "Ahorro", 1000.0);

        // Agregar algunos movimientos
        cuenta.agregarMovimiento(new MovimientoBancario("M001", new Date(), "Ingreso de nómina", "Ingreso", 1500.0));
        cuenta.agregarMovimiento(new MovimientoBancario("M002", new Date(), "Compra supermercado", "Gasto", 200.0));
        cuenta.agregarMovimiento(new MovimientoBancario("M003", new Date(), "Bizum a amigo", "Gasto", 50.0));

        // Consultar todos los movimientos
        System.out.println("Todos los movimientos:");
        for (MovimientoBancario mov : cuenta.consultarMovimientos()) {
            System.out.println(mov);
        }

        // Consultar saldo actual
        System.out.println("\nSaldo actual: " + cuenta.toString());
    }
}

