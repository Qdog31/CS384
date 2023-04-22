object ice:
  var lol: List[List[Int]] = List(List(1,2,3),List(4,5,6),List(7,8,9))
  var newLol: List[Int] = flatten2(lol)
  for x <- newLol do 
    println(x)

  def flatten2(lol: List[List[Int]]): List[Int] = 
    if lol.isEmpty then List[Int]()

    if lol.tail.isEmpty then lol.head

    else 
      lol.head.head :: flatten2(lol.tail) 
  

  @main def run: Unit = {}
    