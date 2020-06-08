import helper.CafeController
import model.cafe.Cafe
import model.Utility

fun main() {
    val cafeController = CafeController()

    cafeController.printNumberOfEmployee()

    cafeController.printNumberOfReceipt(day = "Monday")

    cafeController.printNumberOfCustomer(day = "Monday")

    cafeController.printNumberOfSponsoredCat()

    println("______Number of adoptions_____")
    cafeController.adoptCat(catId = Utility.choupette().id, person = Utility.john())

    cafeController.printSelledItems(day = "Monday")
}