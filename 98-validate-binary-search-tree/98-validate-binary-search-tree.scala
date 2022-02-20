/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    
  def highestValue(root: TreeNode): Int =
    {
      if(root.right != null)
         highestValue(root.right)
      else root.value
    }
    def lowestValue(root: TreeNode) : Int =
      {
        if(root.left != null)
          lowestValue(root.left)
        else root.value
      }
    def isValidBST(root: TreeNode): Boolean = 
    {
    var left = true;
    var right = true;
    if(root.left != null)
      {
        left = isValidBST(root.left)
        var high = highestValue(root.left)
        left = left && (root.value > root.left.value) && (root.value > high)
      }
    if(root.right != null)
    {
      right = isValidBST(root.right)
      var low = lowestValue(root.right)
      right = right && (root.value < root.right.value) && (root.value < low)
    }
    left && right
    }
}