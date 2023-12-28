fun main() {

    while (true) {
        menu_unidades()
        val opcion = selecionar_opcion()
        if (opcion == 1){
            menu_unidad_1()
            val opcion = selecionar_opcion()
            if (opcion == 1) { ej_1_4() }
            else if (opcion == 2) {ej_1_6()}
            else if (opcion == 3){ej_1_12()}
            else if (opcion == 4){ej_1_15()}
            else if (opcion == 5) {ej_1_18()}
            else if (opcion == 6) {ej_1_20()}
            else if (opcion == 7) {ej_1_21()}
            else if (opcion == 8) {ej_1_22()}
            else if (opcion == 9) {ej_1_24()}
            else if (opcion == 10) {ej_1_25()}
            else if (opcion == 11) {ej_1_26()}
            else if (opcion == 12) {ej_1_27()}
        }
        else if (opcion == 2){
            menu_unidad_2()
            val opcion = selecionar_opcion()
            if (opcion == 1){
                menu_condicionales()
                val opcion = selecionar_opcion()
                if (opcion == 1){ej_2_1_2()}
                else if (opcion == 2) {ej_2_1_3()}
                else if (opcion == 3) {ej_2_1_6()}
                else if (opcion == 4) {ej_2_1_8()}
                else if (opcion == 5) {ej_2_1_10()}
            }
            else if (opcion == 2){
                menu_iterativas()
                val opcion = selecionar_opcion()
                if (opcion == 1){ej_2_2_2()}
                else if (opcion == 5) {ej_2_2_4()}
                else if (opcion == 5) {ej_2_2_6()}
                else if (opcion == 5) {ej_2_2_7()}
                else if (opcion == 5) {ej_2_2_8()}
                else if (opcion == 5) {ej_2_2_13()}
                else if (opcion == 5) {ej_2_2_15()}
                else if (opcion == 5) {ej_2_2_18()}
                else if (opcion == 5) {ej_2_2_19()}
                else if (opcion == 5) {ej_2_2_25()}
            }
            else if (opcion == 3){
                menu_excepciones()
                val opcion = selecionar_opcion()
                if (opcion == 1){ej_2_3_2()}
                else if (opcion == 2) {ej_2_3_3()}
                else if (opcion == 3) {ej_2_3_4()}
            }
        }
        else if (opcion == 3){
            menu_unidad_3()
            val opcion = selecionar_opcion()
            if (opcion == 1){
                menu_listas()
                val opcion = selecionar_opcion()
                if (opcion == 1){ej_3_1_4()}
                else if (opcion == 2) {ej_3_1_6()}
                else if (opcion == 3) {ej_3_1_8()}
                else if (opcion == 4) {ej_3_1_9()}
                else if (opcion == 5) {ej_3_1_10()}
                else if (opcion == 6) {ej_3_1_13()}
            }
            else if (opcion == 2){
                menu_diccionarios()
                val opcion = selecionar_opcion()
                if (opcion == 1){ej_3_2_3()}
                else if (opcion == 2) {ej_3_2_5()}
                else if (opcion == 3) {ej_3_2_6()}
                else if (opcion == 4) {ej_3_2_7()}
                else if (opcion == 5) {ej_3_2_8()}
                else if (opcion == 6) {ej_3_2_10()}
                else if (opcion == 7) {ej_3_2_11()}
            }
            else if (opcion == 3){
                menu_conjuntos()
                val opcion = selecionar_opcion()
                if (opcion == 1){ej_3_3_1()}
                else if (opcion == 2){ej_3_3_2()}
                else if (opcion == 3){ej_3_3_3()}
                else if (opcion == 4){ej_3_3_4()}
                else if (opcion == 5){ej_3_3_5()}
                else if (opcion == 6){ej_3_3_6()}
            }
        }
    }
}
fun menu_unidades(){
    println("1 - Unidad 1")
    println("2 - Unidad 2")
    println("3 - Unidad 3")
}

fun menu_unidad_1(){
    println("1 - Ejercicio 4")
    println("2 - Ejercicio 6")
    println("3 - EJercicio 12")
    println("4 - EJercicio 15")
    println("5 - EJercicio 18")
    println("6 - EJercicio 20")
    println("7 - EJercicio 21")
    println("8 - EJercicio 22")
    println("9 - EJercicio 24")
    println("10 - EJercicio 25")
    println("11 - EJercicio 26")
    println("12 - EJercicio 27")
}

fun menu_unidad_2(){
    println("1 - Condicionales")
    println("2 - Iterativas")
    println("3 - Excepciones")
}

fun menu_condicionales(){
    println("1 - Ejercicio 2")
    println("2 - Ejercicio 3")
    println("3 - Ejercicio 6")
    println("4 - Ejercicio 8")
    println("5 - Ejercicio 10")
}

fun menu_iterativas(){
    println("1 - Ejercicio 2")
    println("2 - Ejercicio 4")
    println("3 - Ejercicio 6")
    println("4 - Ejercicio 7")
    println("5 - Ejercicio 8")
    println("6 - Ejercicio 13")
    println("7 - Ejercicio 15")
    println("8 - Ejercicio 18")
    println("9 - Ejercicio 19")
    println("10 - Ejercicio 25")
}

fun menu_excepciones(){
    println("1 - Ejercicio 2")
    println("2 - Ejercicio 3")
    println("3 - Ejercicio 4")
}

fun menu_unidad_3(){
    println("1 - Listas y tuplas")
    println("2 - Diccionarios")
    println("3 - Conjuntos")
}

fun menu_listas(){
    println("1 - Ejercicio 4")
    println("2 - Ejercicio 6")
    println("3 - Ejercicio 8")
    println("4 - Ejercicio 9")
    println("5 - Ejercicio 10")
    println("6 - Ejercicio 13")
}

fun menu_diccionarios(){
    println("1 - Ejercicio 3")
    println("2 - Ejercicio 5")
    println("3 - Ejercicio 6")
    println("4 - Ejercicio 7")
    println("5 - Ejercicio 8")
    println("6 - Ejercicio 10")
    println("7 - Ejercicio 11")
}

fun menu_conjuntos() {
    println("1 - Ejercicio 1")
    println("2 - Ejercicio 2")
    println("3 - Ejercicio 3")
    println("4 - Ejercicio 4")
    println("5 - Ejercicio 5")
    println("6 - Ejercicio 6")
}

fun selecionar_opcion(): Int {
    print("Elige una opción -> ")
    val opcion = readln().toInt()
    return opcion
}

