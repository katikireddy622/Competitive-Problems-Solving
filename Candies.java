package info.katikireddy622.problems;



public class Solution
{
	public static void main(String[] args) {
	    int sum=0,sum1=0,sum2=0,count=1,k=0;
	 int T[]={1,2,2,3,4,5};
     int a[]=new int[T.length];
     int u[]=new int[T.length];
     
     for(int i=0;i<T.length;i++)
     {
         
     
        if(u[i]==0)
        {
            for(int j=i+1;j<T.length;j++)
            {
                if(T[i]==T[j])
                {
                    count++;
                    u[j]=1;
                }
            }
            a[k]=count;
            sum=sum+count;
            count=1;
            k++;
                    
        }
        
     }  
     System.out.println(sum);
     
    for(int i=0;i<k;i++)
       {
           if(a[i]>=(sum/2))
           { System.out.println(k);
               i= k;
           }
            if(a[i]>1)
               {
                   sum1=sum1+a[i]-1;
                   sum2=sum2+1;
               }
               else
               sum2=sum2+1;
               if(sum2==(sum/2))
                 { System.out.println(sum2);
               i= k;
           }
           
       }
       
		System.out.println(sum2);
	}
}
