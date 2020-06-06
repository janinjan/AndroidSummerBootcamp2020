package model

import java.util.*

open class Product(
    val id: String = UUID.randomUUID().toString(),
    val price: Double)