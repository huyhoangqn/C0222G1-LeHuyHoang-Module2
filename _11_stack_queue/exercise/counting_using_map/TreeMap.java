package _11_stack_queue.counting_using_map;

import java.util.Map;

public class TreeMap {
    public void treeMap(String string) {
        Map<String, Integer> element = new java.util.TreeMap<>();
        String charString;
        for (int i = 0; i < string.length(); i++) {
            charString = Character.toString(string.charAt(i)).toUpperCase();
            if (!element.containsKey(charString)) { // element not contain character
                element.put(charString, 1);
            } else {
                int charValue = element.get(charString) + 1;
                element.put(charString, charValue);
            }
        }

        System.out.println("Count character in a string: ");
        for (Map.Entry item : element.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}
