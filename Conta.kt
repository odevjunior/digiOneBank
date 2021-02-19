package one.digitalInnovation.digionebank

import java.math.BigDecimal

class Conta (
    val agency: String,
    var accountNumber: String,
    var cash: BigDecimal
){
    fun deposity(value: BigDecimal): BigDecimal {
        this.cash = this.cash + value
        return this.cash
    }
    fun removeCash(value: BigDecimal): String{
        if(this.cash > value) {
            this.cash = this.cash - value
            return "new cash is ${this.cash}"
        }
        return "Insulficient Cash"
    }
}