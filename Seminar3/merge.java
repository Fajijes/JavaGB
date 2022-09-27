package Seminar3;


public class merge{
    public static void sort(int[] arr){
        if(arr.length <2) return; 
        int mid = arr.length/2;
        int left[] = new int[mid];
        int right[] = new int[arr.length-mid];
        for(int i=0; i<mid; i++){ 
            left[i] = arr[i];
        }
        for(int i=0; i<arr.length-mid; i++){ 
            right[i] = arr[mid+i];
        }
        sort(left);
        sort(right);
        merge(left, right, arr);
    }
    
    private static void merge(int[] a, int[] b, int[] all){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){ 
            if(a[i] < b[j]){
                all[k] = a[i];
                i++;
            }else{
                all[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){ 
            all[k++] = a[i++];
        }
        while(j<b.length){ 
            all[k++] = b[j++];
        }
    }
    
    public static void main(String[] args){
        int[] a = {20,15,3,48,34,125,1,12,10,4,18};
        sort(a);    
        for(int j=0; j<a.length; j++){
            System.out.print(a[j] + " ");
        }   
     }
    }