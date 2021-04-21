package snap

import scala.collection.mutable.ListBuffer

class Deck{

  var numberOfDecks:Int = 0
  var matchAgainstType: String = ""
  val numOfPlayers:Option[Int] = Some(2)


  def createDeck(numberOfDecks:Int): ListBuffer[Card] = {
    var cards: ListBuffer[Card] = ListBuffer()
    this.numberOfDecks = numberOfDecks

    val ranks = List("ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King")
    val suits = Set("Hearts", "Clubs", "Diamonds", "Spades")

    while (this.numberOfDecks > 0) {
    for(r<- ranks){
      for(s <- suits){
        cards = cards :+  Card(r,s)
      }
    }
     this.numberOfDecks -=1
   }

    println(cards)
    println(cards.length)

    cards
  }

}