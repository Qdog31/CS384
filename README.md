# CS384 - Data Structures Class

<b>Course Description:</b> <br>

This course builds on the cadet’s basic programming knowledge. It emphasizes data structures and abstract data types as tools for the analysis, design, and implementation of software modules to meet specified requirements. They will examine data structures including arrays, hash tables, linked lists, and trees, and abstract data types such as heaps, queues, sets, and stacks. The course covers hashing, recursion, searching, and sorting techniques. Cadets will use the Scala Programming Language for all course content. They will design software solutions by employing problem decomposition and selecting appropriate abstract data types and algorithms.

<b>Course Objectives:</b> 
1.	Discuss the appropriate use of built-in data structures; describe common applications for each of the following data structures: stack, queue, priority queue, set, and map; write programs that use each of the following data structures: arrays, records/structs, strings, linked lists, stacks, queues, sets, and maps; and choose the appropriate data structure for modeling a given problem.
2.	Know and understand how to program in Scala 3. We are not using Scala 2! I do not want to see curly braces where they do not belong nor do I want to see parentesis or the use of the return keyword where they are not needed. NO PSEUDO CODE! / NO PYTHON! -Use the online documentation to help you learn Scala 3.
3.	Determine informally the time and space complexity of simple algorithms; and state the formal definition of big O.
4.	Implement basic numerical algorithms and simple search algorithms, and explain the differences in their time complexities; be able to implement common quadratic and O(N log N) sorting algorithms; and describe the implementation of hash tables, including collision avoidance and resolution.
5.	Discuss the runtime and memory efficiency of principal algorithms for sorting, searching, and hashing.
6.	Explain how tree balance affects the efficiency of various binary search tree operations; describe the heap property and the use of heaps as an implementation of priority queues.

7.	Solve problems using fundamental graph algorithms, including depth-first and breadth-first search.
8.	Implement, test, and debug simple recursive functions and procedures; determine whether a recursive or iterative solution is most appropriate for a problem; and implement a divide-and-conquer algorithm for solving a problem.



# Instructions for CS384 Homeworks 

