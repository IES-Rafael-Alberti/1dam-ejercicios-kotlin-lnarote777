fun ej_3_1_4(){
    val numeros: MutableList<Int> = mutableListOf()

    println("Ingrese los números de la lotería: ")

    pedir_numeros(numeros)
}

fun pedir_numeros(numeros: MutableList<Int>){
    var cont = 1
    while (cont != 7){

        print("($cont)-> ")
        var num_loteria = readln().toInt()

        if (0 < num_loteria && num_loteria > 50){
            print("** Número no válido, ingrese un número del 1 al 49 por favor. **\n($cont)-> ")
            num_loteria = readln().toInt()

            while (num_loteria in numeros){
                print("** Número repetido, ingrese otro por favor. **\n($cont)-> ")
                num_loteria = readln().toInt()
            }
            numeros.add(num_loteria)

            cont += 1
        }
        else {
            while (0>= num_loteria || 50 <= num_loteria){
                print("** Número no válido, ingrese un número del 1 al 49 por favor. **\n($cont)-> ")
                num_loteria = readln().toInt()
            }
            if (0 < num_loteria && num_loteria < 50){
                while (num_loteria in numeros){
                    print("** Número repetido, ingrese otro por favor. **\n($cont)-> ")
                    num_loteria = readln().toInt()
                }
            }
            numeros.add(num_loteria)

            cont += 1
        }
    }
    pedir_reintegro(numeros)
}
fun pedir_reintegro(numeros: MutableList<Int>){
    val numero  = numeros.sorted().toMutableList()

    print("Reintegro: ")
    var reintegro = readln().toInt()

    while (0 > reintegro || 9 < reintegro){
        print("Reintegro no válido. Ingrese un número del 1 al 9 por favor -> ")
        reintegro = readln().toInt()
    }
    numero += reintegro

    print("Sus números de la primitiva son: $numero")
}



fun ej_3_1_6(){
    val asignaturas: MutableList<String> = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val aprobadas : MutableList<String> = mutableListOf()
    preguntar_nota(asignaturas, aprobadas)
}

fun preguntar_nota(asignaturas: MutableList<String>, aprobadas: MutableList<String>){
    for (asignatura in asignaturas){
        print("Nota de $asignatura: ")
        val nota = readln().toFloat()

        if (nota >= 5){
            aprobadas.add(asignatura)
        }
    }
    for (asignatura in aprobadas){
        asignaturas.remove(asignatura)
    }

    print("Tienes que repetir $asignaturas")
}


fun ej_3_1_8(){

}