//import java.util.Scanner;
//
//public class Array3{
//    public static int getThirdLargest(int[] a, int total){
//        int temp;
//        for (int i = 0; i < total; i++)
//        {
//            for (int j = i + 1; j < total; j++)
//            {
//                if (a[i] > a[j])
//                {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        return a[total-3];
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n=sc.nextInt();
//        System.out.println("enter +" + n +"element" );
//        int arr[] =new int [n];
//        for(int i=0;i< n;i++) {
//             arr[i]=sc.nextInt();
//        }
//        System.out.println("the element are as follows");
//        for(int i=0;i< n;i++)
//        {
//            System.out.println(arr[i]);
//        }
//
//
//
//        System.out.println("Third Largest: "+getThirdLargest(a,6));
//        System.out.println("Third Largest: "+getThirdLargest(b,7));
//    }}
 public class Ram{
    public static void main(String[] args) {
        Overwrite o=new Overwrite();
         o.TakeArray();
    }
}