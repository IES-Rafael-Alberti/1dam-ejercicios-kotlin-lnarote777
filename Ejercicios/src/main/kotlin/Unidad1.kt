import kotlin.math.round

/**
 * Calcula el paso de grados celsius a grados fahrenheit
 */
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


/**
 * Calcula el precio del producto sin iva
 */
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


/**
 * Calcula el imc del usuario
 */
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


/**
 * Calcula los ahorros del usuario tras 3 años con intereses
 */
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


/**
 * Imprime el nombre introducido en minúsculas, mayúsculas y con mayúsculas la primera letra
 */
fun ej_1_18(){
    print("Escribe tu nombre completo: ")

    val name = readln().split(" ")

    println(name.joinToString(" ").lowercase())
    println(name.joinToString(" ").uppercase())
    println(name.joinToString { it.capitalize() })

}


/**
 * Imprime un número de teléfono sin el prefijo ni la extensión
 */
fun ej_1_20(){
    print("Introduzca el nº de telefono de la empresa (preijo-teléfono-extensión): ")

    val telf = readln().split("-")

    println("El telefono de la empresa es ${telf[1]}")
}


/**
 * Imprime la frase introducida al revés
 */
fun ej_1_21(){
    println("Introduzca una frase:")

    val frase = readln()
    println(frase.reversed())
}


/**
 * Remplaza la vocal introducida por la misma en mayúsculas en la frase
 */
fun ej_1_22(){
    print("Escribe una farse: ")
    var frase = readln()

    print("Introduce una vocal: ")
    val vocal = readln()

    frase = frase.replace(vocal, vocal.uppercase())

    print(frase)
}


/**
 * Separa un precio en euros y céntimos
 */
fun ej_1_24(){
    print("Introduzca el precio del producto en euros (dos decimales): ")

    val precio = readln().toFloat()

    val euros = precio.toInt()
    val centimos = (precio - euros) * 100

    println("Nº de euros: $euros")
    print("Nº de céntimos: ${round(centimos)}")
}


/**
 * Detalla la fecha de nacimiento introducida.
 */
fun ej_1_25(){
    print("¿Cual es su fecha de nacimiento? (dd/mm/aaaa): ")

    val fecha = readln().split("/")
    val dia = fecha[0]
    val mes = fecha[1]
    val año = fecha[2]

    print("Usted nació el día $dia del $mes del año $año .")

}


/**
 * Hace una lista de la compra a partir de una lista separada por comas
 */
fun ej_1_26(){
    println("Introduzca la lista de la compra (separados por coma): ")

    val compra = readln().split(", ")
    println("Lista de la compra")
    println("------------------")

    for (producto in compra) {
        println(producto)
    }
}


/**
 *Muestra por pantalla una línea con los datos que ha introducido el usuario
 */
fun ej_1_27(){
    print("Nombre del procucto: ")
    val nombre = readln()

    print("Precio: ")
    val precio = readln().toFloat()

    print("Número de unidades: ")
    val unidades = readln().toInt()

    val total = precio * unidades

    print(String.format("%s %09.2f %03d %011.2f", nombre, precio, unidades, total))
}