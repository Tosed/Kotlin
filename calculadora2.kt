fun main() {

    println("Digite o primeiro valor:")
    val number1: Int? = readLine()!!.toIntOrNull()

    println("Digite o segundo valor:")
    val number2: Int? = readLine()!!.toIntOrNull()

    println("Escolha uma operação:")
    val operacao: String = readLine()!!.toString()


    if(number1 != null && number2 != null){
        when(operacao){
            "+" -> soma(number1,number2)
            "-" -> subtrair(number1,number2)
            "*" -> multiplicar(number1,number2)
            "/" -> dividir(number1,number2)
            else -> println("Operação inválida")
        }

    }else {
        println("Valores nulos")
    }


}

fun soma(a: Int, b: Int): Int {
    val calcular = a.plus(b)
    println("Resultado é: $calcular")
    return calcular
}

fun subtrair(a: Int, b: Int): Int {
    val calcular = a.minus(b)
    println("Resultado é: $calcular")
    return calcular
}

fun multiplicar(a: Int, b: Int): Int {
    val calcular = a.times(b)
    println("Resultado é: $calcular")
    return calcular
}

fun dividir(a: Int, b: Int): Int {
    val calcular = a.div(b)
    println("Resultado é: $calcular")
    return calcular
}
