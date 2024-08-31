/*Ejercicio 4: Crea un programa que permita al usuario ingresar 4 números enteros y los
almacene en un array. Luego, encuentra y muestra el número mayor del array. Usa trycatch 
para manejar entradas no numéricas. */

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = IntArray(4)

    println("Ingrese 4 números enteros:")

    for (i in numbers.indices) {
        while (true) {
            try {
                println("Número ${i + 1}: ")
                numbers[i] = scanner.nextInt()
                break
            } catch (e: Exception) {
                println("Entrada no válida. Por favor, ingrese un número entero.")
                scanner.next() // Limpiar el buffer de entrada
            }
        }
    }

    val maxNumber = numbers.maxOrNull()
    if (maxNumber != null) {
        println("El número mayor es: $maxNumber")
    } else {
        println("No se pudo determinar el número mayor.")
    }
}