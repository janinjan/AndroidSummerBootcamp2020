class GameFactory {

    // Function to create a collection of suits and a collection of pips and return the MutableSet of Cards
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
}