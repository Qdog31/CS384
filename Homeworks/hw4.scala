object hw4 extends hwignoretest.hw("CS384"):  //homework 4 Scala List SList / MList
  import hwignoretest.slist.*
  import hwignoretest.mlist.*
  // These lists support only a handful of methods: isEmpty, nonEmpty, head, tail, and ::, plus SList.empty or MList.empty

  def userName = "Quintin Sherrod"

  /*DOCUMENTATION SIGNATURE BLOCK GOES HERE
  MY DOCUMENTATION IDENTIFIES ALL SOURCES USED AND ASSISTANCE RECEIVED IN COMPLETING THIS ASSIGNMENT.

  Citation A: 
    CDT Oumar, Diop I-4. Assistance given to the author, review of coded work. I originally had my code that we went over during our short AI session, 
    but I could not figure out a way properly point the pointers to where I can create two tuples. CDT Diop helped explain to me how I could create pointers that would 
    allow me to create these two tuples, using the empty list pointer. I used his assistance to do/complete the problem. 

  Citation B: 
    CDT Shefiku, Arlind H-4. Assistance given to the author, break down of problem. I know you keep telling me that I need to stop relying on people when doing these HW's, 
    but I genuinly have no idea what I am doing. I am trying to figure out in my mind (and by drawing it out) how these pointers work and how I can use multiple to iterate through the list, but it isn't working. CDT Arlind 
    helped draw a diagram and let me walk through how to do the problem. *This was written before our AI session, and I am currently regoing over what we did to try and figure this problem out on my own, although it 
    may now be reflected in my turned in assignment. 
  */

  // You must use pattern Matching
  // Problem 1 
  def filterPositives(list: List[Int]): List[Int] = 
    list match
      case Nil => List[Int]()
      case x :: rest if x > 0 => x::filterPositives(rest) // if x is positive then it will recurse through tail 
      case x :: rest if x <= 0 => filterPositives(rest) // negative or 0

  ignoretest("filterPositives", filterPositives, "list")
  
  // You must use pattern matching
  // Problem 2
  def removeAllTarget(target: Int, list: List[Int]): List[Int] = 
    list match 
      case Nil => List[Int]() 
      case x :: rest if x != target => x::removeAllTarget(target, rest) // if target doesn't match head then append to rest
      case x :: rest if x == target => removeAllTarget(target, rest) // if they do match, recurse through rest of tail 
  
  ignoretest("removeAllTarget", removeAllTarget, "target", "list")

  // SList Using loops
  // Problem 3  
  def squareEachElem(list: SList): SList = 
    if list.isEmpty then return SList.empty 

    else
      list.head * list.head :: squareEachElem(list.tail)
  ignoretest("squareEachElem", squareEachElem, "list")

  // SList
  // Problem 4 (Citation A)
  def splitAt(split: Int, list: SList): (SList,SList) = 
    var splitList = list 
    var list1 = SList.empty
    var newlist1 = SList.empty
    var newlist2 = SList.empty
    var list2 = SList.empty
    var count = 0 

    while splitList.nonEmpty do 
      if count >= split then 
        list2 = splitList.head :: list2
      else 
        list1 = splitList.head :: list1
      splitList = splitList.tail 
      count += 1 
    while list1.nonEmpty do 
      newlist1 = list1.head :: newlist1
      list1 = list1.tail
    while list2.nonEmpty do
      newlist2 = list2.head :: newlist2 
      list2 = list2.tail
    return (newlist1, newlist2)

  ignoretest("splitAt", splitAt, "split", "list")
  
  // MList
  // Problem 5 (Diagram on iPad)
  def firstAndEveryOther(list: MList): Unit = 
    var current = list 
    var info = list //info node 

    current = list.tail // set outside while loop because we know we want to start at the first value 
    while current.nonEmpty do  // do this since we can't do .tail on an empty space 
      if current.tail.nonEmpty then 
        current.tail = current.tail.tail // sets current.tail to two spots down the list 
        info.head -= 1 //since we skip the current.tail spot, we got rid of a spot in the list (one less item in list)
      
      current=current.tail // re assigns the position of current to the element after the skipped one  

  ignoretest("firstAndEveryOther",(l: MList) => {firstAndEveryOther(l);l},"list")
 
  // MList 
  // Problem 6 (Citation B) 
  def swapPairs(list: MList): Unit = 
   var current = list
   var next = current.tail 

   while current.tail.nonEmpty && next.tail.nonEmpty do 
    current.tail = next.tail
    next.tail = next.tail.tail
    current.tail.tail = next
    current = next
    next = current.tail

  ignoretest("swapPairs", (l: MList) => {swapPairs(l);l}, "list")