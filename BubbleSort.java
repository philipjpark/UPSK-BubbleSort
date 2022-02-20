class BubbleSort
{
    void bubble(int arr[])
    {
    int num = arr.length;
        for (int i = 0; i < num-1; i++)
            for (int j = 0; j < num-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
  
  
    void printArray(int arr[])
    {
        int num = arr.length;
        for (int i=0; i<num; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    public static void main(String args[])
    {
        BubbleSort example = new BubbleSort();
        int arr[] = {100, 34, 57, 135, 443};
        example.bubble(arr);
        System.out.println("The array is sorted: ");
        example.printArray(arr);
    }
}