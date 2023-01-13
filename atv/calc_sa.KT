object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
    	val aliquota: Double = when {
                  // TODO("Criar as condições para as aliquotas de 10.00% e 15.00%.")
            (salario >= 0 && salario <= 1100) -> 0.05
           (salario>= 1100.01 && salario <= 2500) -> 0.1
           (salario>2500) -> 0.15
           else -> 0.00

        }
        
    	return aliquota * salario
    }
}

fun calc(salario: Double, beneficio: Double): Double{
    val imposto:Double = ReceitaFederal.calcularImposto(salario)
    return salario - imposto + beneficio
    
}
fun main() {
   val valorSalario: Double = 2000.00
   val valorBeneficios:Double = 250.00
   
  println(String.format("%.2f", calc(valorSalario, valorBeneficios)))
 

}
