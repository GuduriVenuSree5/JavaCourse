class Ex9{
    public static void main(String[] args) {
        //Jagged Array- Num of columns are not fixed
        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[5];
        arr[2]=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                //random method generates a random value of type double which is < 1
                arr[i][j]= (int)(Math.random() * 10);   //to get single digit we multiply with 10
            }
        }

        for(int n[]: arr){
               for(int m: n)
               {
                System.out.print(m+" ");
               }
               System.out.println();
        }
        
    }
}