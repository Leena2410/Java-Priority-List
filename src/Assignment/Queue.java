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
public class Queue {
    DoubleLinkedList L = new DoubleLinkedList();
    
    
    
    public void enqueue(Node newNode){
        if(L.size == 0){
            L.firstItem(newNode);
        }
        else{
            L.searchPlace(newNode);
        }
    }
    
    public void disply(){
        /*
        Node temp = L.first;
        while(temp != null){
            System.out.println(temp.Name + " Priority : " + temp.priority); 
            temp = temp.next;
        }
        System.out.println("=======================");
        */
        while(L.size != 0){
            Node temp = dequeue();
            System.out.println(temp.name + "Priority : " + temp.priority);
        }
    }
    
    public Node dequeue(){
        Node temp = L.first;
        if(L.size > 1){
            L.first = temp.next;
            temp.next.pre = null;
            temp.next = null;
        }
        else{
           L.first = null;
           L.last = null;
        }
        L.size--;
        return temp;
    }
    
}
