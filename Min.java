import java.util.Scanner;
class Min {
    public static void main(String args[] ) throws Exception {
//         int n,num,i;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size");
//         n=sc.nextInt();
//         int min=0;
//
//    for(i=0;i<n;i++)
//    
//    {
//    	System.out.println("Enter elment");
//        num=sc.nextInt();
//        if(min<num)
//        {
//            min=num;
//        }
//        
//    }
//    System.out.println("Minimum num = "+min);
    	
    	
//    	int n,num;
//    	Scanner sc = new Scanner(System.in);
//      System.out.println("Enter size");
//      n=sc.nextInt();
//      int [] arr = new int [n];
//      for (int i=0; i<n; i++)
//      {
//    	  arr[i] = sc.nextInt();
//      }
////      System.out.println(arr[0]);
//     int min =arr[0];
//      for (int  i=0; i<n; i++)
//      {
//    	  System.out.println(arr[i]);
//    	  if(min>arr[i])
//    	  {
//    		  min = i;
//    	  }
//      }
//      System.out.println("minimun  = "+min);
      
    	
//    	------------------------------------------------------------------------
    	
    	int num;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter num =");
    	num = sc.nextInt();
//    	123
    	System.out.println("reminder="+num%10);
    	System.out.println("divide= "+14/10);
    	int rem;
    	int res =0;
    	while(num!=0)
    	{
    		rem =num%10;   //5//4
    		res= res*10+rem;   //5//54
    		num=num/10;    //14
    	}
    	
    	System.out.println(res);
    	
    }   
}   