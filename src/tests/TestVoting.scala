package tests

import org.scalatest._
import execution.VoteCounter

class TestVoting extends FunSuite{
  test("Test") {
    val lis1: VoteCounter = new VoteCounter(List("red", "blue", "green"))
    lis1.addVotes("red", 100)
    lis1.addVotes("purple", 20)
    assert(lis1.getVotes("red") == 100)
    assert(lis1.getVotes("blue") == 0)
    assert(lis1.getVotes("purple") == 0)

    val lis2: VoteCounter = new VoteCounter(List("black"))
    lis2.addVotes("black", 100)
    lis2.addVotes("black", 30)
    assert(lis2.getVotes("black") == 130)
    assert(lis2.getVotes("gray") == 0)
  }
}
