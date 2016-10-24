public class ArraySort
{

	public static void main(String args[])
	{
		double[] mylist={8.1,2.5,4.2,9.1,15.7};
		double max = mylist[0];
		double Total = 0;
		int i = 1;
		int l = 1;
		double temp = 0;

		System.out.println("Print the given array with numbering:");
		for(double element : mylist)
		{
			System.out.println(i + ". " + element);
			if(element>max)
			{
				max=element;
			}
			i++;
			Total+=element;
		}

		System.out.println("Array after Sorting becomes:- ");

		{		for(int j=0;j<mylist.length;j++)
			{

				if(j<mylist.length-1)
				{
					if(mylist[j]>mylist[j+1])
					{	
						temp=mylist[j];
						mylist[j]=mylist[j+1];
						mylist[j+1]=temp;
					}
				}	

			}
			for(double newelement : mylist)
			{
				System.out.println(l + ". " + newelement);
				l++;
			}

		}
		System.out.println("Max value among given array is " +max);
		System.out.println("Total score of given array is " +Total);
	}

}
