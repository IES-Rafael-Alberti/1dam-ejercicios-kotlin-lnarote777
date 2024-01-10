import java.util.*
import kotlin.math.pow

/**
 * Función principal de la lotería
 */
fun ej_3_1_4(){
    val numeros: MutableList<Int> = mutableListOf()

    println("Ingrese los números de la lotería: ")

    pedir_numeros_4(numeros)
}

/**
 * Pide los números de la lotería
 *
 * @param numeros Lista donde se meten los números de la loteria
 */
fun pedir_numeros_4(numeros: MutableList<Int>){
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

/**
 * Pide el reintegro
 *
 * @param numeros lista con los números de la lotería
 */
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



/**
 * Función principal
 */
fun ej_3_1_6(){
    val asignaturas: MutableList<String> = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val aprobadas : MutableList<String> = mutableListOf()
    preguntar_nota(asignaturas, aprobadas)
}

/**
 * Pregunta la nota de cada asignatura y muestra cual se tiene que repetir
 *
 * @param asignaturas Lista de asignaturas
 * @param aprobadas Lista vacía
 */
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

    if (asignaturas.isNotEmpty()){
        print("No tienes que repetir ninguna asignatura")
    }else{
        print("Tienes que repetir $asignaturas")
    }

}



/**
 * Comprueba si la palabra introducida es un palíndromo
 */
fun ej_3_1_8(){
    print("Introduce una palabra para saber si es un palíndromo: ")
    val palabra = readln()
    var invertida = palabra.lowercase()
    invertida = invertida.reversed()

    if (palabra == invertida){
        print("$palabra es un palíndromo")
    }else{
        print("$palabra no es un palíndromo")
    }
}



/**
 * funcion principal
 */
fun ej_3_1_9(){
    val palabra = pedir_palabra()
    val vocales = contar_vocales(palabra)
    print(vocales)
}

/**
 * Pide una palabra
 *
 * @return retorna la palabra introducida
 */
fun pedir_palabra(): List<Char>{
    print("Introduce una palabra: ")
    val palabra =readln().toList()
    return palabra
}

/**
 * Cuenta las vocales que tiene la palabra
 *
 * @param palabra lista de caracteres de la palabra introducida
 * @return retorna la lista de las vocales contadas
 */
fun contar_vocales(palabra: List<Char>): MutableList<MutableList<Any>> {
    val vocales: MutableList<MutableList<Any>> = mutableListOf(
        mutableListOf("a", 0),
        mutableListOf("e", 0),
        mutableListOf("i", 0),
        mutableListOf("o", 0),
        mutableListOf("u", 0)
    )

    for (vocal in vocales){
        vocal[1] = palabra.count { it == vocal[0] }

    }
    return vocales
}


/**
 * Ordena la lista de precios y muestra el precio mayor y el menor
 */
fun ej_3_1_10(){
    var precio: MutableList<Int> = mutableListOf(50, 75, 46, 22, 80, 65, 8)
    precio = precio.sorted().toMutableList()
    println("Precios: $precio")

    val menor = precio[0]
    val mayor = precio[6]

    println("Precio menor: $menor")
    println("precio mayor: $mayor")
}



/**
 * Función principal
 */
fun ej_3_1_13(){
    val numeros = pedir_numeros_13( )
    val enteros = convertir_a_enteros(numeros)
    print(media_y_desviación_numeros(enteros))
}

/**
 * Pide una serie de números
 *
 * @return lista de los números introducidos
 */
fun pedir_numeros_13(): List<String>{
    print("Introduzca una serie de números separados por coma: ")
    val num = readln().split(", ")

    return num
}

/**
 * Convierte los números de la lista en enteros
 *
 * @param numeros lista de caracteres
 * @return lista de enteros
 */
fun convertir_a_enteros(numeros: List<String>): List<Int>{
    return numeros.map { it.toInt() }
}

/**
 * Calcula la media y la desviación típica de los números introducidos
 *
 * @param enteros lista de enteros
 */
fun media_y_desviación_numeros(enteros: List<Int>){
    var suma = enteros.sum()
    var suma_desviacion = enteros.sumBy { it * it }

    val media = suma.toDouble()/enteros.size
    val  desviacion = kotlin.math.sqrt((suma_desviacion.toDouble() / enteros.size) - media.pow(2))

    println("Media: $media")
    println("Desviación típica: $desviacion")
}



/**
 * Calcula el precio por los kilos que se quieren de una fruta determinada de la lista
 */
