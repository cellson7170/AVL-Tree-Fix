//HEADER
//Program Name: AVL Tree
//Author: Chris Ellson (but actually Andrew Burke)
//Class: CS260 Fall 2019
//Date: 11/21/19
//Description: This is an implementation of an AVL tree that I was
//			   supposed to fix, but couldn't quite get there.

package edu.cgcc.cs260;

public class Main {

	public static void main(String[] args) {
		AVLTree avl = new AVLTree();
		//create tree
		for(int i = 1; i <= 10; i++) {
			avl.insert(i);
		}
		avl.preOrder();
		System.out.println();
		avl.printBalance();
		
		//duplicate insert
		System.out.println();
		avl.insert(1);
		System.out.println();
		
		//delete person
		System.out.println();
		avl.delete(1);
		System.out.println();
		avl.preOrder();
		
		//print balance
		System.out.println();
		avl.printBalance();
	}
	
}

// FOOTER
//
//Person 1 inserted successfully.
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//Person 2 inserted successfully.
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//Person 3 inserted successfully.
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//Person 4 inserted successfully.
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//Person 5 inserted successfully.
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//Person 6 inserted successfully.
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//Person 7 inserted successfully.
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//Person 8 inserted successfully.
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//Person 9 inserted successfully.
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.insertNode(AVLTree.java:56)
//	at edu.cgcc.cs260.AVLTree.insert(AVLTree.java:340)
//	at edu.cgcc.cs260.Main.main(Main.java:9)
//Person 10 inserted successfully.
//(4)James Brown (2)Virginia Robinson (1)George Green (3)Charles Martin (8)Virginia Brown (6)John Johnson (5)James Brown (7)George Alpin (9)Charles Johnson (10)John Johnson 
//0 0 0 1 0 0 0 0 1 0 
//Person 1 already exists.
//
//
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.deleteNode(AVLTree.java:86)
//	at edu.cgcc.cs260.AVLTree.delete(AVLTree.java:375)
//	at edu.cgcc.cs260.Main.main(Main.java:22)
//java.lang.NullPointerException
//	at edu.cgcc.cs260.AVLTree.setBalance(AVLTree.java:233)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:117)
//	at edu.cgcc.cs260.AVLTree.rebalance(AVLTree.java:136)
//	at edu.cgcc.cs260.AVLTree.deleteNode(AVLTree.java:86)
//	at edu.cgcc.cs260.AVLTree.delete(AVLTree.java:375)
//	at edu.cgcc.cs260.Main.main(Main.java:22)
//Person 1 has been deleted
//
//(4)James Brown (2)Virginia Robinson (3)Charles Martin (8)Virginia Brown (6)John Johnson (5)James Brown (7)George Alpin (9)Charles Johnson (10)John Johnson 
//1 0 1 0 0 0 0 1 0 