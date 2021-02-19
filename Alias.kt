package one.digitalInnovation.digionebank

import kotlin.properties.Delegates

class Alias (){
    lateinit var complement: String
    lateinit var street: String
    var houseNumber: Int = 0

    constructor(
        street: String,
        houseNumber: Number,
        complement: String
    ) : this()
}