fun ej_3_2_3(){
    val frutas_precios = mapOf("plátano" to  1.35, "manzana" to 0.80, "pera" to 0.85, "naranja" to 0.70)
    println("---Fruteria Manolo tenemos todo tipos de fruta excepto las que no tenemos :) -----")
    print("¿Qué fruta quiere? ")
    val fruta = readln().lowercase()

    if (fruta in frutas_precios){
        print("¿Cuántos kilos quiere? ")
        val kilos = readln().toFloat()
        print("$fruta: ${frutas_precios.get(fruta)?.times(kilos)}€ ")
    }
    else {
        print("La fruta no se encuentra en esta frutería ")
    }
}



/**
 * Muestra los créditos de cada asignatura y los créditos totales que hay
 */
fun ej_3_2_5(){
    val asignaturas = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)

    var total= 0

    for((asignatura, creditos) in asignaturas.iterator()){
        println("$asignatura tiene $creditos creditos")
        total += creditos
    }
    println("Número de creditos totales: $total")
}



/**
 * Pide un dato y su valor hasta que el usuario ya no quiera continuar
 */
fun ej_3_2_6(){
    var info = mutableMapOf<String,String>()

    var boolean = true
    while (boolean){
        print("Introduzca el dato que desea añadir: ")
        val clave = readln()
        print("Introduzca su $clave: ")
        val valor = readln()
        info[clave]=valor
        println(info)

        while (true){
            print("¿Desea añadir más datos? (s/n) ")
            val continuar = readln().lowercase()
            if (continuar == "n"){
                boolean = false
                break
            }
            else if (continuar == "s"){
                boolean = true
                break
            }
            else{
                print("Error - Introducción no válida")
                continue
            }
        }
    }
}



/**
 * Pide los artículos de la compra y sus precios y los muestra en forma de lista
 */
fun ej_3_2_7(){

    var lista_compra = mutableMapOf<String, Float>()
    var cont = 1

    while (true){
        print("Artículo ($cont): ")
        val articulo = readln()

        print("Precio (€): ")
        val precio = readln().toFloat()

        val respuesta = contestar_pregunta()

        if (respuesta == "s" || respuesta == "Si" || respuesta == "si" || respuesta == "Sí" || respuesta == "sí"){
            cont ++
            lista_compra[articulo] = precio
        }
        else if (respuesta == "n" || respuesta == "no" || respuesta == "No"){
            lista_compra[articulo] = precio

            println("LISTA DE LA COMPRA")
            println("------------------")

            for ((articulos, precios) in lista_compra.iterator()){
                println("$articulos    $precios€")
            }
            break
        }
    }
}

/**
 * Pregunta para añadir artículos
 *
 * @return la respuesta introducida
 */
fun contestar_pregunta(): String {
    val respuestas = setOf("s", "Si", "si", "Sí", "sí", "n", "no", "No")

    print("¿Desea añadir más artículos? ")
    var respuesta = readln()

    while (respuesta !in respuestas){
        println("Error - Respuesta inválida.")
        print("¿Desea añadir más artículos? ")
        respuesta = readln()
    }

    return respuesta
}



/**
 * Función principal
 */
fun ej_3_2_8(){
    val frase = pedir_frase()
    val esp_ing = crear_diccionario()
    traductor(esp_ing, frase)
}

/**
 * Carea un diccionario con las palabras introducidas por el usuario
 *
 * @return el diccionario
 */
fun crear_diccionario(): MutableMap<String, String> {
    var diccionario = mutableMapOf<String, String>()

    print("Introduzca las palabra en español y su traducción al inglés con el formato <palabra>:<traducción> y separadas por comas: ")
    val palabras = readln().split(", ")

    for (traduccion in palabras){
        val (espanol, ingles) = traduccion.split(":")
        diccionario[espanol] = ingles
    }
    return diccionario
}

/**
 * Pide la frase a traducir
 */
fun pedir_frase(): String {
    print("Introduzca la frase que desee traducir: ")
    val frase = readln()

    return frase
}

/**
 * Muestra la frase con las palabras, introducidas en el diccionario, traducidas
 * @param diccionario con las palabras y su traducción
 * @param frase frase que el usuario desea traducir
 */
fun traductor(esp_ing: MutableMap<String, String>, frase: String){
    for (palabra in frase.split(" ")){
        if (palabra in esp_ing){
            print("${esp_ing[palabra]} ")
        }else{
            print("$palabra ")
        }
    }
}


/**
 * Función principal
 */
