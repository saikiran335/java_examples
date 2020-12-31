public class thirdlargest
{
public static void main(String[] args)
{
int arr[]=new int[]{22,44,11,33,77,66,};
int i,j,temp;
for(i=0;i<arr.length;i++)
{
for(j=i+1;j<arr.length;j++)
{
if(arr[i]<arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println(arr[2]);
}
}