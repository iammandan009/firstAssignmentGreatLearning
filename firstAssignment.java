package myFirstJavaProject;

import java.util.Scanner;

public class firstAssignment 
{

	public static void main(String[] args) 
	   { 
		
	   Scanner userInput = new Scanner(System.in);
	   
	   
	   compute obj = new compute();
	   
	   
      
		   
		   
						   System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
				
						   + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
				
						   + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
				
						   System.out.println();
						   
						   int choice = userInput.nextInt();
						   
						   
						   do
						   {
						   
						   
								   switch (choice)
								   
								   {
								   
								   case 0: break; 
								   case 1: {obj.checkPalindrome();}break;
								   case 2: {obj.printStarsDecreasing();}break;
								   case 3: {obj.checkPrimeNumber();}break;
								   case 4: {obj.printFibonacciNumbers();break;}
								   
								    
								  
						    
						           }
		   
		   
		   
		   
	                      }while( choice !=0);
						   
						   
						
	   
	  
	   
	    }

}


 class compute 
 
 {
	 
	 
	 
	 public void checkPalindrome()
	 
	 {
		 
		 int r=0;
		 int sum=0;
		 int temp = 0;
		 
		        Scanner userSecondInput = new Scanner(System.in); 
				  
					System.out.println("Please enter the number");
					 
					 int number = userSecondInput.nextInt();
					 
					 temp=number;
					 
					 do 
						 
					    {
						 
						 r=number%10;
						 sum= (sum*10)+r;
						 number= number/10;		 
						 
					    } while (number>0);
					 
					 
				   
		 
		 if(temp==sum)
		    	System.out.println("Yes, this is a Palindrome number");
		    else 
		    	System.out.println("No, this is not a palindrome number"); 
		 
		
		   
		 
		}
	 
	 public void checkPrimeNumber()
	 
	   {
		 
		 Scanner userSecondInput = new Scanner(System.in); 
		  
			System.out.println("Please enter the number");
			 int number = userSecondInput.nextInt();
			 
             boolean flag = false;
             
             int i=2;
             
             do
            	 
             {
            	 
            	 if(number%i==0)
            	 {
          
            		 flag= true;
            		 break;
            		 
            	 }
            	 
            	 ++i;
            	 
            	 
            	 
             }while (i<=number/2);
			 
             if(!flag)
             
            	 System.out.println("This is a prime number");
            	 
             
             else  System.out.println("This is not a prime number");
             
			
			
		 
		 
	   }
	 
	 public void printFibonacciNumbers()
	 
	   {
	 
		 Scanner userSecondInput = new Scanner(System.in); 
		  
			System.out.println("Please enter the number");
			 
			 int number = userSecondInput.nextInt();
			 
			 int f1 = 0, f2 = 1, i;
			 
		        if (number < 1)
		            return;
		        
		        System.out.print(f1 + " ");
		        
		        for (i = 1; i < number; i++)
		        {
		            System.out.println(f2 + " ");
		            int next = f1 + f2;
		            f1 = f2;
		            f2 = next;
		        }
	  
	   }     
	 
	 
	public void printStarsDecreasing()
	
	{
		
		 Scanner userSecondInput = new Scanner(System.in); 
		  
			System.out.println("Please enter the number");
			 
			 int number = userSecondInput.nextInt();
			 
			 int rows= number;      
			//inner loop  
			for (int i= rows-1; i>=0 ; i--)  
			{  
			//outer loop  
			for (int j=0; j<=i; j++)  
			{  
			//prints star and space  
			System.out.print("*" + " ");  
			}  
			//throws the cursor in the next line after printing each line  
			System.out.println();  
			}  
		
	}
	  
	  
	}