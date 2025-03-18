import java.util.Scanner;
public class two_sum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[100];
        int i=0;
        while(true)
        {
            System.out.println("(digite 0 para parar) proximo numero:");
            int num=sc.nextInt();
            nums[i] = num;
            if(nums[i]==0 || i>100)
            {
                break;
            }
            i++;
        }
        System.out.println("digite o numero target:");
        int target = sc.nextInt();
        int[] result = searchSum(nums, i, target);
        System.out.println("resultados: "+result[0]+" , "+result[1]);
        sc.close();
    }
    static int[] searchSum(int[] nums, int length, int target)
    {
        int[] result = new int[2];
        for(int i=0;i<length;i++)
        {
            int complement = target - nums[i];
            for(int j=0;j<i;j++)
            {
                if(nums[j]==complement && i!=j)
                {
                    result[0]=j;
                    result[1]=i;
                    return result;
                }
            }
        }
        return null;
    }
}
