package Tasks;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=10;
        arr[1]=30;
        arr[2]=20;
        arr[3]=60;
        arr[4]=50;
        arr[5]=40;
        arr[6]=100;
        arr[7]=70;
        arr[8]=90;
        arr[9]=80;

        int backup=0;
        // Program to sort this array in Ascending
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    backup=arr[i];
                    arr[i]=arr[j];
                    arr[j]= backup;
                }
            }
        }
          

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
