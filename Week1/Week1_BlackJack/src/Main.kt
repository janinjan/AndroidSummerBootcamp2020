fun main() {
    val gameFactory = GameFactory()
    // Create deck
    val deck = gameFactory.createDeck().toMutableList()

    // Give by default two cards to the player in a hand
    val dealHand = gameFactory.dealHand(deck)

    // Evaluate the total sum of hand
    val evaluate = gameFactory.evaluateHand(dealHand)

    // Print the result and display message
    val printResult = gameFactory.printResults(evaluate, dealHand)
}