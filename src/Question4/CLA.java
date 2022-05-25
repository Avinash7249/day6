package Question4;

public class CLA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       if(args.length==1) {
    	   int i0 = Integer.parseInt(args[0]); 
           //int i1 = Integer.parseInt(s1);
    	   int f=1;
    	   for(int i=1;i<=i0;i++) {
    		   f=f*i;
    	   }
           System.out.println(f);
       }else if(args.length==2) {
    	   int i0 = Integer.parseInt(args[0]); 
           int i1 = Integer.parseInt(args[1]);
           int sum=Math.abs(i0-i1);
    	   int f=1;
    	   for(int i=1;i<=sum;i++) {
    		   f=f*i;
    	   }
           System.out.println(f);

       }else {
    	   System.out.println("Error");
       }
	}

}
