import models.Node

object Main extends App {
  var rootNode: Node = Node(7)

  val one: Node = Node(1)

  val zero: Node = Node(0)

  val three: Node = Node(3)

  val two: Node = Node(2)

  val five: Node = Node(5)

  val four: Node = Node(4)

  val six: Node = Node(6)

  val nine: Node = Node(9)

  val eight: Node = Node(8)

  val ten: Node = Node(10)


  rootNode.left = one

  one.left = zero

  one.right = three

  three.left = two

  three.right = five

  five.left = four

  five.right = six

  rootNode.right = nine

  nine.left = eight

  nine.right = ten

  println("This tree is : " + rootNode)

  val treeTraversal: TreeTraversal = new TreeTraversal

  println("In-order")
  treeTraversal.inOrder(rootNode)

  println("pre-order")
  treeTraversal.preOrder(rootNode)

  println("post-order")
  treeTraversal.postOrder(rootNode)
}