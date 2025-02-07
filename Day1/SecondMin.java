import java.util.Scanner;
public class SecondMin{

public static void main(String[] args)
    {
        int size;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size:");
        size = sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the array:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
       
        int min = first_min(arr); //method call
        int sec_min = sec_min(arr, min);
         System.out.println("Minimum: " + min);
        System.out.println("Second Minimum: " + sec_min);
    }
   
public static int first_min(int[]arr)
{
    int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
}

public static int sec_min(int [] arr, int min)
{
    int secmin = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
           if(secmin >min&&secmin>arr[i]&&arr[i]!=min){
            secmin=arr[i];
            }
        }
        return secmin;
}
}