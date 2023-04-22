object hw5 extends hwtest.hw("CS384"):
  import hwtest.binarytrees.{BinaryTree, Empty, Node}
  import scala.collection.mutable.{Queue}
  
  def userName = "Quintin Sherrod" 
  
  /* definition of BinaryTree
  enum BinaryTree[+A]:
    case Empty
    case Node(item: A, left: BinaryTree[A], right: BinaryTree[A])
  */

  /*DOCUMENTATION SIGNATURE BLOCK GOES HERE
  I DID NOT USE ANY SOURCES OR ASSISTANCE REQUIRING DOCUMENTATION IN COMPLETING THIS ASSIGNMENT.
  */

  //Problem 1 
  //traverse the tree in-order and put in a list
  def inOrderToList(tree: BinaryTree[Int]): List[Int] = 
    def recurseTree(tree: BinaryTree[Int], list: List[Int]) : List[Int] = 
      tree match 
        case Empty => list // if tree is empty return the list (what weve seen so far)
        case Node(item,left,right) =>
          recurseTree(left,item :: recurseTree(right,list)) // the second parameter is the list with the item prepended with the output of the recursive call to get all values from the right side 
    recurseTree(tree, List[Int]())
  ignoretest("inOrderToList", inOrderToList, "tree")


  //Problem 2 
  //traverse the tree using pre-order and put the elements in a list
  def preOrderToList(tree: BinaryTree[Int]): List[Int] = 
    def recurseTree(tree: BinaryTree[Int], list: List[Int]) : List[Int] = 
          tree match 
            case Empty => list // if tree is empty return the list (what weve seen so far)
            case Node(item,left,right) =>
              item :: recurseTree(left,recurseTree(right,list))   // prepends the item to the recursed left tree, which is prepended to the recursed right tree. So, item :: left tree :: right tree 
    recurseTree(tree, List[Int]())
  ignoretest("preOrderToList", preOrderToList, "tree")
    
  //Problem 3 
  //traverse the tree using post-order and put the elements in a list 
  def postOrderToList(tree: BinaryTree[Int]): List[Int] = 
    def recurseTree(tree: BinaryTree[Int], list: List[Int]) : List[Int] = 
              tree match 
                case Empty => list // if tree is empty return the list (what weve seen so far)
                case Node(item,left,right) =>
                  recurseTree(left, recurseTree(right,item::list)) 
  
    recurseTree(tree, List[Int]())
  ignoretest("postOrderToList", postOrderToList, "tree")
  
  //Problem 4 
  //traverse the tree using level-order and put the elements in a list (you can use the .reverse method) 
  def levelOrderToList(tree: BinaryTree[Int]): List[Int] = 
    var q = Queue.empty[BinaryTree[Int]] // creates an empty queue for future use 
    var result = List.empty[Int] // list that will contain all values from the BT 

    q.enqueue(tree) // enqueues the entire tree (it points at the root node)
    while q.nonEmpty do // iterative approach 
      q.dequeue() match // pattern matching on the values coming off the queue
        case Empty => {} // do nothing if the value is empty 
        case Node(item,left,right) => 
          result = item::result  // appends the item node (single element) to the result list 
          q.enqueue(left) // enqueues the left child 
          q.enqueue(right) // enqueues the right child
    result.reverse // reverses list to get right order.
  ignoretest("levelOrderToList", levelOrderToList, "tree")