package model.animals

import model.cafe.Sponsorship
import java.util.*

data class Cat(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val breed: String,
    val color: String,
    val note: String,
    val sex: String,
    val sponsorships: MutableSet<Sponsorship> = mutableSetOf()
)

