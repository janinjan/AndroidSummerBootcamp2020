package model

import model.animals.Cat
import model.cafe.Item
import model.person.Customer
import model.person.Employee
import model.shelter.Shelter
import java.util.*

/**
 * Utility populates the data of the cat cafe
 * */
object Utility {

    /**
     * List of items
     * */
    fun capuccino() = Item(
        id = UUID.randomUUID().toString(),
        description = "Cappuccino", quantity = 1, price = 2.20
    )

    fun bagel() = Item(
        id = UUID.randomUUID().toString(),
        description = "Bagel", quantity = 1, price = 9.50
    )

    fun croissant() = Item(
        id = UUID.randomUUID().toString(),
        description = "Croissant", quantity = 1, price = 3.00
    )

    fun mocha() = Item(
        id = UUID.randomUUID().toString(),
        description = "Montys Mocha", quantity = 1, price = 4.00
    )

    fun icedCoffe() = Item(
        id = UUID.randomUUID().toString(),
        description = "Iced Coffee", quantity = 1, price = 3.00
    )

    fun greenTea() = Item(
        id = UUID.randomUUID().toString(),
        description = "Green Tea Lemonade", quantity = 1, price = 3.00
    )

    fun espresso() = Item(
        id = UUID.randomUUID().toString(),
        description = "Espresso", quantity = 1, price = 1.00
    )

    fun orangeJuice() = Item(
        id = UUID.randomUUID().toString(),
        description = "Orange Juice", quantity = 1, price = 2.00
    )

    fun smoothie() = Item(
        id = UUID.randomUUID().toString(),
        description = "Mixed Berry Smoothie", quantity = 1, price = 4.00
    )

    fun hotChocolate() = Item(
        id = UUID.randomUUID().toString(),
        description = "Hot Chocolate", quantity = 1, price = 2.00
    )

    fun water() = Item(
        id = UUID.randomUUID().toString(),
        description = "Water Bottle", quantity = 1, price = 1.50
    )


    /**
     * List of people
     * */
    fun john() = Customer(
        id = UUID.randomUUID().toString(), firstName = "John", lastName = "Parker",
        emailAddress = "jparker@razeware.com",
        phoneNumber = "555-345-1212"
    )

    fun paul() = Employee(
        id = UUID.randomUUID().toString(), firstName = "Paul", lastName = "News", emailAddress = "pnews@razeware.com",
        hireDate = "", socialSecurityNumber = "0053040340403", phoneNumber = "552-545-1612", salary = 2800.50
    )

    fun marie() = Employee(
        id = UUID.randomUUID().toString(),
        firstName = "Marie",
        lastName = "Seguin",
        emailAddress = "mseguin@razeware.com",
        hireDate = "",
        socialSecurityNumber = "024949949494",
        phoneNumber = "552-556-4523",
        salary = 2500.00
    )

    fun patrick() = Customer(
        id = UUID.randomUUID().toString(), firstName = "Patrick", lastName = "Piers",
        emailAddress = "ppiers@razeware.com",
        phoneNumber = "552-585-1679"
    )

    /**
     * List of cats
     * */
    fun morris() = Cat(
        id = UUID.randomUUID().toString(), name = "Morris",
        breed = "tabby tomcat", color = "orange", note = "the world's most finicky cat", sex = "m"
    )

    fun orangey() = Cat(
        id = UUID.randomUUID().toString(), name = "Orangey",
        breed = "Toyger", color = "brown, black", note = "They’re gr-r-reat!", sex = "m"
    )

    fun lewis() = Cat(
        id = UUID.randomUUID().toString(), name = "Lewis Carol",
        breed = "CHESHIRE", color = "purple", note = "Enjoys smiling", sex = "m"
    )

    fun marmalade() = Cat(
        id = UUID.randomUUID().toString(), name = "marmalade",
        breed = "marmalade tabby", color = "orange", note = "Enjoys breakfast at Tiffany's", sex = "f"
    )

    fun choupette() = Cat(
        id = UUID.randomUUID().toString(), name = "CHOUPETTE",
        breed = "Birman", color = "blue-cream tortie", note = "only eats Strottarga Bianco Caviar", sex = "f"
    )

    /**
     * List of shelters
     * */
    fun shelterOne() = Shelter(
        shelterID = UUID.randomUUID().toString(),
        address = "187 Biscayne Dr, Albany NY 12202",
        phoneNumber = "555-345-1212",
        cats = mutableSetOf(morris(), orangey())
    )

    fun shelterTwo() = Shelter(
        shelterID = UUID.randomUUID().toString(),
        address = "21 Jump St, Albany NY 12203",
        phoneNumber = "969-123-5555",
        cats = mutableSetOf(lewis(), marmalade(), choupette())
    )
}