fun ej_3_2_10(){
    var base_datos_clientes = mutableMapOf<String,MutableMap<String, String>>()

    while (true){
        mostrar_menu()
        print("Seleccione una opción -> ")
        val opcion = readln().toInt()

        if (opcion == 1) { agregar_cliente(base_datos_clientes) }
        else if (opcion == 2) {eliminar_cliente(base_datos_clientes)}
        else if (opcion == 3) {mostrar_cliente(base_datos_clientes)}
        else if (opcion == 4) {listar_clientes(base_datos_clientes)}
        else if (opcion == 5) {listar_clientes_preferentes(base_datos_clientes)}
        else if (opcion == 6) {
            print("Programa terminado.")
            break
        }
        else{
            print("Opción no válida. Por favor, elija una opción del 1 al 6.")
        }
    }
}

/**
 * Imprime el menú del programa
 */
fun mostrar_menu(){
    println("Menú:")
    println("1. Añadir cliente")
    println("2. Eliminar cliente")
    println("3. Mostrar cliente")
    println("4. Listar todos los clientes")
    println("5. Listar clientes preferentes")
    println("6. Terminar")
}

/**
 * Función para agregar los datos de un cliente al diccionario
 *
 * @param base_datos_clientes diccionario con otro diccionario vacío
 */
fun agregar_cliente(base_datos_clientes: MutableMap<String, MutableMap<String, String>>){
    print("Ingrese el NIF del cliente: ")
    val nif = readln()
    print("Ingrese el nombre del cliente: ")
    val nombre = readln()
    print("Ingrese la dirección del cliente: ")
    val direccion = readln()
    print("Ingrese el teléfono del cliente: ")
    val telefono = readln()
    print("Ingrese el correo del cliente: ")
    val correo = readln()
    print("¿Es cliente preferente? (Sí/No): ")
    val preferente = readln().lowercase() == "sí"

    var base_datos = mutableMapOf<String, String>()
    base_datos["Nombre"]=nombre
    base_datos["Dirección"]= direccion
    base_datos["Teléfono"]= telefono
    base_datos["Correo"]= correo
    base_datos["Preferente"]= preferente.toString()

    base_datos_clientes[nif] = base_datos

    println("Cliente $nombre añadido correctamente.")
}

/**
 * Elimina a un cliente del diccionario según su NIF
 *
 * @param base_datos_clientes diccionario con los datos de los clientes
 */
fun eliminar_cliente(base_datos_clientes: MutableMap<String, MutableMap<String, String>>){
    print("Introduzca el nif de cliente que desea eliminar: ")
    val nif = readln()

    if (nif in base_datos_clientes){
        base_datos_clientes.remove(nif)
        println("Cliente con NIF $nif eliminado correctamente.")
    }else{
        println("No se encontró ningún cliente con el NIF $nif en la base de datos")
    }
}

/**
 * Muestra el nif y el nombre del cliente que se desea ver
 *
 * @param base_datos_clientes diccionario con los datos de los clientes
 */
fun mostrar_cliente(base_datos_clientes: MutableMap<String, MutableMap<String, String>>){
    print("Introduzca el nif de cliente que desea ver: ")
    val nif = readln()


    if (base_datos_clientes.contains(nif)){
        println("Datos del cliente:")
        for ((nif, cliente) in base_datos_clientes[nif]!!.iterator()){
            println("$nif $cliente")
        }
    }else{
        println("No se encontró ningún cliente con el NIF $nif en la base de datos")
    }
}

/**
 * Muestra el nif y el nombre de todos los clientes en el diccionario
 *
 * @param base_datos_clientes diccionario con los datos de todos los clientes
 */
fun listar_clientes(base_datos_clientes: MutableMap<String, MutableMap<String, String>>){
    println("Listado de clientes:")
    for ((nif, cliente) in base_datos_clientes.iterator()){
        println("NIF: $nif, Nombre: ${cliente["Nombre"]}")
    }
}

/**
 * Muestra los clientes que son preferentes
 *
 * @param base_datos_clientes diccionario con los datos de los clientes
 */
fun listar_clientes_preferentes(base_datos_clientes: MutableMap<String, MutableMap<String, String>>){
    println("Listado de clientes preferentes:")
    for ((nif, cliente) in base_datos_clientes.iterator()){
        if (cliente["Preferente"] == "true"){
            println("NIF: $nif, Nombre: ${cliente["Nombre"]}")
        }
    }
}



/**
 * Convierte el string en un diccionario y lo muestra por pantalla
 */
fun ej_3_2_11(){
    val directorio_texto = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"

    val lineas = directorio_texto.split("\n")

    val nombre_campos = lineas[0].split(";")

    var directorio_clientes = mutableMapOf<String,MutableMap<String,String>>()

    for (linea in lineas.drop(1)){
        if (linea.isNotEmpty()){
            val valores = linea.split(";")

            val clientes_info = mutableMapOf<String, String>()
            for (i in nombre_campos.indices){
                clientes_info[nombre_campos[i]] = valores[i]
            }

            directorio_clientes[valores[0]] = clientes_info
        }
    }

    print(directorio_clientes)
}



