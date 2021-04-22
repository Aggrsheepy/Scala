object nom6 {
  
  def isPalindrome[A](ls:List[A]): Boolean = ls == ls.reverse
  
  def main (args: Array[String]) {
    print(isPalindrome(List((1, 2, 3, 2, 1))))
    
  }
}

//Определяет, является ли список палиндромом (одинаково читается и слева, и справа)
