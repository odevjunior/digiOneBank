package one.digitalInnovation.digionebank

class People(private var cpf: String) {
    lateinit var nome: String

    lateinit var address:Alias

    fun returnData(): String {
        return "${this.nome} ${this.cpf}"
    }
}