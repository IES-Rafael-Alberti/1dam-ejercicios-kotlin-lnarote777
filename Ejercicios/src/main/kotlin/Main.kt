fun main() {
    while (true){
        try {

                menu_unidades()
                var opcion = selecionar_opcion()
                if (opcion == 1) {
                    menu_unidad_1()
                    opcion = selecionar_opcion()
                    while (true) {

                        if (opcion == 0){
                            break
                        }

                        when (opcion) {
                            1 -> {
                                ej_1_4()
                                break
                            }
                            2 -> {
                                ej_1_6()
                                break
                            }
                            3 -> {
                                ej_1_12()
                                break
                            }
                            4 -> {
                                ej_1_15()
                                break
                            }
                            5 -> {
                                ej_1_18()
                                break
                            }
                            6 -> {
                                ej_1_20()
                                break
                            }
                            7 -> {
                                ej_1_21()
                                break
                            }
                            8 -> {
                                ej_1_22()
                                break
                            }
                            9 -> {
                                ej_1_24()
                                break
                            }
                            10 -> {
                                ej_1_25()
                                break
                            }
                            11 -> {
                                ej_1_26()
                                break
                            }
                            12 -> {
                                ej_1_27()
                                break
                            }
                            else -> {
                                println("** Opción no válida. Vuelva a elegir una opción. **")
                            }
                        }
                    }
                } else if (opcion == 2) {
                    menu_unidad_2()
                    var opcion = selecionar_opcion()
                    while (true) {
                        if (opcion == 1) {
                            menu_condicionales()
                            opcion = selecionar_opcion()
                            while (true) {

                                if (opcion == 0) {
                                    break
                                }

                                when (opcion) {
                                    1 -> {
                                        ej_2_1_2()
                                        break
                                    }
                                    2 -> {
                                        ej_2_1_3()
                                        break
                                    }
                                    3 -> {
                                        ej_2_1_6()
                                        break
                                    }
                                    4 -> {
                                        ej_2_1_8()
                                        break
                                    }
                                    5 -> {
                                        ej_2_1_10()
                                        break
                                    }
                                    else -> {
                                        println("** Opción no válida. Vuelva a elegir una opción. **")
                                    }
                                }
                            }
                        } else if (opcion == 2) {
                            menu_iterativas()
                            opcion = selecionar_opcion()
                            while (true) {

                                if (opcion == 0) {
                                    break
                                }

                                when (opcion) {
                                    1 -> {
                                        ej_2_2_2()
                                        break
                                    }
                                    2 -> {
                                        ej_2_2_4()
                                        break
                                    }
                                    3 -> {
                                        ej_2_2_6()
                                        break
                                    }
                                    4 -> {
                                        ej_2_2_7()
                                        break
                                    }
                                    5 -> {
                                        ej_2_2_8()
                                        break
                                    }
                                    6 -> {
                                        ej_2_2_13()
                                        break
                                    }
                                    7 -> {
                                        ej_2_2_15()
                                        break
                                    }
                                    8 -> {
                                        ej_2_2_18()
                                        break
                                    }
                                    9 -> {
                                        ej_2_2_19()
                                        break
                                    }
                                    10 -> {
                                        ej_2_2_25()
                                        break
                                    }
                                    else -> {
                                        println("** Opción no válida. Vuelva a elegir una opción. **")
                                    }
                                }
                            }
                        } else if (opcion == 3) {
                            menu_excepciones()
                            opcion = selecionar_opcion()
                            while (true) {

                                if (opcion == 0) {
                                    break
                                }

                                when (opcion) {
                                    1 -> {
                                        ej_2_3_2()
                                        break
                                    }
                                    2 -> {
                                        ej_2_3_3()
                                        break
                                    }
                                    3 -> {
                                        ej_2_3_4()
                                        break
                                    }
                                    else -> {
                                        println("** Opción no válida. Vuelva a elegir una opción. **")
                                    }
                                }
                            }
                        }
                        else if (opcion == 0){
                            break
                        }
                        else {
                            println("** Opción no válida. Vuelva a elegir una opción. **")
                        }
                    }
                } else if (opcion == 3) {
                    menu_unidad_3()
                    opcion = selecionar_opcion()
                    while (true) {
                        if (opcion == 1) {
                            menu_listas()
                            opcion = selecionar_opcion()
                            while (true) {

                                if (opcion == 0) {
                                    break
                                }

                                when (opcion) {
                                    1 -> {
                                        ej_3_1_4()
                                        break
                                    }
                                    2 -> {
                                        ej_3_1_6()
                                        break
                                    }
                                    3 -> {
                                        ej_3_1_8()
                                        break
                                    }
                                    4 -> {
                                        ej_3_1_9()
                                        break
                                    }
                                    5 -> {
                                        ej_3_1_10()
                                        break
                                    }
                                    6 -> {
                                        ej_3_1_13()
                                        break
                                    }
                                    else -> {
                                        println("** Opción no válida. Vuelva a elegir una opción. **")
                                    }
                                }
                            }
                        } else if (opcion == 2) {
                            menu_diccionarios()
                            opcion = selecionar_opcion()
                            while (true) {

                                if (opcion == 0) {
                                    break
                                }

                                when (opcion) {
                                    1 -> {
                                        ej_3_2_3()
                                        break
                                    }
                                    2 -> {
                                        ej_3_2_5()
                                        break
                                    }
                                    3 -> {
                                        ej_3_2_6()
                                        break
                                    }
                                    4 -> {
                                        ej_3_2_7()
                                        break
                                    }
                                    5 -> {
                                        ej_3_2_8()
                                        break
                                    }
                                    6 -> {
                                        ej_3_2_10()
                                        break
                                    }
                                    7 -> {
                                        ej_3_2_11()
                                        break
                                    }
                                    else -> {
                                        println("** Opción no válida. Vuelva a elegir una opción. **")
                                    }
                                }
                            }
                        } else if (opcion == 3) {
                            menu_conjuntos()
                            opcion = selecionar_opcion()
                            while (true) {

                                if (opcion == 0) {
                                    break
                                }

                                when (opcion) {
                                    1 -> {
                                        ej_3_3_1()
                                        break
                                    }
                                    2 -> {
                                        ej_3_3_2()
                                        break
                                    }
                                    3 -> {
                                        ej_3_3_3()
                                        break
                                    }
                                    4 -> {
                                        ej_3_3_4()
                                        break
                                    }
                                    5 -> {
                                        ej_3_3_5()
                                        break
                                    }
                                    6 -> {
                                        ej_3_3_6()
                                        break
                                    }
                                    else -> {
                                        println("** Opción no válida. Vuelva a elegir una opción. **")
                                    }
                                }
                            }
                        } else if (opcion == 0) {
                            break
                        }
                        else {
                            println("** Opción no válida. Vuelva a elegir una opción. **")
                        }
                    }
                }
                else if (opcion == 0) {
                    break
                }
                else {
                    println("** Opción no válida. Vuelva a elegir una opción. **")
                }


        }catch (e: NumberFormatException){
            println("ERROR - Ingrese un número entero positivo.")
        }catch (e: Exception){
            println("ERROR - $e")
        }

    }


}
fun menu_unidades(){
    println()
    println("UNIDADES")
    println("---------------------")
    println("1 - Unidad 1")
    println("2 - Unidad 2")
    println("3 - Unidad 3")
    println("0 - Terminar")
}

