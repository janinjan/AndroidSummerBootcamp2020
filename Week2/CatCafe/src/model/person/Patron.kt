package model.person

class Patron(
    id: String,
    firsName: String,
    lastName: String,
    phoneNumber: String,
    emailAddress: String
) : People(id, firsName, lastName, phoneNumber, emailAddress)