object hw8 extends hwtest.hw("CS384"):
  import hwtest.parsers.*
  import hwtest.{Testable,Src}

  def userName = "Quintin Sherrod"
  
  enum MinHeap:
    case Empty
    case Node(item: Int, size: Int, left: MinHeap, right: MinHeap)
    
  /* Citation Zone
  MY DOCUMENTATION IDENTIFIES ALL SOURCES USED AND ASSISTANCE RECEIVED IN COMPLETING THIS ASSIGNMENT.
  
  CDT Bryan Almeida. 12 Apr 2023. Assistance given to the author, review of code. For problem two I was 
  getting the order incorrect for creating my new node with the embedded recursive call. I knew that for 
  the first statement (if size(winner.left)).... that I would need to call the recursive call on the third 
  parameter (left child), but I was trying to do loser,loser.left, instead of merging the loser with the 
  winners left child. I was able to understand why what I was doing was stupid (literally, doesn't make sense) 
  and fix this and the else statement to get the correct answer. Besides this small part, no further 
  assistance was provided. West Point, NY. 
  */ 
  

  //Provided Information

  //export MinHeap.*
  import MinHeap.{Empty, Node}
  // Represent the heap as a binary tree that satisfies the heap-order invariant:
  //   - for every non-Empty node t,
  //       t.item <= t.left.item (assuming left is not Empty)
  //       t.item <= t.right.item (assuming right is not Empty)
  // In addition, every node is annotated with its size (the number of
  // nodes in its subtrees plus itself).
  // HOT = Heap-Ordered Tree
  def isEmpty(h: MinHeap): Boolean = h == Empty
  ignoretest("isEmpty", isEmpty, "h")
  
  def size(h: MinHeap): Int =
    h match
      case Empty => 0
      case Node(_,sz,_,_) => sz
  ignoretest("size", size, "h")
  
   
  def min(h: MinHeap): Int = 
    h match
      case Empty => throw new NoSuchElementException ("Can't handle if it's empty")
      case Node(item,_,_,_) => item
  ignoretest("min", min, "h")

  //My work 

  // Problem 1 
  def insert(elem: Int, h: MinHeap): MinHeap = 
   merge(Node(elem,1,Empty,Empty),h)      // the node part turms the element into a Miniheap with one item/ value 
                                        // this allows us to merge this new small tree with the bigger miniheap
  
  ignoretest("insert", insert, "elem", "h")

  // Problem 2 
  def merge(h1: MinHeap, h2: MinHeap): MinHeap = 
    (h1, h2) match 
      case (h1,Empty) => h1
      case (Empty,h2) => h2 
      case (n1:Node,n2:Node) => 
        //picking a winner 
        var winner = n1 
        var loser = n2 
        if n1.item < n2.item then 
          winner = n1 
          loser = n2
        else 
          winner = n2 
          loser = n1 

        //doing recursive merge call
        if size(winner.left) < size(winner.right) then 
          Node(winner.item,size(winner)+size(loser),merge(winner.left,loser),winner.right) //citation above 

        else 
          Node(winner.item,size(winner)+size(loser),winner.left,merge(winner.right,loser))


  ignoretest("merge", merge, "h1", "h2")
  
  // Problem 3 
  def deleteMin(h: MinHeap): MinHeap = 
    h match 
      case Empty => throw new NoSuchElementException ("You cannot delete an empty set!")
      case n:Node => 
        merge(n.left,n.right) // we can ignore the head and just merge the left and right child 

  ignoretest("deleteMin", deleteMin, "h")




  //More Provided Information
  // DO NOT TOUCH THE CODE BELOW THIS LINE --------------------------
  given TestableMinHeap: Testable[MinHeap] =
    new Testable[MinHeap]:
      val name = s"MinHeap"
      def parse: Src => MinHeap =
        choose(
          'E' -> const(Empty),
          //'L' -> chain(TA.parse, Node(_,Empty,Empty)),
          'T' -> chain(pInt, pInt, parse, parse, Node(_,_,_,_))
        )
      override def equiv(x: MinHeap, y: MinHeap): Boolean =
        (x,y) match
          case (Empty, Empty) => true
          case (Node(xitem,xsize,xleft,xright), Node(yitem,ysize,yleft,yright)) =>
            xitem == yitem && xsize == ysize && equiv(xleft, yleft) && equiv(xright,yright)
          case (_, _) => false
    
  def encode(mh: MinHeap): String = mh match
    case Empty => "E"
    case Node(item, size, left, right) => s"T\"$item\" $size ${encode(left)} ${encode(right)}"
  
  var mh = Array(1,10,2,9,3,8,4,7,6,5)
  def makeMinHeap(a: Array[Int]): MinHeap =
    var minheap = Empty 
    for i <- a do
      minheap = insert(i,minheap)
    minheap
      
  val heap = makeMinHeap(mh)
  
  val res = encode(heap)
  print(res)