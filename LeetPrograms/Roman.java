package LeetPrograms;
import java.util.Scanner;
public class Roman {
public static int romanConversion(String romanletter)
	{
	int decimal,n,I,IV,V,IX,X,XL,L,XC,C,CD,D,CM,M;
	decimal=0;
	I=1;
	IV=4;
	V=5;
	IX=9;
	X=10;
	XL=40;
	L=50;
	XC=90;
	C=100;
	CD=400;
	D=500;
	CM=900;
	M=1000;
	n=romanletter.length();
	
	char[] str = new char[n];
	str=romanletter.toCharArray();
	for(int i = n-1;i>=0;i--)
	{
		switch(str[i])
		{
		case 'I':
			decimal=decimal+I;
			break;
		case 'V':
			if((i-1>=0)&&(str[i-1])=='I')
			{
				decimal=decimal+IV;
				i--;
			}
			else
				decimal=decimal+V;
			break;
		case 'X':
			if((i-1>=0)&&(str[i-1])=='I')
			{
				decimal=decimal+IX;
				i--;
			}
			else
				decimal=decimal+X;
			break;
		case 'L':
			if((i-1>=0)&&(str[i-1])=='X')
			{
				decimal=decimal+XL;
				i--;
			}
			else
				decimal=decimal+L;
			break;
		case 'C':
			if((i-1>=0)&&(str[i-1])=='X')
			{
				decimal=decimal+XC;
				i--;
			}
			else
				decimal=decimal+C;
			break;
		case 'D':
			if((i-1>=0)&&(str[i-1])=='C')
			{
				decimal=decimal+CD;
				i--;
			}
			else
				decimal=decimal+D;
			break;
		case 'M':
			if((i-1>=0)&&(str[i-1])=='C')
			{
				decimal=decimal+CM;
				i--;
			}
			else
				decimal=decimal+M;
			break;
		
		}
		
	}	
	return decimal;
	}
public static void main(String args[])
	{
	String romannumber;
	int decimalnumber;
	System.out.println("Enter the roman number");
	Scanner in = new Scanner(System.in);
	romannumber= in.nextLine();
	decimalnumber=romanConversion(romannumber);
	System.out.println("The Roman Number is "+ romannumber);
	System.out.print("The Decimal Number is " + decimalnumber);
	in.close();
	}
}
