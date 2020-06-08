package model.cafe

import model.Utility
import model.person.Customer
import model.person.Employee
import model.person.People
import java.util.*

class Cafe {

    private val receiptsByDay = mutableMapOf(
        "Monday" to mutableSetOf<Receipt>(
            getReceipt(items = mutableListOf(Utility.bagel()), customerId = Utility.patrick().id),
            getReceipt(
                items = mutableListOf(Utility.croissant(), Utility.icedCoffe()),
                customerId = Utility.john().id
            ),
            getReceipt(items = mutableListOf(Utility.orangeJuice()), customerId = Utility.marie().id),
            getReceipt(items = mutableListOf(Utility.greenTea()), customerId = Utility.marie().id)
        ),
        "Tuesday" to mutableSetOf<Receipt>(
            getReceipt(items = mutableListOf(Utility.espresso()), customerId = Utility.patrick().id),
            getReceipt(items = mutableListOf(Utility.smoothie()), customerId = Utility.john().id)
        ),
        "Wednesday" to mutableSetOf<Receipt>(),
        "Thursday" to mutableSetOf<Receipt>(),
        "Friday" to mutableSetOf<Receipt>(),
        "Saturday" to mutableSetOf<Receipt>(),
        "Sunday" to mutableSetOf<Receipt>()
    )

    private val employees = mutableSetOf<Employee>()
    private val customers = mutableSetOf<People>()
    private val sponsorships = mutableSetOf<Sponsorship>()

    fun checkInEmployee(employee: Employee) {
        employees.add(employee)
        employee.clockIn(employee)
    }

    fun checkOutEmployee(employee: Employee) {
        employees.remove(employee)
        employee.clockOut(employee)
    }

    fun showNumberOfReceiptsForDay(day: String) {
        val receiptForDay = receiptsByDay[day] ?: return

        println("On $day you made ${receiptForDay.size} transactions!")
    }

    fun numberOfItem(day: String): List<MutableSet<Item>>? {
        val receiptForDay = receiptsByDay[day]
        val items = receiptForDay?.map { it.items }
        return items
    }

    fun getReceipt(items: List<Item>, customerId: String): Receipt {
        val receipt = Receipt(receiptID = UUID.randomUUID().toString(), items = items.toMutableSet())
        return receipt
    }

    fun addSponsorship(catId: String, personId: String) {
        val sponsor = Sponsorship(customerID = personId, catID = catId)
        sponsorships.add(sponsor)
    }

    fun getNumberOfCustomer(day: String): Int {
        var customerNumber = 0
        val receiptForDay = receiptsByDay[day]

        val receipt = receiptForDay?.map { it.receiptID }
        if (receipt != null) {
            customerNumber = receipt.size
        }
        return customerNumber
    }

    fun getWorkingEmployees(): Set<Employee> = employees

    fun getSponsoredCats(): Int {
        val sponsoredCat = sponsorships.map { it.catID }.size
        return sponsoredCat
    }

    fun getAdopters(): List<People> {
        return (employees + customers).filter { it.cats.isNotEmpty() }
    }
}