// Ejemplo 1: Uso de una clase genérica
class Caja<T>(val contenido: T) {
    fun obtenerContenido(): T {
        return contenido
    }
}

// Ejemplo 2: Función genérica que imprime el dato
fun <T> imprimirDato(elemento: T) {
    println(elemento)
}

// Ejemplo 3: Función genérica que suma dos números
fun <T : Number> sumar(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

// Ejemplo 4: Función genérica con restricción y cláusula 'where'
fun <T> imprimirSiEsNumero(valor: T) where T : Number {
    println(valor.toDouble())
}

fun main(args: Array<String>) {
    // Ejemplo 1: Creación de objetos genéricos
    val cajaInt = Caja(42.4156451)  // Caja de tipo Double
    val cajaString = Caja("Soy una cadena")  // Caja de tipo String

    // Ejemplo 2: Variables de diferentes tipos
    val nombre = "Daniel"
    val entero = 1456657

    // Ejemplo 3: Sumar dos números
    val suma = sumar(18.7541, 45)

    // Imprimir resultados
    println("****** Ejemplo 1 *******")
    println(cajaInt.obtenerContenido())
    println(cajaString.obtenerContenido())
    println("****** Fin del Ejemplo 1 *******\n")

    println("****** Ejemplo 2 *******")
    imprimirDato(nombre)
    imprimirDato(entero)
    println("****** Fin del Ejemplo 2 *******\n")

    println("****** Ejemplo 3 *******")
    println("La suma es: $suma")
    println("****** Fin del Ejemplo 3 *******\n")

    println("****** Ejemplo 4 *******")
    imprimirSiEsNumero(suma)
    println("****** Fin del Ejemplo 4 *******")
}
