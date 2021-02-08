//package com.tasks3.linkedlist;
package com.koropets;
class Node {
    private Node next;
    private Integer data;

    public Node(int a) {
        data = new Integer(a);
    }

    public Node getNext(){
        return next;
    }

    public void setNext (Node next){
        this.next = next;
    }

    public Integer getData(){
        return data;
    }

    public void setData (Integer data){
        this.data = data;
    }

}

class LinkedList {
    private Node first;
    private Node last;

    public LinkedList(){
        first = null;
        last = null;
    }

    public void add (Integer data){
        Node list = new Node(data);
        if (first == null){
            first = list;
            last = list;
        }
        else {
            last.setNext(list) ; //		==	last.next = list
            last = list;
        }
    }

    public void print (){
        Node cur = first;
        while (cur != null){
            System.out.println(" " + cur.getData());
            cur = cur.getNext();
        }
    }

    public Integer get (int index){
        Node cur = first;
        int i = 0;
        while (i != index){
            cur = cur.getNext();
            i++;
        }
        System.out.printf("element № %d - %d %n" ,i , cur.getData());
        return cur.getData();
    }

    public boolean delete (int index){

        if (index < size()){

        Node cur = first;
        Node prev = first;
        int i = 0;
        while (i != index && i<=index){
            prev = cur;
            cur = cur.getNext();
            i++;
        }
        if (i == 0){
            first = first.getNext();
        }

        else {
            prev.setNext(cur.getNext()) ;
        }

        System.out.println("i have deleted the index  " + index);

            return true;}

 else        {
            return false;
        }
    }

    public int size (){
        Node cur = first;
        int i = 0;
        while (cur != null){
            cur = cur.getNext();
            i++;
        }
        System.out.println("size =  " + i);
        return i;
    }
}

public class List
{
    public static void main (String[] args){
        LinkedList list = new LinkedList ();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.print();
        list.size();
        list.get(1);
        list.delete(7);
        list.print();
        list.delete(3);
        list.print();
    }
}
