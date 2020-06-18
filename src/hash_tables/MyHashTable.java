/**
 * Created by Taiwo Farinu on 15-Jun-20
 */

package hash_tables;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable {

    private static class MyNodes extends ArrayList<MyNode> {

    }

    // properties
    private final int length;
    private MyNodes[] data;

    // initialization of properties through the constructor
    public MyHashTable(int size) {
        length = size;
        data = new MyNodes[length];
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % length;
        }
        return hash;
    }

    public void set(String key, int value) {

        int hash = this.hash(key);
        if (data[hash] == null) {
            data[hash] = new MyNodes();
        }
        data[hash].add(new MyNode(key, value));

        for (MyNode node : data[hash]) {
            if (node.getKey().equals(key)) {
                node.setValue(value);
            }
        }

    }

    public int get(String key) {
        int hash = this.hash(key);
        if (data[hash] == null) {
            return 0;
        }
        for (MyNode node : data[hash]) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return 0;
    }

    public List<String> keySets() {
        List<String> keys = new ArrayList<>();
        for (MyNodes myNodes : data) {
            if (myNodes != null) {
                for (MyNode myNode : myNodes) {
                    keys.add(myNode.getKey());
                }
            }
        }
        return keys;
    }

    public List<Integer> valueSets() {
        List<Integer> values = new ArrayList<>();
        for (MyNodes myNodes : data) {
            if (myNodes != null) {
                for (MyNode myNode : myNodes) {
                    values.add(myNode.getValue());
                }
            }
        }
        return values;
    }

    public static void main(String[] args) {

        MyHashTable hashTable = new MyHashTable(10);
        hashTable.set("Ade", 20);
        hashTable.set("Ade", 30);
        hashTable.set("Kola", 10);
        hashTable.set("Sola", 30);
        hashTable.set("tyuola", 30);
        hashTable.set("Sola", 40);
        hashTable.set("Sola", 40);
        hashTable.set("Goke", 40);
        hashTable.set("Sola", 40);
        hashTable.set("Sola", 40);
        hashTable.set("Sola", 40);

        System.out.println(hashTable.get("Sola"));

        System.out.println(hashTable.keySets());
        System.out.println(hashTable.valueSets());

    }


}
