import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int[] numbers={1,2,3};
	int smallest=Integer.MAX_VALUE;
	for(int i=0;i<numbers.length;i++)
	{
		if(smallest>numbers[i])
		{
			smallest=numbers[i];
			}
		}
	
		System.out.println("smallest numbers in array is:" +smallest);
		
	}
	
	}
