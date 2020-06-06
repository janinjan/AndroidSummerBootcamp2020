package person

import java.util.*

class Employee(
    id: String = UUID.randomUUID().toString(),
    firsName: String,
    lastName: String,
    phoneNumber: String,
    emailAddress: String,
    val hireDate: String,
    val socialSecurityNumber: String,
    val salary: Double
) : People(id, firsName, lastName, phoneNumber, emailAddress) {

    fun clockIn() {

    }

    fun clockOut() {

    }
}