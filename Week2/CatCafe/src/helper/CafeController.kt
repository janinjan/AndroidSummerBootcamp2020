package helper

import model.Utility
import model.animals.Cat
import model.cafe.Cafe
import model.cafe.Item
import model.person.People
import model.shelter.Shelter

class CafeController {

    private val cafe = Cafe()

    private val shelters = mutableSetOf<Shelter>(
        Utility.shelterOne(),
        Utility.shelterTwo()
    )

    private val shelterToCat = mutableMapOf<Shelter, MutableSet<Cat>>(
        shelters.first() to mutableSetOf(Utility.morris(), Utility.orangey()),
        shelters.last() to mutableSetOf(Utility.lewis(), Utility.marmalade(), Utility.choupette())
    )

    fun adoptCat(catId: String, person: People) {
        val catInShelter = shelterToCat.entries.firstOrNull { (_, catsInShelter) ->
            catsInShelter.any { it.id == catId }
        }

        if (catInShelter != null) {
            val cat = catInShelter.value.first { cat -> cat.id == catId }

            catInShelter.value.remove(cat)

            person.cats.add(cat)
        }
        println("cat: $catId is adopted by ${person.firstName}")
    }

    fun sellItems(items: List<Item>, customerId: String) {
        val receipt = cafe.getReceipt(items as MutableList<Item>, customerId)
    }

    fun getNumberOfAdoptionsPerShelter(): Map<String, Int> {
        val allAdopters = cafe.getAdopters()
        println(allAdopters.size)
        return emptyMap()
    }

    fun printSelledItems(day: String) {
        val items = cafe.numberOfItem(day)
        var itemsNumber = 0

        if (items != null) {
            for (i in items) {
                for (item in i) {
                    itemsNumber += 1
                }
            }
        }

        if (items != null) {
            println(
                """
               
               _________Products___________
                Number of selled items: ${itemsNumber}
                
                List of products:
           """.trimIndent()
            )

            for (i in items) {
                for (item in i) {
                    itemsNumber += 1
                    println("- ${item.description}")
                }
            }
        }
    }

    fun printNumberOfEmployee() {
        println("_________ClockIn/Out___________")
        cafe.checkInEmployee(Utility.marie())
        cafe.checkInEmployee(Utility.paul())
        println("The number of working employee is ${cafe.getWorkingEmployees().size}")
        println()
    }

    fun printNumberOfCustomer(day: String) {
        println("_______Number of customers______")
        println("The number of customer is ${cafe.getNumberOfCustomer(day = day)}")
        println()
    }

    fun printNumberOfReceipt(day: String) {
        println("_____Number of transactions____")
        cafe.showNumberOfReceiptsForDay(day = day)
        println()
    }

    fun printNumberOfSponsoredCat() {
        cafe.addSponsorship(catId = Utility.choupette().id, personId = Utility.patrick().id)

        println(
            """
            _____Number of sponsored cats____
            The number of sponsored cat is ${cafe.getSponsoredCats()}
        """.trimIndent()
        )
    }

    fun printAdoptionsList() {
        println()
        println("_____Number of adoptions_____")
        adoptCat(catId = Utility.choupette().id, person = Utility.john())
    }
}