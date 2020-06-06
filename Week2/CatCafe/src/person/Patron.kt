package person

import java.util.*

class Patron(
    id: String = UUID.randomUUID().toString(),
    firsName: String,
    lastName: String,
    phoneNumber: String,
    emailAddress: String
) : People(id, firsName, lastName, phoneNumber, emailAddress)