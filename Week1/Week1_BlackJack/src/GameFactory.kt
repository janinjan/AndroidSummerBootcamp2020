class GameFactory {

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
    fun dealHand(deck: MutableSet<Card>, numberOfCards: Int = 2): MutableSet<Card> {
        val userCards = mutableSetOf<Card>()

        for (card in 0 until numberOfCards) {
            val randomCard = deck.random()
            userCards.add(randomCard)
            deck.remove(randomCard)
        }
        return userCards
    }

    // Figure out the pip value of the card and add it's value to a total
    fun evaluateHand(hand: MutableSet<Card>): Int {
        var total: Int = 0

        for (card in hand) {
            total += when (card.pip) {
                "J", "Q", "K" -> 10
                "A" -> 11
                else -> card.pip.toInt()
            }
        }
        return total
    }

    // Print the result and display message according to it
    fun printResults(total: Int, hand: Set<Card>) {
        val BLACKJACK_AMOUNT = 21
        val LOSE_THRESHOLD = 22

        var cardToPrint = ""
        val message = when (total) {
            BLACKJACK_AMOUNT -> {
                "\uD83C\uDF89 Congratulations, you win!"
            }
            LOSE_THRESHOLD -> {
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