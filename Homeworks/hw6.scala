object hw6 extends hwtest.hw("CS384"):
  import hwtest.searchtrees.{SearchTree, Empty, Node}
  
  // The Binary Search Tree Invariant:
  // For any node n, every node in the left subtree of n has a value less than
  // n's value, and every node in the right subtree of n has a value greater
  // than n's value.
  
  def userName = "Quintin Sherrod"

  // Citation: I DID NOT USE ANY SOURCES OR ASSISTANCE REQUIRING DOCUMENTATION IN COMPLETING THIS ASSIGNMENT.

  // Inserting a new node must maintain the invariant
  // Problem 1 
  def insert(tree: SearchTree[Int], x: Int): SearchTree[Int] = 
    tree match
      case Empty => Node(Empty,x,Empty)
      case Node(left,item,right) => 
        if x > item then 
          Node(left,item,insert(right,x))
        else if x < item then 
          Node(insert(left,x),item,right)
        else tree 
  
  ignoretest("insert", insert, "tree", "x")

  // Searching for an element is made faster because of the invariant
  // Problem 2 
  def contains(tree: SearchTree[Int], x: Int): Boolean = 
    tree match  
      case Empty => false // x can't be in the tree if its empty.
      case Node(left,item,right) => 
        if item == x then true // if item is equal to our target, then the search tree contains it 
        else if x < item then // recursive call on the left side of the tree. If the left side contains x, then it wil fall into the above if statement where they will be equal and return true. 
          contains(left, x)
        else 
          contains(right, x) 
      
  ignoretest("contains", contains, "tree", "x")

  // Find the size of a tree
  // Problem 3 
  def size(tree: SearchTree[Int]): Int = 
    tree match 
      case Empty => 0
      case Node(left,item,right) => 1 + size(left) + size(right)

  ignoretest("size", size, "tree")
  
  // Find the minimum element in a tree
  // Problem 4 
  def minimum(tree: SearchTree[Int]): Int = 
    tree match 
      case Node(Empty,item,_) => item // once the left side is empty, our function will return the item (minimum value)
      case Node(left,_,_) => minimum(left) 

  ignoretest("minimum", minimum, "tree")
  
  //Removing a node must maintain the invariant
  //bonus problem (not attempted/completed)
  def remove(tree: SearchTree[Int], x: Int): SearchTree[Int] = ???
  
  ignoretest("remove", remove, "tree", "x")
