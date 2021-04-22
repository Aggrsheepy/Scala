object hw11 {
  def div(iFrom: Int, iTo: Int): IndexedSeq[Int] = {
    for {i <- iFrom to iTo
         if i % 3 == 0 || i % 7 == 0
         } yield i
  }

//   def main(args: Array[String]): Unit = {
//     print(div(3,21))

//   }

}
