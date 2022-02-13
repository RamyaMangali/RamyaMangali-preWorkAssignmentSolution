import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);

public void checkPalindrome() {
	int n,r,sum=0,temp;
	System.out.println("Enter a number to check whether it is palindrome or not : ");
	n=sc.nextInt();
	System.out.println();
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum) {
		System.out.println(temp+" is a palindrome number !!!");
		System.out.println();
	}
	else {
		System.out.println(temp+" is not a palindrome number !!!");
		System.out.println();
	}
}


public void printPattern() {
	int n,i,j;
	System.out.println("Enter a number to print pattern : ");
	n=sc.nextInt();
	System.out.println();
	for(i=n;i>0;i--) {
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();

}

   //function to check no is prime or not

 public void checkPrimeNumber() {
	 int n,i,count=0;
		System.out.println("Enter a number to check whether it is prime or not : ");
		n=sc.nextInt();
		System.out.println();
		for(i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(n+" is a prime number !!!");
			System.out.println();
		}
		else {
			System.out.println(n+" is not a prime number !!!");
			System.out.println();
		}

 }
 
   // function to print Fibonacci Series

   public void printFibonacciSeries() {
	   int n1 = 0, n2 = 1,n,temp;
		System.out.println("Enter a number to upto which we need to print fibonacci numbers : ");
		n=sc.nextInt();
		System.out.println();
		System.out.print(n1+" "+n2);
		for(int i=2;i<n;i++) {
			temp=n1+n2;
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;
		}
		System.out.println();
   }

public static void main(String[] args) {

         Main obj = new Main();

         int choice;

         Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

choice = sc.nextInt();

switch (choice){
case 0 : choice=0;
         break;
case 1 : obj.checkPalindrome();
         break;
case 2 : obj.printPattern();
         break;
case 3 : obj.checkPrimeNumber();
         break;
case 4 : obj.printFibonacciSeries();
         break;
default : System.out.println("Invalid choice. Enter a valid no.\n");

}

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}



}

