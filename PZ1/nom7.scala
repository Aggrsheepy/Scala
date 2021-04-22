object nom7 extends App {
  
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

  def main(args: Array[String]): Unit = {
    print (flatten(List(List(1, 1), 2, List(3, List(5, 8)))))

  }
}

// преобразовывает в одномерный массив
