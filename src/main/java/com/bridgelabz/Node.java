package com.bridgelabz;

public class Node<K> implements INode<K>
{
   private INode<K> next;
   private K key;

   public Node(K key) {
      this.key = key;
      this.next = null;
   }

   @Override
   public INode<K> getNext() {
      return next;
   }

   @Override
   public K getKey() {
      return key;
   }

   @Override
   public void setKey(K key) {
      this.key = key;
   }

   @Override
   public void setNext(INode<K> next) {
      this.next = (Node<K>) next;
   }
}
