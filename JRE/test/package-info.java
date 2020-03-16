package test;

class execptionnum 
{


       static int dividezero(int a,int b)
       {
              int res=a/b;
              return res;
       }

       static  int computedividezero(int a,int b)
       {
              try 
              {
                     int res1=dividezero(a,b);
                     return res1; 
              }
              catch(NumberFormatException ex)
              {
                     System.out.println("Number for");
              }
			return b;
       }


       public static void main(String[] args)
       {
       
              int a=1;
              int b=0;
              try
              {
                     int res2=computedividezero(a,b);

              }
              catch(ArithmeticException ex)
              {
                     System.out.println(ex.getMessage());
}
       }
}

       


