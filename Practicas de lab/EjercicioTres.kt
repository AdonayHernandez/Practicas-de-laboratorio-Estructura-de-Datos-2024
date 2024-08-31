/*
Ejercicio 3: Escribe un programa que permita al usuario ingresar 5 
cadenas de texto y las almacene en un array. 
Luego, muestra todas las cadenas ingresadas.
*/

fun main(){
    val cadenas = Array(5) {""}

    for (i in cadenas.indices){
        println("Ingresa una palabra (${i+1}/5)")
        cadenas[i] = readLine()?: ""
    }
     println("cadenas ingresadas")
     for (cadena in cadenas) {
        print(cadena)
     }
}