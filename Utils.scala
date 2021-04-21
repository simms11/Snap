package snap

import scala.language.postfixOps

object Utils {

  def getUserInput(enterInfo:String): String = {
    println(enterInfo)

    val lineOfData = scala.io.StdIn.readLine()
    if(lineOfData isEmpty) getUserInput(enterInfo)
    else lineOfData
  }
}
