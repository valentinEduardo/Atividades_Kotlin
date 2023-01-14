data class Pais(var habitantes: Double, val taxaCrescimento: Double){

    fun crescerPopulacaoAnual(){ 
   
   
    habitantes+= (taxaCrescimento*habitantes)/100
    }
}

fun main() {
 val habitantesPaisA = readLine()!!.toDouble();
   val habitantesPaisB = readLine()!!.toDouble();
   val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
   val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)
   
   var quantidadeAnos = 0
   while (paisA.habitantes < paisB.habitantes) {
    //   TODO("Invocar a função que consolida o crescimento anual de cada [Pais]")
    //  TODO("Garantir de a variável mutável $quantidadeAnos seja atualizada")
   paisA.crescerPopulacaoAnual()
   paisB.crescerPopulacaoAnual()
    quantidadeAnos++
   }
   
   println("$quantidadeAnos anos")
}
