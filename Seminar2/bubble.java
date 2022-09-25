package Seminar2;


import java.util.Arrays;
import java.util.logging.*;
import java.io.*;
import java.util.logging.Logger;

public class bubble {
    public static void bubbleSort(int[] arr) throws IOException {
        Logger logger = Logger.getLogger(bubble.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("Seminar2/log.txt") ;
        logger.addHandler(fh);
        SimpleFormatter sFormatter= new SimpleFormatter();
        fh.setFormatter(sFormatter);
        logger.log(Level.INFO, String.format("Code start %n" ));
        
        for (int i = arr.length-1; i >0  ; i--) {
            for (int j = 0 ; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    System.out.println(Arrays.toString(arr) + " => ");
                    try {
                        logger.log(Level.INFO, String.format("Next iteration %n" +  Arrays.toString(arr)+ "%n" ));
                
                    } catch (Exception e) {}
                }
            }            
        }    
        logger.log(Level.OFF,String.format("Code finish %n" ));    
    }
    public static void main(String[] args) throws IOException {
        int[][] data = {
                { 29, 14, 56, 31, 25, 77, 85, 96, 13 },
        };
        for (int[] arr : data) {
            System.out.println(Arrays.toString(arr) + " => ");
            bubble.bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }    
}

  
