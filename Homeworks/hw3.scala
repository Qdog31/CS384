object hw3 extends hwtest.hw("CS384"):  //homework 3 Recursion

  def userName = "Quintin Sherrod"

  /*MY DOCUMENTATION IDENTIFIES ALL SOURCES USED AND ASSISTANCE RECEIVED IN COMPLETING THIS ASSIGNMENT.

  Citation A: 
  CDT Oumar Diop I-4 '25. Assistance given to the author review of code. My original divide,conquer,glue diagram included
  code that was trying to is the > opeartor on the recursive case of the tail. I had:
  "filterPositives(list.tail" > 0 which kept giving me error because I was using it on a list instead of 
  an int like I was supposed to. CDT Diop told me that I should be using the operator on the head instead 
  and then I can use my base case. West Point, NY. 

  Citation B: 
  CDT Robert O'Brien F-4 '25. Assistance given to the author verbal explanation. Before meeting with CDT O'Brien I tried
  to iterate through each value in both lists, and prepend each individual value. He helped me draw a diagram 
  on a whiteboard and made me realise that I only needed to iterate through one list and then prepend these values to the 
  full list2. I was able to solve to rest of the problem myself. West Point, NY. 

  */
  

  // FOR ALL PROBLEMS INVOLVING LISTS, DO ***NOT*** USE
  // ANY BUILT-IN LIST METHODS EXCEPT:
  //   isEmpty/nonEmpty, head, tail, ::, or List.empty
  
  // filterPositives(list) returns a new list containing only the positive
  //   elements from the original list, in their original order
  // Example: filterPositives(List(1,-2,3,7,0,-21)) == List(1,3,7)
  // *** Built-in version is list.filter(_ > 0)

  //Problem 1 
  //Citation A 
  def filterPositives(list: List[Int]): List[Int] = 
    if list.isEmpty then List[Int]() // base case that returns empty list 

    else if list.head > 0 then //checks to see if the head is greater than 0 before recusing and adding all positive values 
      list.head::filterPositives(list.tail)  //recursive case 

    else filterPositives(list.tail)

  test("filterPositives", filterPositives, "list")
 
  
  // append(list1,list2) returns a list containing the elements of list1
  //  followed by the elements of list2
  // Example: append(List(1,3,5), List(2,4,6,8)) == List(1,3,5,2,4,6,8)
  // *** Built-in version is list1 ::: list2

  //Problem 2 
  //Citation B 
  def append(list1: List[Int], list2: List[Int]): List[Int] = 
    //since we are iterating through list 1, once it becomes empty then we 
    // we want add list 2 for it to get prepended to.   
    if list1.isEmpty then 
      return list2  
    list1.head :: append(list1.tail,list2) // two paramters to satisfy append function 
     
  test("append", append, "list1", "list2")

  // flatten1(lol) takes a list of lists and combines all their
  //   elements into a single list, in order
  // Example: flatten1(List(List(1,3,5),List(4),List(2,6)) == List(1,3,5,4,2,6)
  // *** Built-in version is lol.flatten
  //
  // You'll implement this twice.  For this version, use
  // append as a helper function.

  
  //Problem 3  
  def flatten1(lol: List[List[Int]]): List[Int] = 

    if lol.isEmpty then List[Int]() 

    else
      append(lol.head,flatten1(lol.tail))
    
  test("flatten1", flatten1, "lol")

  // For this second version of flatten, do all the work inside this function
  // WITHOUT any helper functions.

  //Problem 4 
  def flatten2(lol: List[List[Int]]): List[Int] = 
    if lol.isEmpty then List[Int]()

    if lol.tail.isEmpty then lol.head

    else 
      lol.head.head :: flatten2(lol.tail) 
  test("flatten2", flatten2, "lol")
  
  // indexOf(target, list) returns the index at which the target
  //   element appears in the list, or -1 if it doesn't appear at all
  //   (if the target appears multiple times, return the index of
  //   the first appearance)
  // Examples:
  //   indexOf(7,List(1,3,7,4,7)) == 2
  //   indexOf(5,List(1,3,7,4,7)) == -1
  // *** Built-in version is list.indexOf(target)
  
  //Problem 5  
  def indexOf(target: Int, list: List[Int]): Int =
    var counter: Int = 0

    if list.isEmpty then return -1 

    if list.head == target then  
      return counter  //return so that once it finds the first instance of target, it will return that index instead of second one 
    else
      var theindex: Int = indexOf(target, list.tail)
      if theindex == -1 then 
        theindex
      
      else theindex +1   
    
  test("indexOf",indexOf _,"target","list") 
  
  
  //SSByZWFsbHkgZG8gbm90IGxpa2UgcmVjdXJzaW9uIA==