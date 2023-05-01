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
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node n1 = new Node("Node 1", 1);
        Node n2 = new Node("Node 2" , 2);
        Node n3 = new Node("Node 3", 3);
        Node n4 = new Node("Node 4" , 4);
        Node n21 = new Node("Node 2.1", 2);
        Node n5 = new Node("Node 5", 5);
        Queue Q = new Queue();
        
        
        
        Q.enqueue(n1);
        Q.enqueue(n3);
        Q.enqueue(n2);
        
        Q.enqueue(n4);
        Q.enqueue(n21);
        Q.enqueue(n5);
        
        Node d = Q.dequeue();
        System.out.println(d.name);
        d = Q.dequeue();
        System.out.println(d.name);
        d = Q.dequeue();
        System.out.println(d.name);
        
        System.out.println("==========================");
        
        /*
        Q.enqueue(n2);
        Q.disply();
        
        Q.enqueue(n4);
        Q.disply();
        */
        
    }
    
    
    
}
