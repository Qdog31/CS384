object ice:
  import hwtest.slist.*
  import hwtest.mlist.*
  //import hwtest.Mlist.*

  /*
  // example list: (1,2,3) --> (3,2,1)
  def reverse (list: Mlist): Unit =  //returns nothing bc its Unit 
    var current = list
    var previous = MList.empty 
    var next = list 
    var result = MList.empty 

    while next.nonEmpty do 
      next = current.tail 
      current.tail = previous 
      previous = current 
      result = current 
      current = next 
    list = result 

    */

  def firstAndEveryOther(list: MList): Unit = 
    var current = list 
    var info = list.head //info node 
    var next = current 

    while current.nonEmpty do //does this need to be next.tail since next is ahead of the current pointer? 
      current = current.tail 
      next = current.tail 
      current = next.tail 
      info -= 1 
      
  println(firstAndEveryOther(list(2,21,31)))


@main def run: Unit = {}



  

