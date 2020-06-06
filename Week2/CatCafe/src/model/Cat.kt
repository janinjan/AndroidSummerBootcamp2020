package model

import java.util.*

data class Cat(
    val id: String = UUID.randomUUID().toString(),
    val shelterID: String,
    val name: String,
    val breed: String,
    val sex: String,
    val sponsorships: MutableSet<Sponsorship> = mutableSetOf()
)

