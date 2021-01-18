package com.bridgelabz;

public class HashMap<K, V> {
   LinkedList<K> linkedList;
   public HashMap() {
      this.linkedList = new LinkedList<>();
   }

   public V get(K key) {
      MapNode<K, V> mapNode =  (MapNode<K, V>) this.linkedList.searchNode(key);
      return (mapNode == null) ? null : mapNode.getValue();
   }

   public void add(K key, V value) {
      MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.searchNode(key);
      if (mapNode == null) {
         mapNode = new MapNode<>(key, value);
         linkedList.append(mapNode);
      } else {
         mapNode.setValue(value);
      }
   }


   @Override
   public String toString() {
      return "HashMapNodes{ " + linkedList + "}";
   }
}
