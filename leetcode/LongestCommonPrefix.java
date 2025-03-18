public class LongestCommonPrefix 
{
    private static String longestCommonPrefix(String[] words) 
    {
        String prefix = words[0];
        for (String str : words) 
        {
            int temp = 0;
            for (int i = 0; i < str.length(); i++) 
            {
                if(prefix.charAt(i) == str.charAt(i))
                {
                    temp++;
                }
                else
                {
                    if(temp == prefix.length())
                    {
                        break;
                    }
                    else
                    {
                        String tempPrefix = prefix.substring(0, Math.min(temp, prefix.length()));
                        prefix = tempPrefix;
                        break;
                    }
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] words = {"fllllower","fllllow","fllllight"};
        System.out.println(longestCommonPrefix(words));
        }
}
