/**
 * Comprueba si la contraseña introducida coincide con la contraseña guardada.
 */
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

/**
 * División de dos números
 */
fun ej_2_1_3(){
    try{
        println("Introduzca dos numeros para dividirlos. Ejemplo(3/2):")
        val numeros = readln().split("/")
        val num1 = numeros[0].toInt()
        val num2 = numeros[1].toInt()

        print(num1/num2)
    }
    catch (e: Exception){
        print("ERROR - No se puede dividir por cero")
    }
}

/**
 * Dice a qué grupo perteneces según nombre y sexo
 */
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

/**
 * Muestra el nivel del empleado según su puntuación
 */
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

/**
 * Muestra la pizza y los ingredientes elegidos
 */
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

/**
 * Muestra todos los años que ha cumplido el usuario desde 1 hasta la edad
 */
fun ej_2_2_2(){
    try {
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
    }catch (e: Exception){
        print("ERROR - Número no válido")
    }

}

/**
 *Muestra la cuenta atras del número introducido por el usuario
 */
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


/**
 * Muestra un triángulo de * con la altura introducida por el usuario
 */
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

/**
 * Muestra la tabla del 10
 */
fun ej_2_2_7() {
    for (i in 0.. 10) {
        println("10 x $i = ${10*i}")
    }
}

/**
 *Da Error
 */
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

/**
 * Repite lo que introduzca el usuario hasta que se quiera salir
 */
fun ej_2_2_13(){
    do {
         print("Introduzca algo ('salir' para terminar): ")
         val frase = readln()
         println(frase)
    }while (frase != "salir")
}


/**
 * Pide números hasta que el usuario pare y luego muestra el sumatorio de todos los números que se han introducido
 */
fun ej_2_2_15(){
    var suma = 0
    do {
        print("Ingrese un número entero (0 para terminar): ")
        val num = readln().toInt()
        suma += num
    } while (num != 0)

    print("El sumatorio de todos los números es $suma")
}


/**
 * comprueba cuantos números introducidos son pares
 */
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

/**
 * Suma de los dígitos introducidos por el usuario
 *
 * @param num Número introducido por el usuario
 * @return la suma de todos los dígitos
 */
fun suma_digitos(num: Int): Int{
    var suma = 0
    var n = num
    while (n > 0) {
        suma += n % 10
        n /= 10
    }
    return suma
}


/**
 * Función principal del ejercicio
 */
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
/**
 * Menú del programa
 */
fun menu(){
    println("1 - Comenzar programa")
    println("2 - Imprimir listado")
    println("3 - Finalizar programa")
}
/**
 * Elegir una opcion del menú
 *
 * @return opcion que elige el usuario
 */
fun selec_opcion(): Int {
    print("Elija una opción: ")
    val opcion = readln().toInt()
    return opcion
}

/**
 * Cuenta la cantidad de palabras que hay en la frase y muestra la palabra más larga
 */
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


/**
 *Muestra una serie de números impares hasta el número introducido
 *
 * @throws IllegalArgumentException Salta cuando el numero es negativo
 */
fun ej_2_3_2(){
    print("Introduzca un número entero positivo: ")

    try {
        val num = readln().toInt()
        var suma = ""

        if (num < 0){
            throw IllegalArgumentException ("El número no puede ser negativo.")
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

/**
 * Muestra una cuenta atrás desde el número introducido hasta 0
 *
 * @throws IllegalArgumentException Salta cuando el número es negativo
 */
fun ej_2_3_3(){
    var num_correcto = false
    var cuenta = ""

    do {
        try {
            print("Introduzca un número: ")
            val num = readln().toInt()

            if (num < 0){
                throw IllegalArgumentException("El número no puede ser negativo.")
            }


            for (i in num downTo 0){
                if (i != 0){
                    cuenta += "$i, "
                }else{
                    cuenta += "$i."
                }
            }

            num_correcto = true

        }
        catch (e: IllegalArgumentException){
            print("Error - $e")
        }
        catch (e: NumberFormatException){
            print("Error - Caracter inválido, por favor introduzca un número")
        }
    }while (!num_correcto)

    println(cuenta)
}

/**
 * Comprueba si el caracter introducido es un entero
 *
 * @exception Exception Salta si la entrada no es un número entero
 */
fun ej_2_3_4(){
    try {
        print("Introduce un número: ")
        val num = readln().toInt()
    }catch (e : Exception){
        print("Error - La entada no es correcta")
    }
}



















