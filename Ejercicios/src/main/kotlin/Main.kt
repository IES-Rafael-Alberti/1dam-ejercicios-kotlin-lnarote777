/**
 * Función principal del menú
 *
 * @exception NumberFormatException salta cuando se introduce una entrada distinta a un número entero positivo
 * @exception Exception
 */
fun main(){
    var terminar = false

    while (!terminar){
        try {
            menu_unidades()
            val opcion_unidades = selecionar_opcion()

            when(opcion_unidades){
                1 -> unidad_1()
                2 -> unidad_2()
                3 -> unidad_3()
                0 -> terminar = true
                else -> println("Opción no válida. Vuelva a elegir una opción.")
            }
        }catch (e: NumberFormatException){
            println("ERROR - Ingrese un número entero positivo")
        }
        catch (e: Exception){
            println("ERROR - $e")
        }
    }
}

/**
 * Función del menú de la unidad 1
 *
 * @exception NumberFormatException salta cuando se introduce una entrada distinta a un número entero positivo
 * @exception Exception
 */
fun unidad_1(){
    var salir_unidad1 = false

    while (!salir_unidad1){
        try {
            menu_unidad_1()
            val opcion = selecionar_opcion()

            when (opcion) {
                0 -> salir_unidad1 = true
                4 -> ej_1_4()
                6 -> ej_1_6()
                12 -> ej_1_12()
                15 -> ej_1_15()
                18 -> ej_1_18()
                20 -> ej_1_20()
                21 -> ej_1_21()
                22 -> ej_1_22()
                24 -> ej_1_24()
                25 -> ej_1_25()
                26 -> ej_1_26()
                27 -> ej_1_27()
                else -> println("**Opción no válida. Vuelva a elegir una opción.**")
            }
        }catch (e: NumberFormatException){
            println("**ERROR - Ingrese un número entero positivo**")
        }
        catch (e: Exception){
            println("**ERROR - $e**")
        }
    }
}

/**
 * Función del menú de la unidad 2
 * @exception NumberFormatException salta cuando se introduce una entrada distinta a un número entero positivo
 * @exception Exception
 */
fun unidad_2(){
    var salir_unidad2 = false

    while (!salir_unidad2){
        try {
            menu_unidad_2()
            val opcion = selecionar_opcion()

            when(opcion){
                0 -> salir_unidad2 = true
                1 -> condicionales()
                2 -> iterativas()
                3 -> excepciones()
                else -> println("**Opción no válida. Vuelva a elegir una opción.**")
            }
        }catch (e: NumberFormatException){
            println("**ERROR - Ingrese un número entero positivo**")
        }
        catch (e: Exception){
            println("**ERROR - $e**")
        }
    }
}

/**
 * Función del menú de las condicionales
 * @exception NumberFormatException salta cuando se introduce una entrada distinta a un número entero positivo
 * @exception Exception
 */
fun condicionales(){
    var salir_condicionales = false

    while (!salir_condicionales){
        try {
            menu_condicionales()
            val opcion = selecionar_opcion()

            when (opcion) {
                0 -> salir_condicionales = true
                2 -> ej_2_1_2()
                3 -> ej_2_1_3()
                6 -> ej_2_1_6()
                8 -> ej_2_1_8()
                10 -> ej_2_1_10()
                else -> println("**Opción no válida. Vuelva a elegir una opción.**")
            }
        }catch (e: NumberFormatException){
            println("**ERROR - Ingrese un número entero positivo**")
        }
        catch (e: Exception){
            println("**ERROR - $e**")
        }
    }
}

/**
 * Función del menú de las iterativas
 * @exception NumberFormatException salta cuando se introduce una entrada distinta a un número entero positivo
 * @exception Exception
 */
fun iterativas(){
    var salir_iterativas = false

    while (!salir_iterativas){
        try {
            menu_iterativas()
            val opcion = selecionar_opcion()

            when (opcion) {
                0 -> salir_iterativas = true
                2 -> ej_2_2_2()
                4 -> ej_2_2_4()
                6 -> ej_2_2_6()
                7 -> ej_2_2_7()
                8 -> ej_2_2_8()
                13 -> ej_2_2_13()
                15 -> ej_2_2_15()
                18 -> ej_2_2_18()
                19 -> ej_2_2_19()
                25 -> ej_2_2_25()

                else -> println("**Opción no válida. Vuelva a elegir una opción.**")
            }
        }catch (e: NumberFormatException){
            println("**ERROR - Ingrese un número entero positivo**")
        }
        catch (e: Exception){
            println("**ERROR - $e**")
        }
    }
}