/**
 * Muestra por pantalla Las direcciones de los clientes sin repetirse
 */
fun ej_3_3_1(){
    val lista_compras = listOf(
        listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        listOf("Jorge Russo", 7, 699, "Mirasol 218"),
        listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        listOf("Jorge Russo", 15, 958, "Mirasol 218")
    )

    var domicilios = mutableSetOf<Any>()
    for (compra in lista_compras){
        domicilios.add(compra[3])
    }

    print(domicilios)
}



/**
 * Función principal
 */
fun ej_3_3_2(){

    val primaria = añadir_primaria()
    val conjunto_primaria = setOf(primaria)
    println("Lista alumnado de primaria:")
    println("$conjunto_primaria")

    val secundaria = añadir_secundaria()
    val conjunto_secundaria = setOf(secundaria)
    println("Lista alumnado de secundaria:")
    println("$conjunto_secundaria")

    alumnosRepetidos(conjunto_primaria, conjunto_secundaria)
    alumnosNoRepetidos(conjunto_primaria, conjunto_secundaria)
    primariaIncluidosSecundaria(conjunto_primaria, conjunto_secundaria)  //Falta por hacer
}

fun finalizar(){
    println("---Cuando desee finalizar introduzca x ---")
}

/**
 * Función para añadir alumnos a primaria
 *
 * @return una lista con todos los nombre de los alumnos
 */
fun añadir_primaria(): MutableList<String> {
    finalizar()

    println("----ALUMNADO PRIMARIA----")

    var alumnos_primaria = mutableListOf<String>()

    while (true){
        print("Introduzca el nombre del alumno: ")
        val nombre_pila = readln()

        if (nombre_pila.lowercase() == "x"){
            break
        }else{
            nombre_pila.replaceFirstChar{ char -> char.titlecase() }
            alumnos_primaria.add(nombre_pila)
        }
    }
    return alumnos_primaria
}

/**
 * Función para añadir alumnos a secundaria
 *
 * @return una lista con todos los nombre de los alumnos
 */
fun añadir_secundaria(): MutableList<String> {
    finalizar()

    println("----ALUMNADO SECUNDARIA----")

    var alumnos_secundaria = mutableListOf<String>()

    while (true){
        print("Introduzca el nombre del alumno: ")
        val nombre_pila = readln()

        if (nombre_pila.lowercase() == "x"){
            break
        }else{
            alumnos_secundaria.add(nombre_pila)
        }
    }
    return alumnos_secundaria
}

/**
 * Muestra un boobleano
 *
 * @param conjunto_primaria conjunto de alumnos de primaria
 * @param conjunto_secundaria conjunto de alumnos de secundaria
 */
fun primariaIncluidosSecundaria(conjunto_primaria: Set<MutableList<String>>, conjunto_secundaria: Set<MutableList<String>>) {

    val incluidos = conjunto_primaria.containsAll(conjunto_secundaria)

    println("¿Los nombres de primaria están incluidos en secundaria?: $incluidos")
}

/**
 * Muestra una lista de los nombres de los alumnos que están repetidos
 *
 * @param conjunto_primaria conjunto de alumnos de primaria
 * @param conjunto_secundaria conjunto de alumnos de secundaria
 */
fun alumnosRepetidos(conjunto_primaria: Set<MutableList<String>>, conjunto_secundaria: Set<MutableList<String>>){
    val repetidos = conjunto_primaria.intersect(conjunto_secundaria)
    println("Nombres que se repiten en los dos cursos: $repetidos")
}

/**
 * Muestra una lista de los nombres de los alumnos que no están repetidos
 *
 * @param conjunto_primaria conjunto de alumnos de primaria
 * @param conjunto_secundaria conjunto de alumnos de secundaria
 */
fun alumnosNoRepetidos(conjunto_primaria: Set<MutableList<String>>, conjunto_secundaria: Set<MutableList<String>>) {
    val norepetidos = conjunto_primaria - conjunto_secundaria
    println("Nombres de primaria que no se repiten en secundaria: $norepetidos")
}



/**
 * Muestra el conjunto de la siguiente manera [[], [6], [1], [6, 1], [4], [6, 4], [1, 4], [6, 1, 4]]
 */
fun ej_3_3_3(){
    val conjunto_original = setOf(6, 1, 4)
    val result = conjunto_potencia(conjunto_original)
    print(result)
}

