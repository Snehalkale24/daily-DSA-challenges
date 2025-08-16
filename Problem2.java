public class Problem2{
    public static int missing(int no[],int n)
    {
       for(int i=1;i<n;i++)
       {
        int flag=0;
        for(int j=0;j<n-1;j++)
        {
            if(no[j]==i)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        return i;
       } 
       return -1;
    }
    public static void main(String args[])
    {
        int n=5;
        int no[]={1,2,4,5};
        System.out.println("Missing value is:"+missing(no,n));
    }
}