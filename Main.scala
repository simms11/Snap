package snap

import scala.util.Random

object Main extends App {
  val deck:Deck = new Deck

  val numOfPlayers = Utils.getUserInput("How many players are there?")

  val numOfDecks = Utils.getUserInput("How many number of decks do you need?")
  val deckSize = deck.createDeck(numOfDecks.toInt)

  val getMatch = (Utils.getUserInput("match by suit, both or rank"))
  println(s"Matching by $getMatch")

  val shuffledDeck = Random.shuffle(deckSize)
  println(s"Shuffled Deck:"+ s"$shuffledDeck")


}
