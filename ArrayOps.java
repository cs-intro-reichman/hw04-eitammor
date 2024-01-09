public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {1, 1, 500}));
    }
    
    public static int findMissingInt (int [] array) {
        boolean isThere = true;
        int missingNum = 1;
        int i = 0;
        if (array.length!=1)
        {
            while ((i < array.length))
            {
                for (int j = 0; j< array.length; j++)
                {
                    if (i == array[j])
                    {
                        isThere = true;
                        break;
                    }
                    else
                    {
                        isThere = false;
                    }
                }
                if(!isThere)
                {
                    missingNum = i;
                    break;
                }
                i++;
            }
        }

        return missingNum;
    }

    public static int secondMaxValue(int [] array) {
        boolean twoMax = false;
        int max = array[0];
        int max2 = array[0];
        for(int j =0; j< array.length; j++)
        {
            if (array[j]>max)
            {
                max = array[j];
            }
            if (max == array[j])
            {
                twoMax = true;
            }
        }
        if (!twoMax)
        {
            for (int i = 0; i<array.length; i++)
            {
                if ((max2 < array[i])&&(max > array [i]))
                {
                    max2 = array[i];
                }
            }
        return max2;
        }

        return max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i < array1.length; i++)
        {
            if(!isContain(array2, array1[i]))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean up = true;
        boolean sorted = true;
        if(array[0] > array [1])
        {
            up = false;
        }
        for (int i = 0; i < array.length-1; i++)
        {
            if (up)
            {
                if (array[i] > array[i+1])
                {
                    sorted = false;
                }
            }
            else
            {
                if (array[i] < array[i+1])
                {
                    sorted = false;
                } 
            }
        }
        return sorted;
    }

    public static boolean isContain(int [] arr, int num)
    {
        boolean isThere = false;
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] == num)
            {
                isThere = true;
                break;
            }
        }
        return isThere;
    }

}