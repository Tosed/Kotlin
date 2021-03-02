fun main(){
    println("Digite o primeiro valor:")
    val number: Float? = readLine()!!.toFloatOrNull()
    println("Digite o segundo valor:")
    val number2: Float? = readLine()!!.toFloatOrNull()


    if(number != null && number2 != null){
        println("Digite o operador: EX: vezes( * ), mais( + ), menos( - ), dividir( / )")
        when (readLine()!!.toString()){
            "+" -> println(number + number2)
            "-" -> println(number - number2)
            "*" -> println(number * number2)
            "/" -> println(number / number2)
            "%" -> println(number % number2)
            else -> println("Operador Inválido, tente novamente.")
        }
    }else {
        print("VALORES NULOS!")
    }

}