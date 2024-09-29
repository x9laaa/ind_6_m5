package cl.bootcamp.ind6

fun main() {
    val cuenta1 = CuentaBancaria("Alex", 1000.0)
    val cuenta2 = CuentaBancaria("Karina", 500.0)
    val cuenta3 = CuentaBancaria("Luis", 200.0)

    cuenta1.deposito(200.0)
    cuenta1.retiro(150.0)
    cuenta1.deposito(300.0)
    cuenta1.retiro(1400.0) // Retiro fallido
    cuenta1.deposito(500.0)

    cuenta2.deposito(100.0)
    cuenta2.retiro(50.0)
    cuenta2.deposito(200.0)
    cuenta2.retiro(800.0) // Retiro fallido
    cuenta2.retiro(100.0)

    cuenta3.deposito(50.0)
    cuenta3.retiro(30.0)
    cuenta3.retiro(300.0) // Retiro fallido
    cuenta3.deposito(500.0)
    cuenta3.retiro(100.0)

    println("\n--- Mostrar el historial de la Cuenta 1 ---")
    cuenta1.mostrarHistorial()

    println("\n--- Mostrar el historial de la Cuenta 2 ---")
    cuenta2.mostrarHistorial()

    println("\n--- Mostrar el historial de la Cuenta 3 ---")
    cuenta3.mostrarHistorial()
}
