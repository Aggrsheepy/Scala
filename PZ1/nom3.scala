object nom3 {

  def nth[A](n: Int, ls: List[A]): A =
      if (n >= 0) ls(n)
      else throw new NoSuchElementException
  
  def main (args: Array[String]) {
      print (nth(2, List(1, 1, 2, 3, 5, 8)))
      
    }
}

// k-ый элемент листа
