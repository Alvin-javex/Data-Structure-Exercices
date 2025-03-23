public class RecursivelyAlgorithm 
{
    public static void main(String [] args)
    {
        char  [] array = {'1','3','5','3','1'};
        int [] values = {1,3,5,3,1};

        System.out.println(charMethod(array,array.length -1));
        System.out.println(integerMethod(values,values.length -1));

    }
    /**
     * @para 
     * @return number
     */
    public static int charMethod(char  [] num,int index )
    {
        if(index < 0  )
        {
            return 0;
        }

        return charMethod(num, index-1) *10 + (num [index] - '0');
        
        


    }
    



    public static int integerMethod(int [] value,int index )
{
    if(index < 0  )
    {
        return 0;
    }

    return integerMethod(value, index-1) *10 + (value[index]);

    
    }

}