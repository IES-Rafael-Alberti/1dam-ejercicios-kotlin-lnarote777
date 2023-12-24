

fun ej_2_1_2(){
    val contrasena = "contraseña"

    print("Introduzca la contraseña: ")
    val password = readln().lowercase()

    if (contrasena == password){
        print("Contraseña correcta")
    }
    else {
        print("Contraseña incorrecta")
    }
}


fun ej_2_1_3(){
    println("Introduzca dos numeros para dividirlos. Ejemplo(3/2):")
    val numeros = readln().split("/")
    val num1 = numeros[0].toInt()
    val num2 = numeros[1].toInt()

    if (num1 == 0 || num2 == 0 ){
        print("Error - No se puede dividir por 0")
    }
    else{
        print(num1/num2)
    }
}


fun ej_2_1_6(){
    print("Nombre: ")
    val nombre = readln().uppercase()

    print("Sexo H/M: ")
    val sexo = readln().uppercase()

    if (sexo == "M" && nombre <= "M") {
        print("Perteneces al grupo A")
    }
    else if (sexo == "H" && nombre >= "N"){
        print("Perteneces al grupo A")
    }
    else{
        print("Perteneces al grupo B")
    }
}


fun ej_2_1_8(){
    print("Introduzca la puntuación del empleado: ")
    val puntos = readln().toDouble()

    val inaceptable = 0.0
    val aceptable = 0.4
    val meritorio = 0.6
    var level = ""

    level = if (puntos == inaceptable) {
        "inaceptable"
    }
    else if (puntos == aceptable){
        "aceptable"
    }
    else if (puntos >= meritorio) {
        "meritorio"
    }
    else {
        ""
    }

    print("Nivel del empleado $level")
}


fun ej_2_1_10(){
    print("¿Desea piza vegetariana? (Sí/No): ")
    val pizza = readln().lowercase()
    val ing = "Mozzarella, salsa tomate y"
    var ingredientes = ""

    if (pizza == "sí" || pizza == "si"){
        print("Elija un ingrediente: Pimiento / Tofu. ")
        ingredientes = readln()
        print("Su pizza es vegetariana. Ingredientes: $ing $ingredientes")
    }
    else {
        print("Elija un ingrediente: Peperoni / Jamón / Salmón. ")
        ingredientes = readln()
        print("Su pizza no es vegetariana. Ingredientes: $ing $ingredientes")
    }
}


fun ej_2_2_2(){
    print("Introduzca su edad: ")
    val edad = readln().toInt()

    var cont = 1
    var years = ""

    for (i in 1..edad ){
        cont += i
        if (i != edad){
            years += "$i, "
        }
        else {
            years += "$edad años."
        }
    }
    print(years)
}


fun ej_2_2_4(){
    print("Introduzca un número: ")
    val num = readln().toInt()

    var cuenta = ""

    for (i in num downTo 0)   {
        if (i != 0){
            cuenta += "$i, "
        }
        else{
            cuenta += "$i."
        }
    }
    print(cuenta)
}



fun ej_2_2_6(){
    print("Introduce la altura del triángulo: ")
    val num = readln().toInt()

    for (i in 0 until num) {
        for (x in 0 until i+1){
            print("*")
        }
        println()
    }
}


fun ej_2_2_7() {
    for (i in 0.. 10) {
        println("10 x $i = ${10*i}")
    }
}


fun ej_2_2_8(){
    print("Introduce la altura del triángulo: ")
    val num = readln().toInt()

    for (i in 1 .. num step 2) {
        for (x in i downTo 0 step 2){
            print("$x ")
        }
        println()
    }
}


fun ej_2_2_13(){
    do {
         print("Introduzca algo ('salir' para terminar): ")
         val frase = readln()
         println(frase)
    }while (frase != "salir")
}


fun ej_2_2_15(){
    var suma = 0
    do {
        print("Ingrese un número entero (0 para terminar): ")
        val num = readln().toInt()
        suma += num
    } while (num != 0)

    print("El sumatorio de todos los números es $suma")
}



fun ej_2_2_18(){
    var pares = 0
    var num: Int
    do {
       print("Introduzca un número entero positivo (-1 para finalizar): ")
        num = readln().toInt()

       if (num > 0) {
           val suma =suma_digitos(num)
           println("La suma de los digitos de $num es $suma")

           if (num % 2 == 0){
               pares += 1
           }
       }
    }while (num != -1)

    print("De los número ingresados, hay $pares que son números pares.")
}

fun suma_digitos(num: Int): Int{
    var suma = 0
    var n = num
    while (n > 0) {
        suma += n % 10
        n /= 10
    }
    return suma
}


fun  ej_2_2_19(){

    while (true) {

        menu()
        val opcion = selec_opcion()

        if (opcion == 1) {
            println("Comenzamos\n")
        } else if (opcion == 2) {
            println("Gazpacho, melón, sandía, albaricoques, frutos secos\n")
        }else if (opcion == 3){
            break
        }
        else {
            println("Error - opción no válida\n")
        }
    }
}

fun menu(){
    println("1 - Comenzar programa")
    println("2 - Imprimir listado")
    println("3 - Finalizar programa")
}

fun selec_opcion(): Int {
    print("Elija una opción: ")
    val opcion = readln().toInt()
    return opcion
}


fun ej_2_2_25(){
    print("Frase: ")
    var frase = readLine()?.trim() ?: ""
    var cantidad = 0
    var len_palabra_mas_larga = 0
    var palabra_mas_larga = ""

    while (frase.isNotEmpty()){
        cantidad ++

        val i = frase.indexOf(" ")
        val palabra: String

        if (i != -1){
            palabra = frase.substring(0, i)
            var j = i
            while (j < frase.length && frase[j] == ' '){
                j++
            }
            frase = frase.substring(j)
        }
        else{
            palabra = frase
            frase = ""
        }

        if (palabra.length > len_palabra_mas_larga){
            len_palabra_mas_larga = palabra.length
            palabra_mas_larga = palabra
        }

    }

    if (cantidad > 0 ){
        println("Palabra más larga: $palabra_mas_larga")
    }
    println("cantidad de palabras: $cantidad")
}



fun ej_2_3_2(){
    print("Introduzca un número entero positivo: ")

    try {
        val num = readln().toInt()
        var suma = ""

        if (num < 0){
            throw IllegalArgumentException ("El número no puede ser negativo")
        }

        for (i in 1..num step 2){
            if ( i != num ){
                suma += "$i, "
            }
            else {
                suma += "$num. "
            }
        }
        print(suma)
    }
    catch (e : IllegalArgumentException){
        print("Error - $e")
    }
    catch (e: NumberFormatException){
        print("Error - Introduzca un número")
    }
}


fun ej_2_3_3(){

}


fun ej_2_3_4(){

}

















