package Seminar4;

import java.util.*;
  
public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();

        link.add("Reverse");
        link.add("String");
        link.add("Array");
        
        System.out.print(String.format ("Elements before reversing: " + link + "%n"));
        link = reverse(link);
        System.out.print(String.format ("Elements after reversing: " + link + "%n"));
       
       
    }
  
    public static LinkedList<String> reverse(LinkedList<String> llist)
    {
        LinkedList<String> revLink = new LinkedList<>();
        for (int i = llist.size() - 1; i >= 0; i--) {
  
            revLink.add(llist.get(i));
        }
        return revLink;
    }
}

