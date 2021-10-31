package com.anhnhh2008110020.tuan08;

public class BinaryTree {
  private  Node root;
 
    
  public BinaryTree(){}

  public void create(){
      Node a1 = new Node(3);
      Node a2 = new Node(4);
      Node a3 = new Node(5);
      Node a4 = new Node(6);
      Node a5 = new Node(7);
      Node a6 = new Node(8);
      Node a7 = new Node(9);

      a4.left = a2;
      a4.right = a6;
      a2.left = a1;
      a2.right = a3;
      a6.left = a5;
      a6.right = a7;

      root = a4;
  }
    
}

