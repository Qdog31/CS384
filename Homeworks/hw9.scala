object hw9 extends hwtest.hw("CS384"):
   import scala.collection.mutable.{Stack, Queue}
  
   //I DID NOT USE ANY SOURCES OR ASSISTANCE REQUIRING DOCUMENTATION IN COMPLETING THIS ASSIGNMENT.
  //hw9 is worth 30 points.  It is hw9 and hw10 combined.
  
   def userName = "Quintin Sherrod"
  
  //write a breadth first search that returns the resulting spanning tree.
   def spanTreeB(g: Array[List[Int]], start: Int): List[(Int,Int)] = 
      var q = Queue.empty[Int]
      var node: Int = -1 
      var known = Set.empty[Int] //nodes already visited 
      var spanningtree = List.empty[(Int,Int)]

      q.enqueue(start) // enqueues the starting node 
      known += start 

      while q.nonEmpty do           
         node = q.dequeue() // dequeues the current 
         for element <- g(node) do // looking at neighbors from within the graph. Acts as indexing 
            if (!known.contains(element)) then 
               known += element
               q.enqueue(element)
               spanningtree = (node, element) :: spanningtree
      spanningtree



  //write a depth first search that returns the resulting spanning tree.
   def spanTreeD(g: Array[List[Int]], start: Int): List[(Int, Int)] = 
      var s = Stack.empty[Int]
      var node: Int = -1 
      var known = Set.empty[Int]
      var spanningtree = List.empty[(Int,Int)]


      s.push(start) // push the starting node onto the stack
      known += start 

      while s.nonEmpty do           
         node = s.pop() // pops the current node off stack
         for element <- g(node) do // looking at neighbors from within the graph. Acts as indexing 
            if (!known.contains(element)) then 
               known += element
               s.push(element)
               spanningtree = (node, element) :: spanningtree
      spanningtree

   


   // Testing Zone // Excess lines are an attempt at nice formatting //
   val graph = Array(List(1,3),List(0,2,3,4),List(1,4),List(0,1),List(1,2)) // creates the test graph 

   def testSpanTreeB(graph: Array[List[Int]], start: Int): Unit = //tests the breadth first search
      println(spanTreeB(graph,start))

   def testSpanTreeD(graph: Array[List[Int]], start: Int): Unit = //tests the deapth first search
      println(spanTreeD(graph,start))

   //Breadth first search 

   println("BFS: Starting at node 0")
   testSpanTreeB(graph,0)
   println("")
   println("BFS: Starting at node 1")
   testSpanTreeB(graph,1)
   println("")
   println("BFS: Starting at node 2")
   testSpanTreeB(graph,2)
   println("")
   println("BFS: Starting at node 3")
   testSpanTreeB(graph,3)
   println("")
   println("BFS: Starting at node 4")
   testSpanTreeB(graph,4)
   println("")

   //Deapth first search 
   
   println("DFS: Starting at node 0")
   testSpanTreeD(graph,0)
   println("")
   println("DFS: Starting at node 1")
   testSpanTreeD(graph,1)
   println("")
   println("DFS: Starting at node 2")
   testSpanTreeD(graph,2)
   println("")
   println("DFS: Starting at node 3")
   testSpanTreeD(graph,3)
   println("")
   println("DFS: Starting at node 4")
   testSpanTreeD(graph,4)
   println("")

   @main def run: Unit = {} 