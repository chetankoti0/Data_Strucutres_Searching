package Searching;
import java.util.*;
public class linearSearch {
    public static int find(int x,int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                return (i+1);
            }
        }
        return 0;
    }
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("enter number of eles:");
        int n= sc.nextInt();
        System.out.println("enter eles:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        int x= sc.nextInt();
        int c=find(x,a);
        System.out.println(c);
        sc.close();
        
    }
}
