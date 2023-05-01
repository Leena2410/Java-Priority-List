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
public class DoubleLinkedList {
    Node first; 
    Node last;
    int size = 0;
    
    public void firstItem(Node newNode){
        first = newNode;
        last = newNode;
        size++;
    }
    
    public void searchPlace(Node newNode){
        int pro = newNode.priority;
        boolean added = false;
        
        Node temp = first;
        while(temp != null){
            if(temp.priority > pro){
                addBefor(newNode, temp);
                added = true;
                break;
            }
            temp = temp.next;
        }
        if(added == false){
            addLast(newNode);
        }
    }
    
    public void addBefor(Node newNode, Node current){
        if(current == first){
            addFirst(newNode);
        }
        else{
            Node p = current.pre;
            p.next = newNode;
            newNode.pre = p;
            newNode.next = current;
            current.pre = newNode;
            size++;
        }
    }
    
    public void addFirst(Node newNode){
        first.pre = newNode;
        newNode.next = first;
        first = newNode;
        size++;
    }
    
    public void addLast(Node newNode){
        last.next = newNode;
        newNode.pre = last;
        last = newNode;
        size++;
    }
    
    
    
}
