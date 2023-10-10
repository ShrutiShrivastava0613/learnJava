import java.util.*;
import java.lang.Math;
class PrimeGenerator{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Give upper bound of range :");
      int n=sc.nextInt();
      System.out.print("Prime numbers in given range : ");
      for(int i=2;i<=n;i++){
        int count=0;
        for(int j=2;j<=(int)Math.sqrt(i);j++){
          if(i%j==0)
            count++;
        }
        if(count==0)
          System.out.print(i+" ");
      }
    }
}
          
