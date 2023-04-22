object ice: 
  import hwtest.mlist.*

  ///practice problems///
  // get the sum of the list (Iterative approach) 
  def sum(list: List[Int]): Int = 
    var p = list 
    var sum = 0 
    while p.nonEmpty do 
      sum += p.head 
      p = p.tail
    sum

  // get the sum of the list (Recursive approach)
  def sum(list: List[Int]): Int = 
    list match 
      case Nil => 0
      case head::rest => //pattern of you have something cons to something else, EX: head consed with tail 
        head + sum(rest)

  // get the sum of the list (Helper function)
  def sum(list: List[Int]): Int = 
    def helper(list:List[Int], accumulate:Int): Int = 
      list match 
        case Nil => accumulate
        case head::rest => 
          helper(rest, accumulate + head)


    helper(list,0)

  // increment every value 
  def increment(list: MList): Unit = 
    var p1 = list.tail 
    while p1.nonEmpty do 
      p1.head += 1 
      p = p.tail 

  // get the sum of the array (by index)
  def arrSum(array: Array[Int]): Int = 
    var sum = 0 
    for i <- 0 until array.size do 
      sum += array(i)
    sum

  // get the sum of the array (by element)
  def arrSum(array: Array[Int]): Int = 
    var sum = 0 
    for element <- array do 
      sum += element
    sum

  // get the index of the max value in an array 
  def maxIndex(array: Array[Int]): Int = 
    var max = -999999  
    var index = 0 
    for i <- 0 until array.size do 
      if array(i) > max then 
        max = array(i)
        index = i
    index

  // determine if the array contains an element
  def contains(array: Array[Int], target: Int): Boolean =  
    for i <- 0 until array.size do 
      if array(i) == target then 
        return true 
    false 

  ///Defining data strucutres///

  // make a list 
  val test = List(1,2,3,4,5)

  // make an MList
  val temp = 1::2::3::MList.empty 

  // make an array
  val temp = Array(1,2,3,4,234,5,4,3,4,55,6,66,7,77,89)

  ///test functions///

  //println(sum(test))
  //println(increment(temp))

  //call the increment function 
  //increment(temp)

  //print contents of MList
  //println(temp) // 1st way 
 
  /*
  var p = temp  // another way
  while p.nonEmpty do 
    println(p.head)
    p = p.tail

  */

  //make an array 
  //val temp = Array(1,2,3,4)
  //println(arrSum(temp))


  println("done")
  @main def run: Unit = {}