/**
 * Función del menú de las excepciones
 * @exception NumberFormatException salta cuando se introduce una entrada distinta a un número entero positivo
 * @exception Exception
 */
fun excepciones(){
    var salir_excepsiones = false

    while (!salir_excepsiones){
        try {
            menu_excepciones()
            val opcion = selecionar_opcion()

            when (opcion) {
                0 -> salir_excepsiones = true
                2 -> ej_2_3_2()
                3 -> ej_2_3_3()
                4 -> ej_2_3_4()
                else -> println("**Opción no válida. Vuelva a elegir una opción.**")
            }
        }catch (e: NumberFormatException){
            println("**ERROR - Ingrese un número entero positivo**")
        }
        catch (e: Exception){
            println("**ERROR - $e**")
        }
    }
}

/**
 * Función del menú de la unidad 3
 */
fun unidad_3(){
    var salis_unidad3 = false

    while (!salis_unidad3){
        try {
            menu_unidad_3()
            val opcion = selecionar_opcion()

            when(opcion){
                0 -> salis_unidad3 = true
                1 -> listas()
                2 -> diccionarios()
                3 -> conjuntos()
                else -> println("**Opción no válida. Vuelva a elegir una opción.**")
            }
        }catch (e: NumberFormatException){
            println("**ERROR - Ingrese un número entero positivo**")
        }
        catch (e: Exception){
            println("**ERROR - $e**")
        }
    }
}

/**
 * Función del menú de listas y tuplas
 *
 * @exception NumberFormatException salta cuando se introduce una entrada distinta a un número entero positivo
 * @exception Exception
 */
fun listas(){
    var salir_listas = false

    while (!salir_listas){
        try {
            menu_listas()
            val opcion = selecionar_opcion()

            when (opcion) {
                0 -> salir_listas = true
                4 -> ej_3_1_4()
                6 -> ej_3_1_6()
                8 -> ej_3_1_8()
                9 -> ej_3_1_9()
                10 -> ej_3_1_10()
                13 -> ej_3_1_13()
                else -> println("**Opción no válida. Vuelva a elegir una opción.**")
            }
        }catch (e: NumberFormatException){
            println("**ERROR - Ingrese un número entero positivo**")
        }
        catch (e: Exception){
            println("**ERROR - $e**")
        }
    }
}

/**
 * Función del menú de diccionarios
 *
 * @exception NumberFormatException salta cuando se introduce una entrada distinta a un número entero positivo
 * @exception Exception
 */
fun diccionarios(){
    var salir_dic = false

    while (!salir_dic){
        try {
            menu_diccionarios()
            val opcion = selecionar_opcion()

            when (opcion) {
                0 -> salir_dic = true
                3 -> ej_3_2_3()
                5 ->  ej_3_2_5()
                6 -> ej_3_2_6()
                7 -> ej_3_2_7()
                8 -> ej_3_2_8()
                10 -> ej_3_2_10()
                11 -> ej_3_2_11()
                else -> println("**Opción no válida. Vuelva a elegir una opción.**")
            }
        }catch (e: NumberFormatException){
            println("**ERROR - Ingrese un número entero positivo**")
        }
        catch (e: Exception){
            println("**ERROR - $e**")
        }
    }
}

/**
 * Función del menú de conjuntos
 *
 * @exception NumberFormatException salta cuando se introduce una entrada distinta a un número entero positivo
 * @exception Exception
 */
fun conjuntos(){
    var salir_conjun = false

    while (!salir_conjun){
        try {
            menu_conjuntos()
            val opcion = selecionar_opcion()

            when (opcion) {
                0 -> salir_conjun = true
                1 -> ej_3_3_1()
                2 -> ej_3_3_2()
                3 -> ej_3_3_3()
                4 -> ej_3_3_4()
                5 -> ej_3_3_5()
                6 -> ej_3_3_6()
                else -> println("**Opción no válida. Vuelva a elegir una opción.**")
            }
        }catch (e: NumberFormatException){
            println("**ERROR - Ingrese un número entero positivo**")
        }
        catch (e: Exception){
            println("**ERROR - $e**")
        }
    }
}

