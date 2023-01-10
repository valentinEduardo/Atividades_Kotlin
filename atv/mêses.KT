enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }



data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var dificuldade: Any, var conteudos: List<ConteudoEducacional>) {
  
 var selecionar = when(dificuldade){
    
        1 -> dificuldade =  Nivel.BASICO; 
        2  ->  dificuldade = Nivel.INTERMEDIARIO; 
        3 -> dificuldade =  Nivel.DIFICIL;
    else -> println("numero inválido")
    
}

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
 
        inscritos.add(usuario)
    }
}

class Usuario(var nome: String, var idade: Int)

fun main() {
    var user1 = Usuario("Valentin", 18)
    var POO= ConteudoEducacional("POO")	
    val List = ConteudoEducacional("List", 120)
    val conteudo = mutableListOf<ConteudoEducacional>(POO, List)
    val Formacao1 = Formacao("JAVA e Kotlin", 1, conteudo)
    println(Formacao1.toString())
    Formacao1.matricular(user1)
    println(Formacao1.inscritos)

 
}
