object Main extends App {
  var rootNode: Node = Node(5)

  val secondNode: Node = Node(3)

  rootNode.left = secondNode

  println("This tree is : " + rootNode)
}