/**
 * Muestra el menú de las unidades
 */
fun menu_unidades(){
    println()
    println("UNIDADES")
    println("---------------------")
    println("1 - Unidad 1")
    println("2 - Unidad 2")
    println("3 - Unidad 3")
    println("0 - Terminar")
}

/**
 * Muestra el menú de la unidad 1
 */
fun menu_unidad_1(){
    println()
    println("UNIDAD - 1")
    println("---------------------")
    println("Ejercicio 4")
    println("Ejercicio 6")
    println("Ejercicio 12")
    println("Ejercicio 15")
    println("Ejercicio 18")
    println("Ejercicio 20")
    println("Ejercicio 21")
    println("Ejercicio 22")
    println("Ejercicio 24")
    println("Ejercicio 25")
    println("Ejercicio 26")
    println("Ejercicio 27")
    println("0 - Atrás")
}

/**
 * Muestra el menú de la unidad 2
 */
fun menu_unidad_2(){
    println()
    println("UNIDAD - 2")
    println("---------------------")
    println("1 - Condicionales")
    println("2 - Iterativas")
    println("3 - Excepciones")
    println("0 - Atrás")
}

/**
 * Muestra el menú de condicionales
 */
fun menu_condicionales(){
    println()
    println("UNIDAD 2 - CONDICIONALES")
    println("---------------------")
    println("Ejercicio 2")
    println("Ejercicio 3")
    println("Ejercicio 6")
    println("Ejercicio 8")
    println("Ejercicio 10")
    println("0 - Atrás")
}

/**
 * Muestra el menú de iterativas
 */
fun menu_iterativas(){
    println()
    println("UNIDAD 2 - ITERATIVAS")
    println("---------------------")
    println("Ejercicio 2")
    println("Ejercicio 4")
    println("Ejercicio 6")
    println("Ejercicio 7")
    println("Ejercicio 8")
    println("Ejercicio 13")
    println("Ejercicio 15")
    println("Ejercicio 18")
    println("Ejercicio 19")
    println("Ejercicio 25")
    println("0 - Atrás")
}

/**
 * Muestra el menú de excepciones
 */
fun menu_excepciones(){
    println()
    println("UNIDAD 2 - EXCEPCIONES")
    println("---------------------")
    println("Ejercicio 2")
    println("Ejercicio 3")
    println("Ejercicio 4")
    println("0 - Atrás")
}

/**
 * Muestra el menú de la unidad 3
 */
fun menu_unidad_3(){
    println()
    println("UNIDAD - 3")
    println("---------------------")
    println("1 - Listas y tuplas")
    println("2 - Diccionarios")
    println("3 - Conjuntos")
    println("0 - Atrás")
}

/**
 * Muestra el menú de listas y tuplas
 */
fun menu_listas(){
    println()
    println("UNIDAD 3 - LISTAS Y TUPLAS")
    println("---------------------")
    println("Ejercicio 4")
    println("Ejercicio 6")
    println("Ejercicio 8")
    println("Ejercicio 9")
    println("Ejercicio 10")
    println("Ejercicio 13")
    println("0 - Atrás")
}

/**
 * Muestra el menú de diccionarios
 */
fun menu_diccionarios(){
    println()
    println("UNIDAD 3 - DICCIONARIOS")
    println("---------------------")
    println("Ejercicio 3")
    println("Ejercicio 5")
    println("Ejercicio 6")
    println("Ejercicio 7")
    println("Ejercicio 8")
    println("Ejercicio 10")
    println("Ejercicio 11")
    println("0 - Atrás")
}

/**
 * Muestra el menú de conjuntos
 */
fun menu_conjuntos() {
    println()
    println("UNIDAD 3 - CONJUNTOS")
    println("---------------------")
    println("Ejercicio 1")
    println("Ejercicio 2")
    println("Ejercicio 3")
    println("Ejercicio 4")
    println("Ejercicio 5")
    println("Ejercicio 6")
    println("0 - Atrás")
}

/**
 * Pide una opción
 */
fun selecionar_opcion(): Int {
    print("Elige una opción -> ")
    val opcion = readln().toInt()

    if (opcion < 0){
        throw NumberFormatException()
    }

    return opcion
}

