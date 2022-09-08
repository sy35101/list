import java.util.Scanner;
public class ArrayOperation{
    public int [] ReadArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter "+n+"values");
        for (int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public int[] DispArray(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            System.out.print( " ");

//            if(i< arr.length-1)
//                System.out.print(",");
        }
//        System.out.print();
        System.out.println(arr);
        return arr;
    }
}