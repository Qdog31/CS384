object hw2 extends hwtest.hw("CS384"):  //homework 2 Arrays 

  def userName = "Quintin Sherrod"

  /*DOCUMENTATION SIGNATURE BLOCK GOES HERE
  MY DOCUMENTATION IDENTIFIES ALL SOURCES USED AND ASSISTANCE RECEIVED IN COMPLETING THIS ASSIGNMENT.
  

  CDT Sebastian Neumann : 

  CDT Sabastian Neumann. 20 Jan 2023. Assistance given to author, walkthrough of problem logic. During the 
  2023 Shmoocon conference in Washington D.C. at around 2142 we had about 5 CDT's in a single hotel room for our 
  "Scala Party". We had this planned since the beginning of the day and we just went over one of Sebastians 
  old HW assignments. The intent was to learn more about scala syntax and work through some problems. We went over a 
  problem similar to number 5 and I used that logic to complete the problem. For problem 2, he assisted me by coming up with 
  a way that I could create a helper function to assist in my main code. I already had my main code completed. West Point, NY.

  CDT Oumar Diop:  
  
  CDT Oumar Diop. 26 Jan 2023. Assistance given to the author, verbal discussion. CDT Oumar and I met in the I4 collab room to discuss 
  the last problem of the homework. I provided my original code but he basically told me that I could not do this because 
  it was a linear search instead of a binary search. The problem did not specifyc (although the function was named binarysearch). He explained to 
  me the difference and used the whiteboard to emulate it. West Point, NY. 

  */

  //Problem 1: findMax returns the Max value in the Array.
  def findMax(array: Array[Int]): Int = 
    var maxNumber : Int = 0 
    for element <- array do 
      if element > maxNumber then
        maxNumber = element 
    maxNumber
  
  test("findMax", findMax, "array")
  //How many steps will your code take in the worst case?  
  // I beleive my code will take O(n) steps to complete in the worst case. We have 1 for loop. 


  //Problem 2: count Dupes from Array and return that value 
  def countDupes(array: Array[Int]): Int = 
    var count : Int = 0 
    if array.length == 1 then // obviously there will be no dupes if there is only 1 element.
      0
    else 
      def not_in(array: Array[Int], target: Int): Boolean =    // helper function for main function below 
        for element <- array do
          if target == element then 
            return true
        false

      var dupe: Array[Int] = new Array(array.length)
      var dupe_i = 0
      for i <- 0 until array.length do
        if !not_in(dupe, array(i)) then
          dupe(dupe_i) = array(i)
          dupe_i += 1
        else count += 1      
      count

  test("countDupes", countDupes, "array")
  //How many steps will your code take in the worst case?  
  // This will take O(n^2) 

  //Problem 3: Median of sorted Array
  def median(arr: Array[Int]): Int = 
    var countValue : Int = 0
    if arr.length == 1 then 
      return arr(0)

    if arr.length % 2 == 1 then 
      var placeHolder : Int = 0 
      placeHolder = arr.length/2 
      countValue = arr(placeHolder)
    countValue
    if arr.length % 2 == 0 then  
      countValue = (arr(arr.length/2) + arr(arr.length/2 - 1))/2   // I was orignally trying to find the median and when it was even I was finding the mean. This is correct
    countValue
        
  test("median", median, "arr")
  //How many steps will your code take in the worst case?  
  // I beleieve this will take O(c)? I say this because we have no for loops and we have three specific cases. 

  //Problem 4: Returns the same array, but the contents are in reverse order. 
  // Citation above 
  def reverseArray(arr: Array[Int]): Unit =     // Unit will not return a value 
    var arrHalf : Int = arr.length/2
  
    for i <- 0 until arrHalf do 
      val switchVal = arr(i)
      arr(i) = arr(arr.length -1 -i)
      arr(arr.length - 1 -i) = switchVal
    
  test("reverseArray", (a:Array[Int])=>{reverseArray(a);a}, "arr")
  //How many steps will your code take in the worst case?  
  // I think this will take O(n/2). If we have a list of 4 then it will do 2 switches? 


  //Problem 5: binarySearch
  def binarySearch(target: Int, array: Array[Int]): Int  = 
    // My original code idea. 73/98 tests 
    /*
    for i <- 0 until array.length do 
      var hit : Int = 0 
      if array(i) == target then
        hit = i 
      hit 
    -1 
    */
    var left : Int = 0 
    var middle : Int = 0 
    var right : Int = array.length - 1 // right most index in array 

    while left <= right do  // continues until they are equal so it runs through everything 
      middle = ((left+right)/(2))
      if array(middle) == target then // if the middle element is the target, just return that index 
        return middle 
      else if array(middle) < target then // if value at middle is less than target value, shift left scope 
        left = middle + 1 
      else 
        right = middle - 1 
    return -1 
    

  test("binarySearch", binarySearch, "target", "array")

  //How many steps will your code take in the worst case?  
  // I think this will take O(logn) steps. 

// r!% {@G6 42? J@F D66 E9:Dn