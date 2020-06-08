package model.person

import java.util.*

class Customer(
    id: String = UUID.randomUUID().toString(),
    firstName: String,
    lastName: String,
    phoneNumber: String,
    emailAddress: String
) : People(firstName = firstName, lastName = lastName, phoneNumber = phoneNumber, emailAddress = emailAddress)

