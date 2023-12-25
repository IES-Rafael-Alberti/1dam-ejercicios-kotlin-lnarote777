fun ej_3_1_4(){
    val numeros = listOf<Int>()

    println("Ingrese los números de la lotería: ")
    pedirNumeros(numeros)
}

fun pedirNumeros(numeros: List<Int>): List<Int>{
    var cont = 1
    while (cont != 6){

        print("($cont)-> ")
        var num_loteria = readln().toInt()

        if (0 < num_loteria && num_loteria >50){
            print("** Número repetido, ingrese otro por favor. **\n($cont)-> ")
            num_loteria = readln().toInt()
            while (num_loteria in numeros){
                print("** Número repetido, ingrese otro por favor. **\n($cont)-> ")
                num_loteria = readln().toInt()
            }
            numeros.addLast(num_loteria)

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
                numeros.addLast(num_loteria)
            }
            numeros.addLast(num_loteria)

            cont += 1
        }
    }
    pedirReintegro(numeros)
}

fun pedirReintegro(numeros: List<Int>): List<Int>{

}