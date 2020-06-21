/**
 * Created by Taiwo Farinu on 19-Jun-20
 */

package binary_tree;

public class MyBinaryTree {

  MyBinaryNode root;

  public MyBinaryTree() {
    root = null;
  }

  public void insert(int value) {
    MyBinaryNode newNode = new MyBinaryNode(value);
    if (root == null) {
      root = newNode;
      return;
    }

    MyBinaryNode currentNode = root;
    while (true) {
      if (value > currentNode.getValue()) {
        if (currentNode.getRight() == null) {
          currentNode.setRight(newNode);
          return;
        }
        // help us keep moving currentNode pointer
        currentNode = currentNode.getRight();
      } else {
        if (currentNode.getLeft() == null) {
          currentNode.setLeft(newNode);
          return;
        }
        // help us keep moving currentNode pointer
        currentNode = currentNode.getLeft();
      }
    }
  }

  public MyBinaryNode lookup(int value) {
    if (root == null) {
      return null;
    }

    MyBinaryNode currentNode = root;
    while (currentNode != null) {
      if (value > currentNode.getValue()) {
        currentNode = currentNode.getRight();
      } else if (value < currentNode.getValue()) {
        currentNode = currentNode.getLeft();
      } else {
        return currentNode;
      }
    }
    return null;
  }

//  public MyBinaryNode remove(int value) {
//    if(root == null) {
//      return null;
//    }
//
//    MyBinaryNode nodeToRemove = root;
//    MyBinaryNode parentNode = null;
//    while (nodeToRemove.getValue() != value) {
//      if (value < nodeToRemove.getValue()) {
//        nodeToRemove = nodeToRemove.getLeft();
//      } else if (value > nodeToRemove.getValue()) {
//        nodeToRemove = nodeToRemove.getRight();
//      }
//    }
//  }

  int count = 0;
  public void printTree() {
    count = 0;
    printTree(root);
  }

  private void printTree(MyBinaryNode node) {
    System.out.print(node.getValue());
    System.out.println();
    count++;
    if(node.getLeft() != null) {
      System.out.print("\t".repeat(Math.max(0, count)) + "Left: ");
      printTree(node.getLeft());
    }
    if(node.getRight() != null) {
      System.out.print("\t".repeat(Math.max(0, count)) +"Right: ");
      printTree(node.getRight());
    }
    count--;
  }

  public static void main(String[] args) {
    MyBinaryTree binaryTree = new MyBinaryTree();
    binaryTree.insert(9);
    binaryTree.insert(4);
    binaryTree.insert(6);
    binaryTree.insert(20);
    binaryTree.insert(170);
    binaryTree.insert(15);
    binaryTree.insert(1);
    binaryTree.insert(5);
    binaryTree.insert(4);


    binaryTree.printTree();
  }


}
