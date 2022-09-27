package Seminar3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class removeOdd {
    
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();

            while (scanner.hasNextInt()){
                if (n % 2 != 0){
                arrayList.add(scanner.nextInt());
                }
                else scanner.next();
                n++;
            }

            System.out.print(arrayList + " ");

        }
    }
}

