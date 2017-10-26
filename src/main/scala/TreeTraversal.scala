import models.Node

class TreeTraversal {
  def inOrder(root: Node): Unit = {
    if(root != null){
      inOrder(root.left)
      println(root.i)
      inOrder(root.right)
    }
  }

  def preOrder(root: Node): Unit = {
    if(root != null){
      println(root.i)
      preOrder(root.left)
      preOrder(root.right)
    }
  }

  def postOrder(root: Node): Unit = {
    if(root != null){
      postOrder(root.left)
      postOrder(root.right)
      println(root.i)
    }
  }
}