/**
 *
 * @return una lista de conjuntos
 */
fun conjunto_potencia(conjunto_original: Set<Int>): List<Set<Int>> {
    val potencia = mutableListOf<Set<Int>>(setOf())

    for (elemento in conjunto_original){
        val nuevo_subconjunto = mutableListOf<Set<Int>>()

        for (subconjunto in potencia){
            nuevo_subconjunto.add(subconjunto + elemento)
        }
        potencia.addAll(nuevo_subconjunto)
    }
    return potencia
}



/**
 * Muetstra las listas de frutas
 */
fun ej_3_3_4(){
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")

    println("Lista frutas1: $frutas1")
    println("Lista frutas2: $frutas2")

    crear_conjunto(frutas1, frutas2)
}

/**
 * Convierte las listas en conjuntos y muestra las frutas comunes
 *
 * @param frutas1 lista de frutas 1
 * @param frutas2 lista de frutas 2
 */
fun crear_conjunto(frutas1: List<String>, frutas2: List<String>){
    val set_frutas1  = frutas1.toSet()
    val set_frutas2 = frutas2.toSet()

    val frutas_comunes = set_frutas1.intersect(set_frutas2)
    println("Frutas que hay en común en las dos listas: $frutas_comunes")

    solo_frutas1(set_frutas1, set_frutas2)
    solo_frutas2(set_frutas1, set_frutas2)
}

/**
 * Muestra las frutas que solo están en la lista 1
 *
 * @param set_frutas1 conjunto de frutas 1
 * @param set_frutas2 conjuntos de frutas 2
 */
fun solo_frutas1(set_frutas1: Set<String>, set_frutas2: Set<String>){
    val frutas_solo_en_frutas1 = set_frutas1 - set_frutas2

    println("Frutas que están en frutas1 pero no en frutas2 $frutas_solo_en_frutas1")
}

/**
 * Muestra las frutas que solo están en la lista 2
 *
 * @param set_frutas1 conjunto de frutas 1
 * @param set_frutas2 conjuntos de frutas 2
 */
fun solo_frutas2(set_frutas1: Set<String>, set_frutas2: Set<String>){
    val frutas_solo_en_frutas2 = set_frutas2 - set_frutas1

    println("Frutas que están en frutas2 pero no en frutas1 $frutas_solo_en_frutas2")
}



/**
 * Muestra los números, los pares, los múltiplos de 3 y la intersección de los pares y los múltiplos de la lista
 */
fun ej_3_3_5(){
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = crear_conjuntosPares(numeros)
    val multiplos = multiplos_de_tres(numeros)
    val interseccion = interseccion_pares_multiplos(pares, multiplos)

    println("Lista números: $numeros")
    println("Números pares de la lista: $pares")
    println("Multiplos de 3 en la lista: $multiplos")
    println("Intersección entre los números pares y los múltiplos de 3: $interseccion")
}

/**
 * Crea un conjunto con los pares
 *
 * @param numeros conjunto de números
 * @return conjunto de números pares de la lista números
 */
fun crear_conjuntosPares(numeros: Set<Int>): MutableSet<Int> {
    val pares = mutableSetOf<Int>()

    for (numero in numeros) {
        if( numero % 2 == 0) {
            pares.add(numero)
        }
    }
    return pares
}

/**
 * Crea un conjunto con los múltiplos de tres
 *
 * @param numeros conjunto de números
 * @return conjunto de números múltiplos de tres de la lista números
 */
fun multiplos_de_tres(numeros: Set<Int>): MutableSet<Int> {
    val multiplos3 = mutableSetOf<Int>()

    for (numero in numeros) {
        if (numero % 3 == 0) {
            multiplos3.add(numero)
        }
    }
    return multiplos3
}

/**
 * Hace la intersección entre pares y múltiplos
 *
 * @param pares conjunto de números pares
 * @param multiplos conjunto de múltiplos de tres
 * @return la intersección de los dos conjuntos
 */
fun interseccion_pares_multiplos(pares: MutableSet<Int>, multiplos: MutableSet<Int>): Set<Int> {
    val inter = pares.intersect(multiplos)
    return inter
}



/**
 * Junta las vocales y las consonantes y muestra los tres conjuntos ordenados
 */
fun ej_3_3_6(){
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val consonantes = setOf('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z')
    val letras_comunes = vocales + consonantes
    println("Vocales: ${vocales.sorted()}")
    println("Consonantes: ${consonantes.sorted()}")
    println("Abecedario: ${letras_comunes.sorted()}" )
}