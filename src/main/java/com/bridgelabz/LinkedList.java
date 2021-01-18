package com.bridgelabz;

public class LinkedList<K>
{
   public INode<K> head;
   public INode<K> tail;
   public int count = 0;

   public LinkedList() {
      this.head = null;
      this.tail = null;
   }

   public void add(INode<K> newNode) {
      count++;
      if (this.tail == null) {
         this.tail = newNode;
      }
      if (this.head == null) {
         this.head = newNode;
      } else {
         INode<K> tempNode = this.head;
         this.head = newNode;
         this.head.setNext(tempNode);

      }
   }

   public void append(INode<K> newNode) {
      count++;
      if (this.tail == null) {
         this.tail = newNode;
      }
      if (this.head == null) {
         this.head = newNode;
      } else {
         this.tail.setNext(newNode);
         this.tail = newNode;
      }
   }

   public void addMiddle(INode<K> newNode) {

      if (this.tail == null) {
         this.tail = newNode;
      }
      if (this.head == null) {
         this.head = newNode;
      } else {
         int mid = (count % 2 == 0) ? (count / 2) : (count / 2 + 1);
         int mid2 = 0;
         INode<K> temp = head;
         INode<K> temp2 = head.getNext();
         while (mid2++ != mid) {
            temp = temp.getNext();
            temp2 = temp2.getNext();
         }
         temp.setNext(newNode);
         newNode.setNext(temp2);
      }
      count++;
   }

   public INode<K> searchNode(K key) {
      if (head == null)
         return null;

      INode<K> tempNode = this.head;
      while (tempNode != null) {
         if (tempNode.getKey().equals(key))
            return tempNode;
         tempNode = tempNode.getNext();
      }
      return null;
   }

   public INode<K> pop() {
      INode<K> tempNode = head;
      head = head.getNext();
      return tempNode;
   }

   public void pop(INode<K> node) {
      INode<K> tempNode = head;
      while (tempNode.getNext() != node) {
         tempNode = tempNode.getNext();
      }
      tempNode.setNext(node.getNext());
   }

   public INode<K> popLast() {
      INode<K> tempNode = head;
      while (!tempNode.getNext().equals(tail)) {
         tempNode = tempNode.getNext();
      }
      tail = tempNode;
      tempNode = tempNode.getNext();
      return tempNode;
   }

   public void printNodes() {
      System.out.println("Printing Node Values :");
      INode<K> tempNode = head;
      while (tempNode != null) {
         System.out.println(tempNode.getKey());
         tempNode = tempNode.getNext();
      }

   }

   @Override
   public String toString() {
      return "linkedListNode { " + head + " }";
   }
}
