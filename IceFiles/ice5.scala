object ice:
  //println(List(1,2):::List(3,4,5,6)) // preprends first list to front of second one 
  // Create a list
  val list = List(1, 2, 3, 4, 5, 6, 7, 8)
  println(list)

  // Now do it iteratively... compare the code
  def recursiveCount(list: List[Any]): Int =
    if list.isEmpty then 0
    else recursiveCount(list.tail) + 1

  // What about counting only certain elements?
  def recursiveCountIf(list: List[Int], f: Int => Boolean): Int =
    list match
    case Nil => 0 // Base Case
    case head :: tail => {
      val countThis = if f(head) then 1 else 0
      countThis + recursiveCountIf(tail, f)
    }
  end recursiveCountIf

  // Count only the even elements
  def isEven(x: Int): Boolean = x % 2 == 0
  println(recursiveCountIf(list, isEven)) // using a named function
  println(recursiveCountIf(list, x => x % 2 == 0)) // anonymous function
  println(recursiveCountIf(list, _ % 2 == 0)) // anonymous function with "_"

  // Calculate the sum of a list of numbers (add the elements)
  def recursiveSum(list: List[Int]): Int =
    list match
    case Nil          => 0
    case head :: tail => head + recursiveSum(tail)
  end recursiveSum

  // Test the sum function
  println(recursiveSum(list))

  // Remember the Collatz Conjecture from Homework 2. How many steps does it
  // take for the sequence to converge to 1 from a given starting number?
  def hailstoneSequenceSteps(n: Int): Int =

    // Base case
    if n == 1 then 0

    // Recurisve cases:
    // DIVIDE: This number in the sequence, and the following numbers
    // CONQUER: Count this one (1)
    // GLUE: Add this one (1) to the count of the following numbers
    else if n % 2 == 0 then 1 + hailstoneSequenceSteps(n / 2)
    else 1 + hailstoneSequenceSteps(3 * n + 1)
  end hailstoneSequenceSteps
  // Test the hailstone sequence length calculations
  // https://en.wikipedia.org/wiki/Collatz_conjecture#Examples
  for i <- 1 to 20 do println(f"$i%2d, ${hailstoneSequenceSteps(i)}%2d")

  @main def run: Unit = {}



  

  //@main def run: Unit = {}