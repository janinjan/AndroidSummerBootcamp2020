package model

import model.person.People
import java.util.*

class Receipt(
    receiptID: String = UUID.randomUUID().toString(),
    val items: MutableSet<Item> = mutableSetOf()
) {
    val total: Double
        get() = getTotalAmount()

    fun getTotalAmount(): Double {
        val prices = items.map { it.price }
        var total = 0.0

        prices.forEach { price ->
            total += price
        }
        return total
    }
}