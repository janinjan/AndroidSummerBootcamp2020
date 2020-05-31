class GameFactory {

    // Create a collection of suits and a collection of pips and return the MutableSet of Cards
    fun createDeck(): MutableSet<Card> {
        val suits = arrayOf('\u2663', '\u2660', '\u2666', '\u2665')
        val pips = arrayOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A")

        val deck = mutableSetOf<Card>()

        for (pip in pips) {
            for (suit in suits) {
                val card = Card(pip = pip, suit = suit)
                deck.add(card)
            }
        }
        return deck
    }

    // Deal two cards from the deck
    fun dealHand(deck: MutableList<Card>, numberOfCards: Int = 2): List<Card> {
        val userCards = mutableListOf<Card>() // Create an empty mutable list of Card

        for (card in 0 until numberOfCards) {
            val randomCard = deck.random()
            userCards.add(randomCard) // add a random card to userCards
            deck.remove(randomCard) // remove this card from the deck to not have it again
        }
        return userCards.toList()
    }

    // Figure out the pip value of the card and add it's value to a total
    fun evaluateHand(hand: List<Card>): Int {
        var total = 0

        for (card in hand) {
            if (card.pip == "J" || card.pip == "Q" || card.pip == "K") {
                total += 10
            } else if (card.pip == "A") {
                total += 11
            } else {
                total += card.pip.toInt()
            }
        }
        return total
    }

    // Print the result and display message according to it
    fun printResults(total: Int, hand: List<Card>) {
        var cardToPrint = ""
        val message = when (total) {
            21 -> {
                "\uD83C\uDF89 Congratulations, you win!"
            }
            22 -> {
                "\uD83D\uDCA2 You lose!"
            }
            else -> {
                ""
            }
        }

        for (card in hand) {
            cardToPrint += "\n${card.pip} ${card.suit}"
        }
        println("Your hand was: $cardToPrint \nFor a total of: $total \n$message")
    }
}