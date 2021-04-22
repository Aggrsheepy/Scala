object hw13 {
  def primeFactor(number: Int): Seq[Int] = {
    var number2 = number;
    var starti = 2;
    for{ i <- starti to number2
      if (number2 % i == 0)

      }yield i

  }

  def main(args: Array[String]): Unit = {
    print(primeFactor(132))

  }
}
