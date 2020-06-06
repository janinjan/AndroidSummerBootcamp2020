package model

import model.Product

class Receipt(
    productID: String,
    price: Double,
    val peopleID: String
) : Product(productID, price)