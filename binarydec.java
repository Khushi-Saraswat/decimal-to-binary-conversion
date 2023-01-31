import java.util.*;
public class binarydec {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number in decimal form.");
        int num=sc.nextInt();
        int size=sc.nextInt();
    
        int a[]=new int[size];
        for(int i=0;num>0;i++)
        {
            a[i]=num%2;
            num=num/2;
        }
        System.out.println("number in binary form is");
        for(int i=0;a[i]<size;i++)
        {
            System.out.println(a[i]);
        }
        
        

    }
}
