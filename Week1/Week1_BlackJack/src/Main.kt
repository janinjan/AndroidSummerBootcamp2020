fun main() {
    val gameFactory = GameFactory()
    // Create deck
    val deck = gameFactory.createDeck().toMutableList()

    // Give by default two cards to the player in a hand
    val dealHand = gameFactory.dealHand(deck)
}