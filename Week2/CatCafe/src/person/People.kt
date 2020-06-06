package person

import java.util.* // Imported java.util to be able to generate random id

open class People(
    val id: String = UUID.randomUUID().toString(),
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    val emailAddress: String
)