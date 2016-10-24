public class Array
{

	public static void main(String args[])
	{
		double[] mylist = {1.9,2.7,3.1,1.1,2.9};
		int i=1;
		double max=1.9;
		double total = 0;

		for(double element : mylist)
		{

			System.out.println(i +". " + element);
			i++;
			total+=element;

		}

		System.out.println("total value after summation of  given value is " +total);

		for(int j=0;j<mylist.length;j++)
		{

			if(mylist[j]>max)
			{
				max=mylist[j];
			}


		}

		System.out.println("Max value among given array value is "+ max);

	}

}
