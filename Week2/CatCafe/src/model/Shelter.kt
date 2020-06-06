package model

import java.util.*

data class Shelter(
    val shelterID: String = UUID.randomUUID().toString(),
    val address: String,
    val phoneNumber: String,
    val cats: MutableSet<Cat> = mutableSetOf()
)