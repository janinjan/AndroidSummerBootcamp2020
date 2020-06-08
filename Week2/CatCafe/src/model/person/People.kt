package model.person

import model.animals.Cat
import java.util.*

open class People(
    val id: String = UUID.randomUUID().toString(),
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    val emailAddress: String,
    val cats: MutableSet<Cat> = mutableSetOf()
)