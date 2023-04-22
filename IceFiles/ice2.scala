object ice:
  
/*
  val x =  3 
  println(s"The value of x is $x")
  println(s"Now this value is ${x+1}") // this is string interpulation. returns 4 


  val a = 3       // if you were to print the d variable, you need to specify a and b as a "Double"
  val b = 3
  val c = a * b 
  val d = c / 2 
  println(s"The value of x is $d")


  def sum(a: Int, b: Int) : Int = 
    a + b 

  val result : Int = sum(3, 4)    // calls function with two parameters 
  println(s"The value is $result")



  // return the last index in the array that is less than the target 
  def doWeHaveAnyStrongTankers(target: Int, scores: Array[Int]): Int = 
    var result : Int = -1 
    for i <- 0 to scores.size do
      if scores(i) < target then  //index the scores by the index 
        result = i   // if we wanted the first index, then we use "return i"
    result 


*/
  @main def run: Unit = {}

  def countDupes(array: Array[Int]): Int = 
    var count : Int = 0 
    for i <- 0 until array.length do
      for element <- array do 
        if array(i) == element then
          count += 1 
    count

  
  var arr = Array(2,4,6,2,2)
  println(countDupes(arr))

