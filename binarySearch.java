package Searching;
import java.util.Scanner;
public class binarySearch {
    public static int find(int x, int a[],int n){
        int r=n-1;
        int l=0;
        
        while(l <= r){
            int mid= (l+r)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]>x){
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return -1;
    }
    public static void main(String ar[]){
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of eles:");
        int n= sc.nextInt();
        System.out.println("enter eles in sorted order:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        int x= sc.nextInt();
       
        int c=find(x,a,n);
        System.out.println(c+1);
        sc.close();

    }
}
