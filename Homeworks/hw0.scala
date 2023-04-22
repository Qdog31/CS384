object hw0 extends hwtest.hw("CS384"):  //homework 0 sum numbers, sum numbers in a list

  def userName = "Quintin Sherrod" // <-- replace the ??? with your real name in quotes like this "Tom Cook"

  /*MY DOCUMENTATION IDENTIFIES ALL SOURCES USED AND ASSISTANCE RECEIVED IN COMPLETING THIS ASSIGNMENT.
  
  CITATION A
  CDT Sebastian, Neumann CDT E-4 assistance given to author written. I met with CDT Neumann 
  to go over how to complete and submit homework assignment 0. I was unsure of how the scala
  syntax worked and how to work the test to see if it was working. With his assistance I learned 
  about the difference between var and val, what "<-" means, the difference between to and until, 
  and basic syntax overall. West Point, NY. 
  CITATION B
  CDT Neumann walked me through this problem aswell and I learned about how "Divide Conquer Glue" 
  and learned about how lists and their associated methods work. This was really cool and he helped 
  draw me a diagram. 
  
  Visit the syllabus for more information:
  https://eecscourses.westpoint.edu/courses/cs384/#documentation*/
  

  // See Citation A
  def sumValuesBetweenIntsDivBySevenInc(num1: Int, num2: Int): Int =
    var runningSum = 0
    for i <- num1 to num2 do
      if i % 7 == 0 then
        runningSum += i
    runningSum


  // The below test is for question 1 
  test("sumValuesBetweenIntsDivBySevenInc", sumValuesBetweenIntsDivBySevenInc, "num1", "num2")
  
  // See Citation B
  def sumList(list: List[Int]): Int = 
    if list.isEmpty then
      0
    else
      list.head + sumList(list.tail)

  // Change `ignoretest` to `test` when you are ready to test
  // The below test is for question 2 
  test("sumList", sumList, "list")