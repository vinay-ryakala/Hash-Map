package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HashMapTest{

   @Test
   public void givenSentenceReturnFrequency() {
      String sentence = "To be or not to be";
      HashMap<String, Integer> hashMap = new HashMap<>();
      String[] words = sentence.toLowerCase().split(" ");
      for(String word : words) {
         Integer value = hashMap.get(word);
         if(value == null) value = 1;
         else value = value + 1;
         hashMap.add(word, value);
      }
      int frequency = hashMap.get("to");
      System.out.println(hashMap);
      Assert.assertEquals(2, frequency);
   }
   @Test
   public void givenParagraphReturnFrequency() {
      String sentence = "Paranoids are not paranoid because "
              + "they are paranoid but because they keep putting themselves deliberately into "
              + "paranoid avoidable situations";
      LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
      String[] words = sentence.toLowerCase().split(" ");
      for(String word : words) {
         Integer value = linkedHashMap.get(word);
         if(value == null) value = 1;
         else value = value + 1;
         linkedHashMap.add(word, value);
      }
      int frequency = linkedHashMap.get("paranoid");
      System.out.println(linkedHashMap);
      Assert.assertEquals(3, frequency);
   }
}
