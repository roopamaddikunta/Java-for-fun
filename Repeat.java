
//Take two long values , if the first long has three repeating values and the second long has the same repeating values but one less than the first then print one



package com.enterprise.problems;


public class Repeat {

public static void main(String args[]){
Repeat r = new Repeat();
	r.repeat(144256l, 1444526l);
}
	
	public int repeat(long b , long a){
		
		 int count=1;
		 int count1=0;
		 char s = 0;
		 char s1 = 0;
		 int result = 0;
		 
		 //to change long into String and that String into an array of characters
		
		String adigit = String.valueOf(a);
		char ad[] = adigit.toCharArray() ;
		
		String bdigit = String.valueOf(b);
		char bd[] = bdigit.toCharArray() ;
        
		
		//to see repeating element as well as how many times it has repeated

		    for (int i = 1; i < ad.length; i++)
		    {
		    	
		    	 if (i < ad.length-1){
		        if (ad[i] == ad[i+1])
		        {
		        	count++;
//		        	System.out.println(ad[i]);
		        	s = ad[i];
		        	
		        }
		        	
				}
		    }
		
		        System.out.println("count of long a :"+count);
		        System.out.println("the value of the repeated element is s  : "+s);
		        
		        
		        for (int z = 1; z < bd.length; z++)
			    {
			    	
			    	 if (z < bd.length-1){
			        
		        if(bd[z]==bd[z+1]){
		        	
                        count1++;
		        	if(bd[z+1]==bd[z+2] ){
		        		count1++;
		        }
		        	
					
//		        	System.out.println(ad[i]);
		        	s1 = bd[z];
		        }
		        	
		        }
 
	
	}
		        System.out.println("count1 -- count of long b :  "+count1);
		        System.out.println("the value of the repeated element is s1: "+s1);
		        
		        if(s==s1 && count1==count+1 ){
		        	result = 1;
		        }
				return result;
}
}

	

	

