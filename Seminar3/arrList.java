package Seminar3;

import java.io.IOException;
import java.util.ArrayList;

public class arrList {
   
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(-666);
        arrayList.add(300);
        arrayList.add(2000);
        arrayList.add(-1000);
        arrayList.add(500);
        arrayList.add(13);
        arrayList.add(-1);
        arrayList.add(80);
        arrayList.add(60);
        arrayList.add(100);

        int maxNum = arrayList.get(0);
        int minNum = arrayList.get(0);
        int avrgNum = arrayList.get(0);


        for (int i: arrayList) {
            if (i > maxNum)
                maxNum = i;
        }
        
        for (int i : arrayList) {
            if (i < minNum)
                minNum = i;
        }

        avrgNum = (minNum+maxNum)/2;

        System.out.print(String.format("Array is " + arrayList + " %n"));
        System.out.println("Max number = " + maxNum);
        System.out.println("Min number = " + minNum);
        System.out.println("Average number = " +"("+
                            maxNum+" + "+minNum+")/2"+" = "+ avrgNum);
   
    }
   
}
