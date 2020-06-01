fun main() {
    val gameFactory = GameFactory()

    println("""
 _     _            _    _            _    
| |   | |          | |  (_)          | |   
| |__ | | __ _  ___| | ___  __ _  ___| | __
| '_ \| |/ _` |/ __| |/ / |/ _` |/ __| |/ /
| |_) | | (_| | (__|   <| | (_| | (__|   < 
|_.__/|_|\__,_|\___|_|\_\ |\__,_|\___|_|\_\Game. 2020
                       _/ |                
                      |__/                 
    """.trimIndent())

    // Create deck
    val deck = gameFactory.createDeck().toMutableList()

    // Give two cards to the player in a hand
    val dealHand = gameFactory.dealHand(deck, 2)

    // Evaluate the total sum of hand
    val evaluate = gameFactory.evaluateHand(dealHand)

    // Print the result and display message
    println("\n🂡-------Result-------🃁")
    val printResult = gameFactory.printResults(evaluate, dealHand)
}