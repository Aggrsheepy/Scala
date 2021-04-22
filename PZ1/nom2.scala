object nom2 extends App {
    
  def penultimate[A](ls: List[A]): A =
      if (ls.isEmpty) throw new NoSuchElementException
      else ls.init.last

    def main (args: Array[String]) {
      print (penultimate(List(1, 1, 2, 3, 5, 8)))

  }
}

// предпоследний элемент списка
