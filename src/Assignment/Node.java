/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author ST
 */
public class Node {
    String name;
    int priority = 1;
    Node next;
    Node pre;

    public Node(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    
    
}
