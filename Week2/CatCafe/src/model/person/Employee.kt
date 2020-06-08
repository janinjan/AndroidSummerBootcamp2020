package model.person

import java.text.SimpleDateFormat
import java.util.*

class Employee(
    id: String = UUID.randomUUID().toString(),
    firstName: String,
    lastName: String,
    phoneNumber: String,
    emailAddress: String,
    val hireDate: String,
    val socialSecurityNumber: String,
    val salary: Double
) : People(firstName = firstName, lastName = lastName, phoneNumber = phoneNumber, emailAddress = emailAddress) {

    fun clockIn(employe: Employee) {
        val date = getDate()
        println("${employe.firstName} ${employe.lastName} clock in the $date")
    }

    fun clockOut(employe: Employee) {
        val date = getDate()
        println("${employe.firstName} ${employe.lastName} clock out the $date")
    }

    fun getDate(): String {
        val date = Calendar.getInstance().time
        val formatter = SimpleDateFormat.getDateTimeInstance()
        val formatedDate = formatter.format(date)
        return formatedDate
    }
}
