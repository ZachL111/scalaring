object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(66, 93, 16, 25, 9)
    assert(Policy.score(signalcase_1) == 95)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(68, 101, 17, 25, 8)
    assert(Policy.score(signalcase_2) == 102)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(76, 91, 11, 9, 4)
    assert(Policy.score(signalcase_3) == 182)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
