/**
 * Created by Taiwo Farinu on 16-Jun-20
 */

package my_hash_tables;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable {

    private static class MyNodes extends ArrayList<MyNode> {

    }

    private int length;

    private MyNodes[] data;

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
        int hash = hash(key);
        if (data[hash] == null) {
            data[hash] = new MyNodes();
        }

        for (MyNode myNode : data[hash]) {
            if (myNode.getKey().equals(key)) {
                myNode.setKey(key);
                break;
            }
        }
        data[hash].add(new MyNode(key, value));
    }

    public int get(String key) {
        int hash = hash(key);
        int value = 0;
        if (data[hash] != null) {
            for (MyNode myNode : data[hash]) {
                if (myNode.getKey().equals(key)) {
                    value = myNode.getValue();
                }
            }
        }
        return value;
    }

    public List<String> keySets() {
        List<String> keys = new ArrayList<>();
        for (MyNodes myNodes : data) {
            if (myNodes != null && myNodes.size() != 0) {
                if (data.length > 1) {
                    for (MyNode myNode : myNodes) {
                        keys.add(myNode.getKey());
                    }
                } else {
                    keys.add(myNodes.get(0).getKey());
                }
            }
        }
        return keys;
    }

    public List<String> keySetsNoCollision() {
        List<String> keys = new ArrayList<>();
        if (this.data.length == 0) {
            return null;
        }

        for (int i = 0; i < this.data.length; i++) {
            if (data[i] != null && this.data[i].size() != 0) {
                if (this.data.length > 1) {
                    for (int j = 0; j < this.data[i].size(); j++) {
                        keys.add(data[i].get(j).getKey());
                    }
                } else {
                    keys.add(data[i].get(i).getKey());
                }
            }
        }
        return keys;
    }

    public static void main(String[] args) {

        MyHashTable tables = new MyHashTable(50);
        tables.set("Ayo", 30);
        tables.set("Tola", 10);
        tables.set("Ayo", 90);
        tables.set("Sade", 40);
        tables.set("Tope", 10);
        tables.set("Wale", 20);

        System.out.println(tables.get("Ayo"));

        System.out.println(tables.keySets());

    }
}
