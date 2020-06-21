/**
 * Created by Taiwo Farinu on 21-Jun-20
 */

package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MyGraph {

  private HashMap<Integer, List<Integer>> adjacentList;

  private int numberOfNodes;

  public MyGraph() {
    adjacentList = new HashMap<>();
    numberOfNodes = 0;
  }

  public void addNode(int node) {
    adjacentList.put(node, new ArrayList<>());
    numberOfNodes++;
  }

  public void addEdge(int node1, int node2) {
    adjacentList.get(node1).add(node2);
    adjacentList.get(node2).add(node1);
  }

//  public void showConnections() {
//    Set<Integer> keys = adjacentList.keySet();
//    for (int node : keys) {
//      List<Integer> nodeConnections = adjacentList.get(node);
//      StringBuilder connections = new StringBuilder();
//      for (int edge : nodeConnections) {
//        connections.append(edge).append(" ");
//      }
//      System.out.println(node + "-->" + connections);
//    }
//  }

  public void showConnections() {
    Set<Integer> keys = adjacentList.keySet();

    for (int node : keys) {

      List<Integer> nodeConnections = adjacentList.get(node);
      StringBuilder connection = new StringBuilder();
      for (int edge : nodeConnections) {
        connection.append(edge).append(" ");
      }
      System.out.println(node + "--->" + connection.toString());
    }
  }

  public int getNumberOfNodes() {
    return numberOfNodes;
  }

  public static void main(String[] args) {
    MyGraph graph = new MyGraph();
    graph.addNode(0);
    graph.addNode(1);
    graph.addNode(2);
    graph.addNode(3);
    graph.addNode(4);
    graph.addNode(5);
    graph.addNode(6);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 4);
    graph.addEdge(3, 4);
    graph.addEdge(4, 5);
    graph.addEdge(5, 6);

    graph.showConnections();
  }


}
