package Day3

object Blackjack extends App{

  def blackjack(card1:Int, card2:Int) = (card1, card2) match {
    case (_,_) if card1 > 21 && card2 > 21 => println(0 + " - Both players are bust!")
    case(_,_) if card1 >21 && card2<= 21 => println(card2 + " - player 1 is bust, player 2 wins! " )
    case(_,_) if card2 >21 && card1<= 21 => println(card1 + " - player 2 is bust, player 1 wins! " )
    case (_,_) if card1 > card2 => println(card1 + " - player 1 wins! " )
    case (_,_) if card2 > card1 => println(card2 + " - player 2 wins! " )


  }

  blackjack(21,17)
  blackjack(16, 19)
  blackjack(23,24)
  blackjack(24, 16)
  blackjack(17, 23)

}
