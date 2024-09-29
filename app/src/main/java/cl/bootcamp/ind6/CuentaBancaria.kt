package cl.bootcamp.ind6

class CuentaBancaria(
    val nombreCuenta: String,
    var saldoDisponible: Double
) {
    private val historial: MutableList<String> = mutableListOf()

    fun deposito(cantidad: Double) {
        if (cantidad > 0) {
            saldoDisponible += cantidad
            historial.add("$nombreCuenta Deposito $$cantidad")
            println("Depósito realizado correctamente en la cuenta $nombreCuenta.")
        } else {
            println("La cantidad ingresada debe ser mayor a 0.")
        }
    }

    fun retiro(cantidad: Double) {
        if (cantidad > saldoDisponible) {
            println("Fondos insuficientes para realizar el retiro de $$cantidad en la cuenta $nombreCuenta.")
            historial.add("$nombreCuenta retiro fallido $$cantidad")
        } else if (cantidad > 0) {
            saldoDisponible -= cantidad
            historial.add("$nombreCuenta retiro $$cantidad")
            println("Retiro realizado correctamente en la cuenta $nombreCuenta.")
        } else {
            println("La cantidad ingresada debe ser mayor a 0.")
        }
    }

    fun mostrarSaldo() {
        println("$nombreCuenta. Su saldo disponible es de: $$saldoDisponible")
    }

    fun linea(){
        println("----------------------------------------------")
    }

    fun mostrarHistorial() {
        linea()
        println("Historial de transacciones - $nombreCuenta:")
        linea()
        if (historial.isEmpty()) {
            println("No hay transacciones registradas.")
        } else {
            historial.forEach { println(it) }
        }
        linea()
        mostrarSaldo()
    }
}
