import helper.CafeController

fun main() {
    val cafeController = CafeController()

    cafeController.printNumberOfEmployee()

    cafeController.printNumberOfReceipt(day = "Monday")

    cafeController.printNumberOfCustomer(day = "Monday")

    cafeController.printNumberOfSponsoredCat()

    cafeController.printSelledItems(day = "Monday")

    cafeController.printAdoptionsList()
}