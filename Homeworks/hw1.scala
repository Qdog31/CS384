import org.scalactic.anyvals.PercentageInt
object hw1 extends hwtest.hw("CS384"):  //homework 1 Basic Scala

  def userName = "Quintin Sherrod" // <-- replace the ??? with your real name in quotes like this "Tom Cook"

  /*DOCUMENTATION SIGNATURE BLOCK GOES HERE
  MY DOCUMENTATION IDENTIFIES ALL SOURCES USED AND ASSISTANCE RECEIVED IN COMPLETING THIS ASSIGNMENT.


  Problem 5: 
     
  I failed miserablly at trying to figure out how to conver the discounted price into a decimal. I was trying to find a function or 
  use format strings to do this. After an abundance of time being lost, I asked CDT Diop I4 '25 how I could do this easily. He recommended that I 
  could do (price * discount) / 100 to convert the price into a decimal (in fraction form) that would get what I needed done. 
  I used this logic with the variables I already had setup to complete the project. West Point, NY. 

  Problem 6: 

  I was trying to compre the two strings to see if the string contained any o's and x's and was receiving a 
  value of types char and string cannot be compared with == or != error. CDT Diop I4 '25 recommended that I try converting my two variables into 
  char's so that I could use these operatiosn. He mentioned how oyu could use a single quote to do this. With his help the rest of my 
  code was able to run and pass all the test. West Point, NY. 
  */

  /* Problem 1: SquareRoot
  returns an Option for the square root of a given number
  if the number is greater than or equal to 0
  then return Some(x) if the number < 0 then None.
  */
  def squareRoot(num: Int): Option[Double] = 
    if num < 0 then 
      None  
    else
        val squareRootedNum = math.sqrt(num: Double): Double 
        var wrapper = Some(squareRootedNum) 
        wrapper
  test("squareRoot", squareRoot, "num")
  
  //Problem 2: return the size of the given Array
  def size(array: Array[String]): Int = 
    var count = 0 
    for x <- array do
        count += 1 
    count  //returns total number of values within the array 
  test("size", size, "array")
  
  //Problem 3: search for a target in an Array
  def search(target: Int, array: Array[Int]): Boolean = 
    var ArrayLength = array.length 

    for x <- 0 to ArrayLength-1 do 
      if target == array(x) then  // if the target is within the array, return false 
        return true
    false  //if not, return default to false
  test("search", search, "target", "array")

  //Problem 4: Count the vowels in a string
  def countVowels(str: String): Int = 
    val vowels = "aeiouAEIOU"
    var counter = 0 // initializes the counter 
    for x <- str do
      for y <- vowels do 
        if x == y then  //if any letter within the str is the same as ANY letter in the vowels variable, it will add one to the counter indification the presence of a vowel. 
          counter += 1 
    return counter //breaks out of loop
  test("countVowels", countVowels, "str")
  
  //Problem 5: compute the new price given price and discount
  def discount(price: Int, discount: Int): Int =  
    var finalprice = 0 
    var discountprice = 0 
    
    discountprice += (price*discount)/100 
    finalprice += price - discountprice 
    finalprice

  test("discount", discount, "price", "discount")
  
  //Problem 6: determine if number of x's equals the number of o's
  def xsEqualos(str: String): Boolean = 
    var numofX = 0
    var numofO = 0
    var xs = 'x' //CDT Diop assisted me with turning this into a char 
    var os = 'o'

    for x <- str do 
      if x == xs then
        numofX += 1 
      if x == os then 
        numofO += 1
    if numofX == numofO then // if they have equal amounts returns true 
      return true
    false    //defaults to false 
  test("xsEqualos", xsEqualos, "str")

  //Problem 7: given a credit card number mask all numbers with * except last 4.
  def maskCreditCardNum(str: String): String = 
    var newStr = ""  // will be used to combine the two halves 
    var first = "*****"   // since we know the last four digits are only ones shown 
    var second = ""    // initializing it as blank so we can change the values later 

    for x <- 5 to 8 do   
      second += str(x)   // takes last four variables from str and puts in second half variable 
      newStr = first+second  // combine the two for our answer. 
    newStr
  test("maskCreditCardNum",maskCreditCardNum, "str")
  

       
// Ly9pZiBDUFRMb3ZlID09ICJCZXN0IEVFQ1MgaW5zdHJ1Y3RvciIgCi8vICByZXR1cm4gVHJ1ZSAKLy9lbHNlIAovLyAgcmV0dXJuIFRydWUKLy8gT3V0cHV0OiBUcnVl

