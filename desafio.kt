// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASIC, MIDDLE, HIGH }

data class Usuario(var nome:String, var formacao: String)

data class ConteudoEducacional(val titulo: String, val duracao: Int = 60, val level: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
    fun print(): String {
        return toString() + inscritos.toString()
    }
}

fun main() {
    val c1 = ConteudoEducacional("Java", 90, Nivel.MIDDLE)
    val c2 = ConteudoEducacional("Kotlin", 10, Nivel.HIGH)
    var form = Formacao("FullStack", mutableListOf(c1, c2))   
    var u1 = Usuario("Djair", form.nome)
    var u2 = Usuario("Miriam", form.nome)
    println(u1)
    form.matricular(u1)
    form.matricular(u2)
    println(form.inscritos)
    println(form.print())
}