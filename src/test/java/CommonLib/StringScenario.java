package CommonLib;

public class StringScenario {

	public static void main (String [] args) {

		//use of Char 
		//		String x="Hello India and World";
		//		char c =x.charAt(6);
		//		System.out.println(c);

		//***********************************************************************
		//		Use Of Compare
		//***********************************************************************	
		//		String x="Hello";
		//		int c = x.compareTo("Hello");
		//		System.out.println(c);
		//	}

		//***********************************************************************
		//	Use Of Concate
		//***********************************************************************	
		//	String x="Hello India and World";
		//	x=x.concat(":Sandeep:");
		//	System.out.println(x);

		//		String x="Hello India and World";
		//		x=x+": Sandeep";
		//		System.out.println(x);


		//***********************************************************************
		//		Use Of contains
		//***********************************************************************	
		//		String x="Hello India and World";
		//		boolean b = x.contains("dia");
		//		System.out.println(b);

		//***********************************************************************
		//		Use Of contantequals
		//***********************************************************************	
		//		String x="Hello India and World";
		//		boolean c =x.contentEquals("Hello India and World");
		//		System.out.println(c);

		//***********************************************************************
		//		Use Of compareTo 
		//***********************************************************************	
		//		String x="Hello India and World";
		//        int c = x.compareTo("Hello india and World");
		//        System.out.println(c);

		//***********************************************************************
		//		Use Of 
		//***********************************************************************	
		//		String x="Hello India and World";
		//		int c = x.compareToIgnoreCase("Hgllo India and World");
		//		System.out.println(c);


		//***********************************************************************
		//				Use Of EndsWith
		//***********************************************************************	
		//		String x="Hello India and World";
		//		boolean v=x.endsWith("World");
		//		System.out.println(v);	

		//***********************************************************************
		//		Use Of StartsWith
		//***********************************************************************	
		//String x="Hello India and World";
		//boolean v=x.startsWith("Hello");
		//System.out.println(v);	
		//		
		//		String x="Hello India and World";
		//		boolean v=x.startsWith("Ind", 6);
		//	    System.out.println(v);
		//***********************************************************************
		//		Use Of Febonacci sceries 0 1 2 3 4 5 6 7 8 9 10 == 1 2 3 5 8 13 21 34 55
		//***********************************************************************	   

		//		int n1=0,n2=1,n3;
		//		System.out.println(n1+" "+n2);
		//		for (int i=1; i<=10;i++) {
		//
		//			n3=n1+n2;
		//			System.out.println(" "+n3);
		//			n1=n2;
		//			n2=n3;
		//			System.out.print("");
		//		}
		//					int a=0,b=1,n3;
		//					System.out.println(a+"  "+b);
		//					for(int i=1;i<20;i++)
		//					{
		//						n3=a+b;
		//					System.out.println("  "+n3);
		//					a=b;
		//					b=n3;
		//					
		//					}

		//***********************************************************************
		//Use Of Prime number
		//***********************************************************************	
		//					int n=11;
		//					int i,m=0,flag=0;      
		//					m=n/2;      
		//					if(n==0||n==1){  
		//						System.out.println(n+" is not prime number");      
		//					}else{  
		//						for(i=2;i<=m;i++){  
		//							double d=n%i;
		//							if(n%i==0){      
		//								System.out.println(n+" is not prime number");      
		//								flag=1;      
		//								break;      
		//							}      
		//						}      
		//						if(flag==0)  { 
		//							System.out.println(n+" is prime number"); 
		//						}  
		//					}//end of else  
//		for (int j=2;j<=10;j++) {
//			int c=j%2;
//			if (c==0) {
//				System.out.println(j+" is not prime number");  
//			}else {
//				System.out.println(j+" is prime number");  
//			}
//		}
	
		
		// Reverse String 
//1=		
//		String x="Hello India and world";
//		StringBuffer x1=new StringBuffer(x).reverse();
//		System.out.println(x1.toString());
		
//		// Reverse String ---- Without using StringBuffer
//		String x="Hello India and world";
//		String m="";
//		for (int i=x.length();i>=1;i--) {
//			String z=x.substring(i-1, i);
//			m=m+z;
//			
//		}
//		System.out.println(m);


		
//		// Reverse String ---- Without using StringBuffer and reverse loop
//		String x="Hello India and world";
//		String m="";
//		for (int i=1;i<=x.length();i++) {
//			String z=x.substring(x.length()-i, x.length()-(i-1)); //20::21,19::20,18::19
//			m=m+z;
//			
//		}
//		System.out.println(m);
		
	














		}













	}

