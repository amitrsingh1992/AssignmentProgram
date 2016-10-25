import java.util.Scanner;

public class Anagram
{
public String  removespace(String name )
{
int j=0;
char[] l1;
String S;
l1 = name.toCharArray();
char[] newname;
for(int i=0;i<l1.size;i++)
{
if(l1[i]!=" ")
{

newname[j]=l1[i];
j++;
}
else 
i+c String  removespace(String name )
{
int j=0;
char[] l1;
String S;
l1 = name.toCharArray();
char[] newname;
for(int i=0;i<l1.size;i++)
{
if(l1[i]!=" ")
{

newname[j]=l1[i];
j++;
}
else
i++;

+;

}
S=newname.toString();
return S;
}
public static void main(String[] args)
{

String s1,s2;
Scanner user_input = new Scanner(System.in);

System.out.println("Enter first String:");
s1 = user_input.nextLine();
System.out.println("Enter Second String:");
s2 = user_input.nextLine();
s1 = removespace(s1);
System.out.println("String 1 = " +s1 );
System.out.println("String 2 = " +s2);
/*if(s1.length==s2.length)
{

}*/
}

}