[Homework 1](https://github.com/Qdog31/CS384/tree/main#homework-1) <br>
[Homework 2](https://github.com/Qdog31/CS384/tree/main#homework-2) <br>
[Homework 3](https://github.com/Qdog31/CS384/tree/main#homework-3) <br>
[Homework 4](https://github.com/Qdog31/CS384/tree/main#homework-4) <br>
[Homework 5](https://github.com/Qdog31/CS384/tree/main#homework-5) <br>
[Homework 6](https://github.com/Qdog31/CS384/tree/main#homework-6) <br>
[Homework 7](https://github.com/Qdog31/CS384/tree/main#homework-7) <br>
[Homework 8](https://github.com/Qdog31/CS384/tree/main#homework-8) <br>


## Homework 0
<article><blockquote><p>NOTE: We will work on Homework 0 in class during Lesson 1.
But give it a try before class. See if you can figure out Scala&rsquo;s syntax</p></blockquote><ul><li><b>Please make sure you cite, in-line, any assistance you receive.</b></li><li>In the (userName) function please replace the (???) with your real name <b>in quotes</b> so we know whose homework we are correcting. <b>DO NOT USE YOUR GIT USERNAME HERE!</b>.</li><li>Example <b>corrcet:</b> def userName = &ldquo;tom Cook&rdquo;</li><li>Example <b>incorrect:</b> (def userName = &ldquo;t4nker&rdquo;</li></ul><p>Implement the the following functions in Scala.</p><ol><li>(0 points) Write the function:<br>def sumValuesBtweenIntsDivBySevenInc(num1: Int, num2: Int): Int =<br>which takes two integers (num1) and (num2) and returns the sum of the numbers between the two values <b>inclusive</b>, if they are divisible by 7.</li></ol><p>sumValuesBtweenIntsDivBySevenInc(6,22) should return 42.</p><ol start=2><li>(0 points) Write the function:<br>sumValuesInScalaList(list: List[Int]): Int = <br>which takes a (list) of integers and returns the (sum) of the values in the list.</li></ol><p>sumValuesInScalaList(List(1,2,3)) should return 6.<br>sumValuesInScalaList(List(2,4,6,8)) should return 20 and<br>sumValuesInScalaList(List(9)) should return 9.</p></article></main><footer>


## Homework 1
<article><b><p>The goals for this homework are:<br></b>-Familiarization with Scala syntax.<br>-Working with basic Scala Types: Ints,Floats, Chars, Strings, Tuples, Options.<br>-Solve problems using Scala.</p><p><span style=color:red>NOTE: You will be limited in your use of Array and String methods so read the instructions carefully</span>.</p><ol><li><p><code>def squareRoot(num: Int): Option[Double] =</code><br>Write a function that returns the square root of a given integer wrapped in an Option[Double] <a href=https://dotty.epfl.ch/api/scala/Option.html>Scala 3 API Option</a>. If the given integer is negative then return None else return the result wrapped in a Some(). You may use Scala&rsquo;s sqrt function.
<b>Example:</b> given the integer <code>19</code> the function should return <code>Some(4.358898943540674)</code>.<br><b>Example:</b> given the integer <code>-5</code> the function should return <code>None</code>.</p></li><li><p><code>def size(array: Array[String]): Int =</code><br>Write a function that counts the number of elements in the array <b>(size)</b> and return it.<br>-You may not use any Scala built in functions.<br><b>Example:</b> given the array <code>Array("tank", "sabot", "heat")</code> the function should return <code>3</code>.<br><b>Example:</b> given the array <code>Array("cease", "fire", "freeze", "clear", "and", "elevate")</code> the function should return <code>6</code>.</p></li><li><p><code>def search(target: Int, array: Array[Int]): Boolean =</code><br>Write a function that retruns true if the given target is found in the given array and false otherwise.<br>-You must use a for loop and search the array.<br>-you may use the .length method for Array.</p><p><b>Example:</b> given the target <code>5</code> and the Array(4,6,78,5) the function would return <code>true</code>.<br><b>Example:</b> given the target <code>15</code> and the Array(4,6,78,3,67) the function would return <code>false</code>.</p></li><li><p><code>def countVowels(str: String): Int =</code><br>Write a function that returns the number of vowels in a given string.<br>-you may use Scala&rsquo;s <code>Set</code> if you&rsquo;d like.<br><b>Example:</b> given the string <code>hello</code> the function would return <code>2</code>.<br><b>Example:</b> given the string <code>shyly</code> the function would return <code>0</code>.</p></li><li><p><code>def discount(price: Int, discount: Int): Int =</code><br>Write a function that takes a price and a discount and returns the discounted price.<br><b>Example:</b> given the price <code>100</code> and the discount <code>20</code> the function would return <code>80</code>.<br><b>Example:</b> given the price <code>1000</code> and the discount <code>40</code> the function would return <code>600</code>.</p></li><li><p><code>def xsEqualos(str: String): Boolean =</code><br>Write a function that takes a string of x&rsquo;s and o&rsquo;s and returns a Boolean that determines if the number of x&rsquo;s equals the number of o&rsquo;s.<br><b>Example:</b> given the string <code>"xo"</code> the function would return <code>true</code>.<br><b>Example:</b> given the string <code>xoxox</code> the function would return <code>false</code>.</p></li><li><p><code>def maskCreditCardNum(str: String): String =</code><br>Write a function that takes a string (Credit Card Number) and returns the string with the first five numbers masked with asterisk&rsquo;s <code>*</code> and showing only the last 4 numbers.<br><b>Example:</b> given the string <code>"123456789"</code> the function would return <code>*****6789</code>.<br><b>Example:</b> given the string <code>945283232</code> the function would return <code>*****3232</code>.</p></li></ol></article></main><footer>

[To Top](https://github.com/Qdog31/CS384/tree/main#instructions-for-cs384-homeworks)

## Homework 2
<p><b>The goals for this homework are:</b><br>i. Familiarization with Scala syntax.<br>ii. Working with Scala <code>Array</code>.<br>iii. Looping through element&rsquo;s of a Scala <code>Array</code>.<br>iv. Solve problems using Scala&rsquo;s <code>Array</code>.<br>v. Determine the number of steps your code will take in the worst case.</p><p>In this homework you will write 5 functions that will operate on Scala <code>Array</code>&rsquo;s.<br>You may use <code>for</code> loops or <code>while</code> loops or any combination of the two.<br><b>You may NOT use recursion</b> and <b>you may ONLY use the<br>following Array methods:</b></p><ul><li>.length</li><li>.isEmpty</li><li>You may also use the <code>arr(i)</code> or <code>arr(i) = x</code> syntax.</li></ul><p>Implement the following functions:</p><ol><li><p><code>def findMax(array: Array[Int]): Int = ???</code><br>Write a function that takes an <code>Array</code> of integers and returns the max value in the Array.
<b>Example:</b> given the <code>Array(1, 2, 3)</code> the function returns 3.<br><b>Example:</b> given the <code>Array(2, 2, 2)</code> the function returns 2.<br><b>Example:</b> given the <code>Array(15, 22, 9, 18, 1, 7, 9)</code> the function returns 22.<br>How many steps will your code take in the worst case?<br>Write your answer in the comment provided in the code!</p></li><li><p><code>def countDupes(array: Array[Int]): Int = ???</code><br>Write a function that takes an <code>Array</code> of integers and returns the number of duplicate values in the Array.<br><b>Example:</b> given the <code>Array(34, 3, 54, 21, 1, 99, 45, 2, 15)</code>, the function would return 0</span><br><b>Example:</b> given the <code>Array(1, 16, 1, 47, 27, 26, 8, 26, 25, 43, 47, 31, 19)</code>, the function would return 3</span><br><b>Note: if a number appears two or more times it is a duplicate.</b><br>How many steps will your code take in the worst case?<br>Write your answer in the comment provided in the code!</p></li><li><p><code>def median(arr: Array[Int]): Int = ???</code><br>Write a function that takes a sorted <code>Array</code> of integers and returns the median value of the Array.<br><b>Example:</b> given the <code>Array(1, 21)</code> the function would return <code>11</code><br><b>Example:</b> given the <code>Array(32, 55, 17, 24, 5)</code> would return <code>17</code>.<br>How many steps will your code take in the worst case?<br>Write your answer in the comment provided in the code!</p></li><li><p><code>def reverseArray(arr: Array[Int]): Unit = ???</code><br>Write a function that takes an <code>Array</code> of integers and returns the same Array but with the contents in reverse order.<br><b>Example:</b> given the <code>Array(1, 21)</code> the function would return <code>Array(21, 1)</code><br><b>Example:</b> given the <code>Array(32, 55, 17, 24, 5)</code> would return <code>Array(5, 24, 17, 55, 32)</code>.<br>How many steps will your code take in the worst case?<br>Write your answer in the comment provided in the code!</p></li><li><p><code>def binarySearch(target: Int, array: Array[Int]): Int = ???</code><br>Write a function that takes a sorted <code>Array</code> of integers and returns the index of the target if it is found, -1 otherwise.<br><b>Example:</b> given the <code>Array(2, 4, 6)</code> and the target 4 the function would return 1.<br><b>Example:</b> given the <code>Array(4, 5, 7, 8, 10, 21, 27, 39)</code> and the target 39, the function would return <code>7</code><br><b>Example:</b> given the <code>Array(4, 5, 7, 8, 10, 21, 27, 39)</code> and the target 6, the function would return <code>-1</code><br>How many steps will your code take in the worst case?<br>Write your answer in the comment provided in the code!</p></li></ol></article></main><footer>

[To Top](https://github.com/Qdog31/CS384/tree/main#instructions-for-cs384-homeworks)


## Homework 3
<p><b>The goals for this homework are:</b><br>(i) Familiarization with Scala syntax.<br>(ii) Familiarization with Scala&rsquo;s List.<br>(iii) Draw Divde-Conquer-Glue Diagrams for each problem.<br>(iv) Write a recursive solution for each problem.</p><p><b>For each function you may <b>NOT</b> use any of the Scala List methods for this homework except for:</b><br>.isEmpty / .nonEmpty, .head, .tail, .:: (cons), or List.empty</p><ol><li><code>def filterPositives(list: List[Int]): List[Int] = ???</code></li></ol><p>Write a recursive function, filterPositives(list), that returns a new list containing<br>only the positive elements from the original list, in their original order<br><b>Example:</b> filterPositives(List(1,-2,3,7,0,-21)) == List(1,3,7)<br><em>The Scala built-in version is</em> <b>list.filter(_ > 0)</b></p><ol start=2><li><code>def append(list1: List[Int], list2: List[Int]): List[Int] = ???</code></li></ol><p>Write a recursive function, append(list1,list2), that returns a list containing the elements of list1
followed by the elements of list2.<br><b>Example:</b> append(List(1,3,5), List(2,4,6,8)) == List(1,3,5,2,4,6,8)<br><em>The Scala built-in version is <b>list1 ::: list2</b> ::: (triple cons)</em></p><ol start=3><li><code>def flatten1(lol: List[List[Int]]): List[Int] = ???</code></li></ol><p>Write a recursive function, flatten1(lol), that takes a list of lists and combines all their
elements into a single list, in order.<br><b>Example:</b> flatten1(List(List(1,3,5),List(4),List(2,6)) == List(1,3,5,4,2,6)<br><em>The Scala built-in version is</em> <b>lol.flatten</b><br>You&rsquo;ll implement this twice. For this version, use append, that you wrote above, as a helper function.</p><ol start=4><li><p><code>def flatten2(lol: List[List[Int]]): List[Int] = ???</code><br>For this second version of flatten, do all the work inside this function WITHOUT any helper functions.</p></li><li><p><code>def indexOf(target: Int, list: List[Int]): Int = ???</code><br>Write a recursive function, indexOf(target, list), that returns the index at which the target element appears in the list, or -1 if it doesn&rsquo;t appear at all (if the target appears multiple times, return the index of the first appearance).<br><b>Examples:</b><br>indexOf(7,List(1,3,7,4,7)) == 2<br>indexOf(5,List(1,3,7,4,7)) == -1<br><em>The Scala built-in version is</em> <b>list.indexOf(target).</b></p></li></ol></article></main><footer>

[To Top](https://github.com/Qdog31/CS384/tree/main#instructions-for-cs384-homeworks)

## Homework 4
<p><b>The goals for this homework are:</b><br>(i) Familiarization with Scala syntax<br>(ii) Work with the Scala List, SList, and MList Types and<br>(iii) Manipulating SLists and MLists using loops and pointers and<br>(iv) Manipulating Scala Lists using recursion and Pattern Matching</p><p><b>Helpful resources:</b><br>(i) <a href=https://eecscourses.westpoint.edu/courses/cs384/lessons/slistapi.pdf>SList / MList API</a><br>(ii) <a href=https://eecscourses.westpoint.edu/courses/cs478/Readings/divideconquerglue.html>Dr. Okasakis' Recursion Tip 1: Divide-Conquer-Glue Diagrams</a><br>(iii) <a href=https://eecscourses.westpoint.edu/courses/cs478/Readings/accum.html>Dr. Okasaki&rsquo;s Recursion Tip 2: Accumulating Parameters</a></p><p>The following methods below are the <span style=color:red><b>only</b></span> SList/MList methods available for use in this homework:</p><ul><li>S/MList.empty</li><li>.isEmpty</li><li>.nonEmpty</li><li>.:: (cons)</li><li>.head</li><li>.tail</li></ul><p>NOTE: Problems 1 and 2 use <b>Scala Lists</b> and <span style=color:red>require you to use pattern macthing and recursion.</span></p><ol><li><p><code>def filterPositives(list: List[Int]): List[Int] =</code><br>Write a function that uses pattern matching and recursion to return a List containing only the positive numbers.<br><b>Example:</b> <code>List(6, -5, 4, -8, -3, 6, 2)</code> returns <code>(6, 4, 6, 2)</code>.</span></p></li><li><p><code>def removeAllTarget(target: Int, list: List[Int]): List[Int] =</code><br>Write a function that uses pattern matching and recursion. The function returns a list that removes all instances of the target value from the list.<br><b>Example:</b> <code>removeAllTarget(6,List(6, 5, 4, 8, 3, 6, 2))</code> returns <code>(5, 4, 8, 3, 2)</code>.</span></p></li></ol><p>NOTE: Problems 3-6 use <b>SList and MList</b>. Remember, SList / MList do not work with Pattern matching and they only have the methods listed above.</p><ol start=3><li><p><code>def squareEachElem(list: SList): SList =</code><br>Write a function that squares each element of an SList and returns the resulting SList.<br>Use pointers to move
<b>Example:</b> <code>SList(2,4,6,8,10)</code> returns <code>SList(4, 16, 36, 64, 100)</code>.</span></p></li><li><p><code>def splitAt(splitPoint: Int, list: SList): (SList,SList) =</code><br>Write a function that splits the SList at splitPoint and returns a tuple (SList,SList). The first SList in the tuple contains the first throuh and including the splitPoint values and the second SLIst in the tuple contains every element after the SplitPoint element.<br><b>Example:</b> <code>3 SList(6, -5, 4, -8, -3, 6, 2)</code> returns <code>(SList(6, -5, 4), SList(-8, -3, 6, 2))</code>.</span></p></li><li><p><code>def firstAndEveryOther(list: MList): Unit =</code><br>Write a function that modifies an MList to contain the first element and then every other element of the list.<br>You may only move tail pointers or other pointers you created to accomplish this task.<br><b>Example:</b> <code>MList(7, 6, -5, 4, -8, -3, 6, 2)</code> modifies to <code>MList(4, 6, 4, -3, 2)</code>.</span></p></li><li><p><code>def swapPairs(list: MList): Unit =</code><br>Write a function that modifies an MList to swap the pairs of elements in the list.<br>You may only move tail pointers or other pointers you created to accomplish this task.<br><b>Example:</b> <code>MList(6, -5, 4, -8, -3, 6, 2)</code> returns <code>MList(6, 4, -5, -3, -8, 2, 6)</code>.</span></p></li></ol></article></main><footer>

[To Top](https://github.com/Qdog31/CS384/tree/main#instructions-for-cs384-homeworks)

## Homework 5

**The goals for this homework are:**  
(i) Familiarization with scala syntax  
(ii) Familiarization with Binary Tree Data Structure (iii) Traversal of a Binary Tree  
(iv) Pattern Matching and recursion

*   Definition of a BinaryTree from class
    
        enum BinaryTree[+A]:  
          case Empty  
          case Node(item: A, left: BinaryTree[A], right: BinaryTree[A])
        
    
    **YOU MAY NOT USE TRIPLE CONS (:::) FOR THIS HW**
    

1.  `def inOrderToList(tree: BinaryTree[A]): List[A]`: Returns a list of all items in `tree`, ordered from left,**Root**,right. For example, given the tree below, return `List(4, 3, 5, 2, 7, 6, 8, 1, 9)`. _Hint: a Helper may be useful._
 ```
           1
          / \
        _2_  9
       /   \
      3     6
     / \   / \
    4   5 7   8
 ```

2.  `def preOrderToList(tree: BinaryTree[A]): List[A]`: Returns a list of all items in `tree`, ordered from **Root**,left,right. For example, given the tree below, return `List(1, 2, 3, 4, 5, 6, 7, 8, 9)`. _Hint: a Helper may be useful._
```
           1
          / \
        _2_  9
       /   \
      3     6
     / \   / \
    4   5 7   8
```  

3.  `def postOrderToList(tree: BinaryTree[A]): List[A]`: Returns a list of all items in `tree`, ordered from left,right,**Root**. For example, given the tree below, return `List(4, 5, 3, 7, 8, 6, 2, 9, 1)`. _Hint: a Helper may be useful._
```
           1
          / \
        _2_  9
       /   \
      3     6
     / \   / \
    4   5 7   8
 ```

4.  `def levelOrderToList(tree: BinaryTree[A]): List[A]`: Returns a list of all items in `tree`, ordered from top to bottom, left to right. For example, given the tree below (where item `1` is in the root node), return `List(1, 2, 9, 3, 6, 4, 5, 7, 8)`. _Hint: Queues might be useful (as we did in class). You may also use the .reverse method in this problem if you’d like._
```
           1
          / \
        _2_  9
       /   \
      3     6
     / \   / \
    4   5 7   8
```

[To Top](https://github.com/Qdog31/CS384/tree/main#instructions-for-cs384-homeworks)

## Homework 6 

<p><b>Binary Search Tree (<code>BST</code>) –</b> A binary search tree is a node-based tree data structure which has the following invariants or properties (we will use the term invariants from here on out):</p><p><b>INVARIANTS:</b></p><ul><li>The left subtree of a node contains only nodes with keys that are strictly less than(&lt;) the key in the parent node.</li><li>The right subtree of a node contains only nodes with keys that are strictly greaterthan (>) the key in the parent node.</li><li>The left and right subtree each must also be a binary search tree</li></ul><p><b>Definitions:</b></p><p><b>root node:</b> The root node is the node at the very top of the tree. If the root has any nodes below it, the invariants must also hold true.</p><p><b>parent node:</b> a node is a parent node if it has either a left or right node attached to it. Notice that leaf nodes have no children and therefore are not parents. If a node is inserted in the tree at a leaf node, it becomes a parent (oh happy day!).</p><p><b>child node:</b> a child node is a node that has a node directly above it. Notice that the root node does not have a parent and therefore is not a child node.</p><p><b>keys:</b> The item in our Node is referred to as the key, it is used to ensure the invariants hold true.</p><p><span style=color:red><b>USE PATTERN MATCHING AND RECURSION FOR THESE PROBLEMS</b></p><p><code>BST</code>’s can be defined in many ways. Our <code>BST</code> has the following definition using Scala syntax:</p><div class=highlight><pre class=chroma><code class=language-scala data-lang=scala>  <span class=n>enum</span> <span class=nc>SearchTree</span><span class=o>[</span><span class=kt>+A</span><span class=o>]</span><span class=k>:</span>  
    <span class=kt>case</span> <span class=kt>Empty</span>  
    <span class=k>case</span> <span class=nc>Node</span><span class=o>(</span><span class=n>left</span><span class=k>:</span> <span class=kt>SearchTree</span><span class=o>[</span><span class=kt>A</span><span class=o>],</span> <span class=n>item</span><span class=k>:</span> <span class=kt>A</span><span class=o>,</span> <span class=n>right</span><span class=k>:</span> <span class=kt>SearchTree</span><span class=o>[</span><span class=kt>A</span><span class=o>])</span>  
</code></pre></div><p><b>Homework problems:</b></p><ol><li><p>Write a function called insert that takes a SearchTree and an Integer and returns the new SearchTree with the new element in it.<br><code>def insert(tree: SearchTree[Int], x: Int): SearchTree[Int] =</code></p></li><li><p>Write a function called contains that takes a SearchTree and an integer and returns true if the SearchTree contains the integers and false otherwise.<br><code>def contains(tree: SearchTree[Int], x: Int): Boolean =</code></p></li><li><p>Write a function that takes a SearchTree and returns the size of the SearchTree.<br><code>def size(tree: SearchTree[Int]): Int =</code></p></li><li><p>Write a function that takes a SearchTree and returns the minimum value of the SearchTree.<br><code>def minimum(tree: SearchTree[Int]): Int =</code></p></li></ol><p><span style=color:red><b>BONUS</b></span></p><ol start=5><li>Write a function that takes a SearchTree and an Integer and returns a new SearchTree with the target integer removed from the SearchTree.<br>This is a tough problem as you may have to remove a node from the middle of the tree. If you do that, then you need to decide which node is the successor node.<br>(Hint: You may want to do a tree match inside of the current tree match.) For this remove, we will take the <b>minimum</b> of the right side as our successor.<br>You will have to rebuild the tree with that successor. Choosing the succesor really doesn&rsquo;t matter in that it can be done in differnt ways. I am telling you that the minimum of the right subtree will be our successor so that you will pass the tests that I have written.<br><code>def remove(tree: SearchTree[Int], x: Int): SearchTree[Int] =</code></li></ol></article></main><footer>

[To Top](https://github.com/Qdog31/CS384/tree/main#instructions-for-cs384-homeworks)

## Homework 7
<p><b>Heap / Priority Queue</b> - Heap and Priority Queue are synonomous.<br>In class we discussed two underlying Data Structures for implementing a Heap / Priority Queue</p><ul><li>The Array buffer was the first Data Structure discussed for implementation.</li><li>The Binary Tree was the second Data Structure discussed for implementation.</li></ul><p>In this homework we will investigate how we use the ArrayBuffer to implement the MinHeap (Priority Queue).<br>First, recall the invariants that must hold when using the ArrayBuffer.</p><p><b>INVARIANTS:</b></p><ul><li><b>Shape invariant:</b> The tree must be a complete tree. This means that in the logical tree representation of the Heap, each level of the tree must be completely full, except for the last level.
The last level of the logical Tree does not have to be completely full, but all elements in the level must be as far left as possible.</li><li><b>Order invariant:</b> The order invariant depends on whether we are implementing a MinHeap or MaxHeap. In each case the highest priority element is the root of the tree. In The case of a MaxHeap, the maximum value in the heap is the highest priority element and is therfore the root element, in a MinHeap, the minimum value is the root element.</li></ul><p>For this homework you will implement a MinHeap using an ArrayBuffer[Int]. The MinHeap keys are integers and the lowest value in the Heap is the Highest priority element.
This homework will not have any built in tests like previous homeworks. The following explains how you will test your code.</p><p><b>Testing the MinHeap</b></p><div class=highlight><pre class=chroma><code class=language-Scala data-lang=Scala><span class=c1>// Create an empty MinHeap.
</span><span class=c1></span>  <span class=k>val</span> <span class=n>z</span> <span class=k>=</span> <span class=nc>PQMA</span><span class=o>.</span><span class=n>empty</span>

<span class=c1>//Create a list of numbers, used to enqueue in the MinHeap.  
</span><span class=c1></span><span class=k>val</span> <span class=n>numbers</span><span class=k>:</span> <span class=kt>List</span><span class=o>[</span><span class=kt>Int</span><span class=o>]</span> <span class=k>=</span> <span class=nc>List</span><span class=o>(</span><span class=mi>10</span><span class=o>,</span><span class=mi>1</span><span class=o>,</span><span class=mi>9</span><span class=o>,</span><span class=mi>2</span><span class=o>,</span><span class=mi>8</span><span class=o>,</span><span class=mi>3</span><span class=o>,</span><span class=mi>8</span><span class=o>,</span><span class=mi>4</span><span class=o>,</span><span class=mi>7</span><span class=o>,</span><span class=mi>5</span><span class=o>,</span><span class=mi>6</span><span class=o>)</span>

<span class=c1>//Loop through the numbers and enqueue them, print them out as they are enqueued.
</span><span class=c1></span><span class=k>for</span> <span class=n>value</span> <span class=k>&lt;-</span> <span class=n>numbers</span> <span class=k>do</span>
  <span class=n>z</span><span class=o>.</span><span class=n>enqueue</span><span class=o>(</span><span class=n>value</span><span class=o>)</span>
  <span class=n>println</span><span class=o>(</span><span class=n>z</span><span class=o>.</span><span class=n>size</span><span class=o>)</span>

<span class=c1>//call peek to see the current min element of the MinHeap
</span><span class=c1></span>  <span class=n>println</span><span class=o>(</span><span class=s>&#34;peek = &#34;</span> <span class=o>+</span> <span class=n>z</span><span class=o>.</span><span class=n>peek</span><span class=o>)</span>
  <span class=n>println</span><span class=o>(</span><span class=n>z</span><span class=o>)</span>

<span class=c1>//dequeue all the elements from the MinHeap
</span><span class=c1></span>  <span class=k>for</span> <span class=n>i</span> <span class=k>&lt;-</span> <span class=mi>0</span> <span class=n>until</span> <span class=n>z</span><span class=o>.</span><span class=n>size</span> <span class=k>do</span>
    <span class=n>println</span><span class=o>(</span><span class=n>z</span><span class=o>.</span><span class=n>dequeue</span><span class=o>)</span>
</code></pre></div><p>When writing the code for this homework, you must look at it from two perspectives:</p><ul><li>1: The private methods are written from the perspective of the developer. They are used by the developer to get the items into the buffer at the right location.</li><li>2: The non private methods are the only methods available to the user for manipulating the MinHeap.</li></ul><p><b>Homework problems:</b></p><p>These are the only functions that you need to write. You will, however, need to understand the functions we have provided as some of your functions will call the functions we have provided.</p><ol><li><p>Write a function called siftUp that takes an index and relocates the element up the buffer to its proper spot.<br><code>private def siftUp(index: Int): Unit = ???</code></p></li><li><p>write a function that swaps the elements at the given indexes.<br><code>private def swap(idx1:Int, idx2:Int): Unit = ???</code></p></li><li><p>Write a function called siftDown that takes an index and relocates the element down the buffer to its proper spot.<br><code>private def siftDown(index: Int): Unit = ???</code></p></li></ol></article>

[To Top](https://github.com/Qdog31/CS384/tree/main#instructions-for-cs384-homeworks)


## Homework 8 
In class we discussed two of several possibilities for implementing a <code>Priority Queue / MinHeap / MaxHeap</code>
(<b>Abstract Data Types</b>) e.g., <code>Array</code>, and <code>BinaryTree</code>. In Homework 7 you implemented a MinHeap using an ArrayBuffer. In this homework you will implement a MinHeap using a Tree Data Structure.</p><p>Below is the definition of our MinHeap for Homework 8</p><div class=highlight><pre class=chroma><code class=language-Scala data-lang=Scala><span class=n>enum</span> <span class=nc>MinHeap</span><span class=k>:</span>
    <span class=kt>case</span> <span class=kt>Empty</span>
    <span class=k>case</span> <span class=nc>Node</span><span class=o>(</span><span class=n>item</span><span class=k>:</span> <span class=kt>Int</span><span class=o>,</span> <span class=n>size</span><span class=k>:</span> <span class=kt>Int</span><span class=o>,</span> <span class=n>left</span><span class=k>:</span> <span class=kt>MinHeap</span><span class=o>,</span> <span class=n>right</span><span class=k>:</span> <span class=kt>MinHeap</span><span class=o>)</span>
</code></pre></div><p>We have provided some code for the MinHeap. Before proceeding to write the below functions, make sure you understand the code that was written for you.<br>Please ignore and do not touch the code in your scala file that begins with the following.</p><div class=highlight><pre class=chroma><code class=language-Scala data-lang=Scala> <span class=c1>// DO NOT TOUCH THE CODE BELOW THIS LINE -------------------------- 
</span></code></pre></div><p>You will complete the following methods by filling in code where the <b>???</b> are; just as in all previous homework&rsquo;s.
Insert and deleteMin should be trivial based on the instructions given in class. The merge function is where most fo the work is done. When you perform the merge be sure to follow the rules that we discussed in class.<br>The rules are as follows.<br>When merging two MinHeaps you first compare the root element values of each MinHeap, the root element with the lower value is declared the winner and becomes the base MinHeap.<br>We now need to determine which side of the winning MinHeap to merge the losing MinHeap.<br>The losing MinHeap is always merged to the right side of the winning MinHeap <b>unless</b> the <b>size</b> of the winning MinHeaps left sub-tree is strictly smaller than the
<b>size</b> of the winning MinHeap&rsquo;s right sub-tree.</p><p>You must use <b>Recursion and Pattern Matching</b></p><ol><li><p><code>def insert(elem: Int, h: MinHeap): MinHeap = ???</code></p></li><li><p><code>def merge(h1: MinHeap, h2: MinHeap): MinHeap = ???</code></p></li><li><p><code>def deleteMin(h: MinHeap): MinHeap = ???</code><br>deleting from a MinHeap should throw new NoSuchElementException(&ldquo;deleteMin of empty heap&rdquo;)</p></li></ol></article></main>

[To Top](https://github.com/Qdog31/CS384/tree/main#instructions-for-cs384-homeworks)
