package com.bridgelabz;

import java.util.ArrayList;

public class LinkedHashMap<K, V> {
   private final int numBuckets;
   ArrayList<LinkedList<K>> myBucketArray;

   public LinkedHashMap() {
      this.numBuckets = 10;
      this.myBucketArray = new ArrayList<>(numBuckets);
      for (int i = 0; i < numBuckets; i++)
         this.myBucketArray.add(null);
   }

   public V get(K key) {
      int index = this.getBucketIndex(key);
      LinkedList<K> linkedList = this.myBucketArray.get(index);
      if (linkedList == null)
         return null;
      MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.searchNode(key);
      return (mapNode == null) ? null : mapNode.getValue();
   }

   private int getBucketIndex(K key) {
      int hashCode = Math.abs(key.hashCode());
      int index = hashCode % numBuckets;
      System.out.println("Key: " + key + " hashcode: " + hashCode + " index: " + index);
      return index;
   }

   public void add(K key, V value) {
      int index = this.getBucketIndex(key);
      LinkedList<K> linkedList = this.myBucketArray.get(index);
      if (linkedList == null) {
         linkedList = new LinkedList<>();
         this.myBucketArray.set(index, linkedList);
      }
      MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.searchNode(key);
      if (mapNode == null) {
         mapNode = new MapNode<>(key, value);
         linkedList.append(mapNode);
      } else {
         mapNode.setValue(value);
      }
   }
   public void remove(K key) {
      int index = this.getBucketIndex(key);
      LinkedList<K> linkedList = this.myBucketArray.get(index);
      INode<K> tempNode = linkedList.searchNode(key);
      linkedList.pop(tempNode);
   }
   @Override
   public String toString() {
      return "LinkedHashMap List { " + myBucketArray + " }";

   }

}