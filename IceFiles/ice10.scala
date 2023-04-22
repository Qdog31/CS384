object ice10 extends hwtest.hw("CS384"):
  import hwtest.binarytrees.{BinaryTree, Empty, Node}
  //to import queues 
  import scala.collection.mutable.{Queue}
  
  
  def userName = "Quintin Sherrod"
      
  def size(tree: BinaryTree[Int]): Int = 
    tree match 
      case Empty => 0
      case Node(x,left,right) => 1 + size(left) + size(right) //the node is a size of 1, and then add the size of l and r side.

  ignoretest("size", size, "tree")
  
  def sum(tree: BinaryTree[Int]): Int = 
    tree match 
      case Empty => 0 
      case Node(x,left,right) => x + sum(left) + sum(right)

  ignoretest("sum", sum, "tree")

  def inOrderToList(tree: BinaryTree[Int]): List[Int] = 
    tree match 
      case Empty => List[Int]() // if tree is empty return empty list 
      case Node(left: BinaryTree[Int], item: Int, right: BinaryTree[Int]) =>
        inOrderToList(left) 

  println(inOrderToList(T22 T22 T24 E E E E))    