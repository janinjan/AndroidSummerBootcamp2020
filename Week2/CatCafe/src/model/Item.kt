package model

import java.util.*

open class Item(
    val id: String = UUID.randomUUID().toString(),
    val description: String,
    val quantity: Int,
    val price: Double)