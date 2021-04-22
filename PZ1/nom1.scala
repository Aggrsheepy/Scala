object nom1 {

  def lastBuiltin[A](ls: List[A]): A = ls.last

  def main(args: Array[String]) {
    print (lastBuiltin(List(1,1,2,3,5,6)))
  }
}

// выводит последний элемент списка 
