package execution

class VoteCounter (var voting: List[String]) {
  var answer: Map[String, Int] = Map()
  def addVotes(str: String, int: Int): Unit = {
    if (answer.contains(str)) {
      val temp: Int = answer(str)
      answer -= str
      answer += (str -> (int+temp))
    }
    else {
      answer += (str -> int)
    }
  }
  def getVotes(str: String): Int = {
    if (answer.contains(str) && voting.contains(str)) {
      answer(str)
    }
    else {
      0
    }
  }
}
