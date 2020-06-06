package model

import java.util.*

data class Shelter(
    val shelterID: String = UUID.randomUUID().toString(),
    val shelterAddress: String,
    val shelterPhoneNumber: String
)