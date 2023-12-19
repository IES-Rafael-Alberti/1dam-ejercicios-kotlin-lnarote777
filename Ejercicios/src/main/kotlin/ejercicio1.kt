import kotlin.math.round
import kotlin.math.roundToLong

fun ej_1_4(){

    try {
        print("Temperatura en grados Celsius: ")
        val celsius= readln().toFloat()
        val fahrenheit = (celsius * 9/5) + 32

        print("Temperatura en Fahrenheit: $fahrenheit")
    }
    catch (e: Exception){
        print("ERROR -- Número inválido\n")
    }
}


fun ej_1_6(){

    print("Importe final: ")
    try {
        val precio = readln().toInt()
        val iva = 10
        val imp_sin_iva = precio / 1.1
        print("El precio sin IVA es de $imp_sin_iva€ y se le aplica el $iva%.")
    }
    catch (e:Exception){
        print("ERROR -- Número inválido")
    }
}


fun ej_1_12(){

    try {
        print("Introduzca su peso en kg: ")
        val peso = readln().toFloat()
        print("Introduzca su altura en metros: ")
        val altura = readln().toFloat()
        val imc = peso / (altura * altura)

        print("Sun índice de masa corporal (imc) es de ${round(imc)}")
    }
    catch (e:Exception){
        print("ERROR -- Número inválido")
    }
}


fun ej_1_15(){

    print("Cantidad depositada en cuenta de ahorros: ")
    try {
        val capital = readln().toFloat()
        val intereses = capital * (1 + 0.04)
        val year1 = capital * intereses
        val year2 = year1 * intereses
        val year3 = year2 * intereses
        println("Ahorros tras el primer año: ${round(year1)}")
        println("Ahorros tras el segundo año: ${round(year2)}")
        println("Ahorros tras el tercer año: ${round(year3)}")
    }
    catch (e: Exception){
        print("ERROR -- Número inválido")
    }
}

fun ej_1_18(){
    println("Escribe tu nombre completo: ")

    val name = readln()

    println(name.lowercase())
    println(name.uppercase())
    println(name) //Nose
}

fun ej_1_20(){
    print("Introduzca el nº de telefono de la empresa (preijo-teléfono-extensión): ")

    val telf = readln().split("-")

    println("El telefono de la empresa es ${telf[1]}")
}

fun ej_1_21(){
    println("Introduzca una frase:")

    val frase = readln()
    println(frase[-1])
}