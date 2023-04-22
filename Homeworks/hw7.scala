object hw7 extends hwtest.hw("CS384"):
  /*
  MinHeap and Priority Queue are synonomous.
  PQMA is my name for Priority Queue Mutable ArrayBuffer as the ArrayBuffer
  is what we are using as the underlying Data Structure to represent the
  MinHeap.
  */
  
  /*DOCUMENTATION ZONE
  I DID NOT USE ANY SOURCES OR ASSISTANCE REQUIRING DOCUMENTATION IN COMPLETING THIS ASSIGNMENT.
  */

  def userName = "Quintin Sherrod"

  class PQMA: // MinHeap
    import scala.collection.mutable.ArrayBuffer
    
    //All private methods are used by the MinHeap Developer
    //The non private members are for the user of the MinHeap.    
    
    //buffer is the MinHeap
    private val buffer = ArrayBuffer.empty[Int]
    
    //toString adds the paens and commas to output
    override def toString(): String =
      buffer.mkString("("," ", ")")
    
    //sifts the element at index to its proper location
    // Problem 1 
    
    private def siftUp(index: Int): Unit =
      var tempIndex = index 
      var flag = true

      while flag do 
        if tempIndex <= 0 then 
          flag = false 
        else if buffer(tempIndex) < buffer(parent(tempIndex)) then 
          swap(tempIndex,parent(tempIndex))
          tempIndex = parent(tempIndex)
        else
          flag = false 
       
    //swaps the elements at the given indexes
    // Problem 2 
    private def swap(idx1:Int, idx2:Int): Unit =  
      var temp1 = buffer(idx1) //holds value of the first index 
      buffer(idx1) = buffer(idx2) 
      buffer(idx2) = temp1 
    
    //sift the element at index to its proper location
    // Problem 3 
    private def siftDown(index: Int): Unit = 
      var tempIndex = index 
      var flag = true // helps with iterative process within while loop
      var leftChild = 0 // initializes children varibles
      var rightChild = 0 

      while flag do 
        leftChild = left(tempIndex)
        rightChild = right(tempIndex) 
        if leftChild < buffer.size then //checks to see if children are valid index 
          var smaller = 0 //will be used to see whether right or left child is smaller 
          if rightChild < buffer.size then 
            if buffer(leftChild) < buffer(rightChild) then //checks actual element to see which is smaller 
              smaller = leftChild
            else
              smaller = rightChild
          else 
            smaller = leftChild

          if buffer(tempIndex) > buffer(smaller) then // swaps current index with smaller child
            swap(tempIndex,smaller)
            tempIndex = smaller

          else 
            flag = false 
      
        else 
          flag = false


    //returns the index of the parent of the element at index
    private def parent(index: Int): Int =
      (index - 1)/2
    
    //returns the index of the element that is to the left of the element at the given index
    private def left(index: Int): Int =
      index * 2 + 1
    
    //returns the index of the element that is to the right of the element at the given index
    private def right(index: Int): Int =
      index * 2 + 2
    
    //returns true if the MinHeap is empty
    def isEmpty: Boolean = buffer.isEmpty
    
    //returns the value of the element at the root
    def peek: Int = buffer(0)
    
    //returns the size of the MinHeap
    def size: Int = buffer.size

    //returns the element that is dequeued from the MinHeap 
    def dequeue: Int =
      if buffer.isEmpty then throw new NoSuchElementException ("trying to dequeue from an empty queue")
      else if buffer.size == 1 then buffer.remove(buffer.size - 1)
      else
        val temp = buffer(0)
        buffer(0) = buffer.remove(buffer.size-1)
        siftDown(0)
        temp
    
    //enqueues the given element into the MinHeap
    def enqueue(item: Int): Unit = 
      println("adding " + item + " to queue")
      //add the item to the buffer
      buffer += item
      //call siftup to properly position the item in the MinHeap(buffer)
      siftUp(buffer.size - 1)
      println(buffer)

  //This is the PQMA companion object. 
  //It is needed to construct the Empty MinHeap
  //and the apply method allows us to create a MinHeap given multiple integers.
  //Note that apply simply calls enqueue for each given element.
  object PQMA:
    def empty = new PQMA

    def apply(elems: Int*): PQMA =
      val pq: PQMA = new PQMA
      for i <- elems do
        pq.enqueue(i)
      pq

  
  // Create an empty MinHeap
  val z = PQMA.empty

  //Create a list of number, used to enqueue in the MinHeap  
  val numbers: List[Int] = List(10,1,9,2,8,3,8,4,7,5,6)
  //Loop through the numbers and enqueue them
  for value <- numbers do
    z.enqueue(value)
    println(z.size)
  //peek to see the min element of the MinHeap
  println("peek = " + z.peek)
  println(z)
  //dequeue the items from the MinHeap
  for i <- 0 until z.size do
    println(z.dequeue)