fun menu_unidad_1(){
    println()
    println("UNIDAD - 1")
    println("---------------------")
    println("1 - Ejercicio 4")
    println("2 - Ejercicio 6")
    println("3 - Ejercicio 12")
    println("4 - Ejercicio 15")
    println("5 - Ejercicio 18")
    println("6 - Ejercicio 20")
    println("7 - Ejercicio 21")
    println("8 - Ejercicio 22")
    println("9 - Ejercicio 24")
    println("10 - Ejercicio 25")
    println("11 - Ejercicio 26")
    println("12 - Ejercicio 27")
    println("0 - Atrás")
}

fun menu_unidad_2(){
    println()
    println("UNIDAD - 2")
    println("---------------------")
    println("1 - Condicionales")
    println("2 - Iterativas")
    println("3 - Excepciones")
    println("0 - Atrás")
}

fun menu_condicionales(){
    println()
    println("UNIDAD 2 - CONDICIONALES")
    println("---------------------")
    println("1 - Ejercicio 2")
    println("2 - Ejercicio 3")
    println("3 - Ejercicio 6")
    println("4 - Ejercicio 8")
    println("5 - Ejercicio 10")
    println("0 - Atrás")
}

fun menu_iterativas(){
    println()
    println("UNIDAD 2 - ITERATIVAS")
    println("---------------------")
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
    println("0 - Atrás")
}

fun menu_excepciones(){
    println()
    println("UNIDAD 2 - EXCEPCIONES")
    println("---------------------")
    println("1 - Ejercicio 2")
    println("2 - Ejercicio 3")
    println("3 - Ejercicio 4")
    println("0 - Atrás")
}

fun menu_unidad_3(){
    println()
    println("UNIDAD - 3")
    println("---------------------")
    println("1 - Listas y tuplas")
    println("2 - Diccionarios")
    println("3 - Conjuntos")
    println("0 - Atrás")
}

fun menu_listas(){
    println()
    println("UNIDAD 3 - LISTAS Y TUPLAS")
    println("---------------------")
    println("1 - Ejercicio 4")
    println("2 - Ejercicio 6")
    println("3 - Ejercicio 8")
    println("4 - Ejercicio 9")
    println("5 - Ejercicio 10")
    println("6 - Ejercicio 13")
    println("0 - Atrás")
}

fun menu_diccionarios(){
    println()
    println("UNIDAD 3 - DICCIONARIOS")
    println("---------------------")
    println("1 - Ejercicio 3")
    println("2 - Ejercicio 5")
    println("3 - Ejercicio 6")
    println("4 - Ejercicio 7")
    println("5 - Ejercicio 8")
    println("6 - Ejercicio 10")
    println("7 - Ejercicio 11")
    println("0 - Atrás")
}

fun menu_conjuntos() {
    println()
    println("UNIDAD 3 - CONJUNTOS")
    println("---------------------")
    println("1 - Ejercicio 1")
    println("2 - Ejercicio 2")
    println("3 - Ejercicio 3")
    println("4 - Ejercicio 4")
    println("5 - Ejercicio 5")
    println("6 - Ejercicio 6")
    println("0 - Atrás")
}

fun selecionar_opcion(): Int {
    print("Elige una opción -> ")
    val opcion = readln().toInt()

    if (opcion < 0){
        throw NumberFormatException()
    }

    return opcion
}

