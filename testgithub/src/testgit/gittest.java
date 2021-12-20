package testgit;

public class gittest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {55,45,25,88,100};
		int c;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
			   if (a[i]>a[j])                     //11 15 
			   {
				c=a[i];                          //c=15
			    a[i]= a[j];                    //a[0] 11
			    a[j]=c;                                // a[0] 11 a[1] 15
			   }
			
			}
			
			
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println();
		
		System.out.println("Smaller No is: "+a[0]);
		System.out.println("Larger No is: "+a[a.length-1]);
	

	}

}
