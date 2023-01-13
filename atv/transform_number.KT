fun main() {
    val numeroRomano: String? = "IV"
    
    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

   // TODO("Criar uma variável mutável para armazenar o $resultado")
    var resultado = 0
    
    for (i in numeroRomano!!.indices) {
        // Recupera o valor em romano do indice atual.
        val atual = numerosRomanos.getValue(numeroRomano[i])
        // Recupera o valor em romano do próximo indice (caso exista).

        // TODO("Criar as condições necessárias para cálculo do $resultado")
        resultado += if((i > 0) && (atual > numerosRomanos.getValue(numeroRomano[i - 1]))){
            atual - (2 * numerosRomanos.getValue(numeroRomano[i - 1]))

        }else{
            atual
        }

    }

    print(resultado)
}
