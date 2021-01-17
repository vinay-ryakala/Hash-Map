package com.bridgelabz;

public class MapNode<K, V> implements INode<K>
{
   K key;
   V value;
   MapNode<K, V> next;

   public MapNode(K key, V value) {
      this.key = key;
      this.value = value;
      this.next = null;
   }


   public K getKey() {
      return key;
   }


   public void setKey(K key) {
      this.key = key;
   }

   public INode<K> getNext() {
      return  next;
   }

   public void setNext(INode<K> next) {
      this.next = (MapNode<K, V>) next;

   }
   public V getValue() {
      return value;
   }
   public void setValue(V value) {
      this.value = value;
   }

   public String toString() {
      StringBuilder myMapNodeString = new StringBuilder();
      myMapNodeString.append("MapNode{ K=").append(key)
              .append(" V=").append(value).append('}');
      if(next != null)
         myMapNodeString.append("->").append(next);
      return myMapNodeString.toString();
   }
}
