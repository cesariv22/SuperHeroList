package com.example.superherolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/********************* EJERCICIO 13 MODULO 5  ******************/

/***  Ejercicio A  ***/

// 1.- Crear una función llamada suma que va a recibir dos números de uno de tipo doble y el otro de
// tipo float, los cuales va a sumar y retornara el resultado.

//Opción 1
fun suma(num1: Double, num2: Float): Double {
    return num1 + num2
}
//Opción 2
fun suma2(num3: Double, num4: Float) = num3 + num4



// 2.- Crear una función llamada redondeo que va a recibir un número de tipo doble redondeará hacia
// arriba y mostrará el resultado.

fun redondeo(numDouble: Double) {
    val resultado = kotlin.math.ceil(numDouble)
    println("El redondeo hacia arriba de $numDouble es: $resultado")
}


// 3.- Crear una función llamada muestra resultado que recibirá un número de tipo doble y le dará un
// formato de moneda y lo mostrará.

fun muestraResultado(numero: Double) {
    //Formato de moneda correspondiente a configuración regional
    val formatoMoneda = java.text.NumberFormat.getCurrencyInstance().format(numero)
    println(formatoMoneda)
}
fun main() {
    // 1
    println(suma(5.0, 15f))
    println(suma2(5.0,15f))
    // 2
    redondeo(3.5)
    redondeo(23.2)
    // 3
    println(muestraResultado(578901.00))
    println(muestraResultado(1567.000))
}

/***  Ejercicio B  *** /   (Descomentar fun main línea 101 para ejecutar programa ****/

// Función para ingresar los datos de los superhéroes
fun ingresarSuperheroe() {
    println("Ingrese la cantidad de superhéroes a registrar:")
    val cantidadSuperheroe = readLine()?.toInt()

    if ((cantidadSuperheroe == null) || (cantidadSuperheroe < 1)) {
        println("Cantidad inválida.")
        return ingresarSuperheroe()
    }

    val superheroes = mutableListOf<SuperHero>()

    for (i in 1..cantidadSuperheroe) {
        print("Nombre del superhéroe $i: ")
        val superhero = readLine() ?: ""
        print("Editorial: ")
        val publisher = readLine() ?: ""
        print("Nombre real: ")
        val realName = readLine() ?: ""
        print("Foto: ")
        val photo = readLine() ?: ""

        val nuevoSuperheroe = SuperHero(superhero, publisher, realName, photo)
        superheroes.add(nuevoSuperheroe)
        println("Superhéroe agregado correctamente.")
        println()
    }
    println("Datos de los superhéroes:")
    for (superheroe in superheroes) {
        println("Superhéroe: ${superheroe.superhero}")
        println("Editorial: ${superheroe.publisher}")
        println("Nombre real: ${superheroe.realname}")
        println("Foto: ${superheroe.photo}")
        println()
    }
}

/*fun main () {
    ingresarSuperheroe()
}*/

