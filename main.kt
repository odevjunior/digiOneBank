package one.digitalInnovation.digionebank

fun main() {
    val jairo = People("460.460.858-02")
    val address = Alias()

    jairo.nome = "Jairo"

    address.street = "Horácio de Paula Ramos"
    address.houseNumber = 152
    address.complement = "Perto do ponto 4"

    jairo.address = address

    println(jairo.returnData())
}

