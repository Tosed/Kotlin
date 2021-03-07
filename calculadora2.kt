fun main() {

    println("Digite o primeiro valor:")
    val number1: Float? = readLine()!!.toFloatOrNull()

    println("Digite o segundo valor:")
    val number2: Float? = readLine()!!.toFloatOrNull()


    if(number1 != null && number2 != null){
        println("Escolha uma operação: + (mais) , - (menos) , * (vezes) , / (dividir) ")
        when(readLine()!!.toString()){
            "+" -> soma(number1,number2)
            "-" -> subtrair(number1,number2)
            "*" -> multiplicar(number1,number2)
            "/" -> dividir(number1,number2)
            else -> println("Operador inválida, tente novamente")
        }

    }else {
        println("OPS! Valores impossivel de calcular")
    }


}

fun soma(a: Float, b: Float): Float {
    val calcular = a.plus(b)
    println("Resultado é: $calcular")
    return calcular
}

fun subtrair(a: Float, b: Float): Float {
    val calcular = a.minus(b)
    println("Resultado é: $calcular")
    return calcular
}

fun multiplicar(a: Float, b: Float): Float {
    val calcular = a.times(b)
    println("Resultado é: $calcular")
    return calcular
}

fun dividir(a: Float, b: Float): Float  {
    val calcular = a.div(b)
    println("Resultado é: $calcular")
    return calcular
}
