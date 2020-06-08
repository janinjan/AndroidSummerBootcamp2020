package model.shelter

import model.animals.Cat

data class Shelter(
    val shelterID: String,
    val address: String,
    val phoneNumber: String,
    val cats: MutableSet<Cat> = mutableSetOf()
)