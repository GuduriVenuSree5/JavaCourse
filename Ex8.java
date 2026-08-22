class Ex8{
    public static void main(String[] args) {
        //Multi Dimentional Array
        int arr[][]=new int[3][4];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                //random method generates a random value of type double which is < 1
                arr[i][j]= (int)(Math.random() * 10);   //to get single digit we multiply with 10
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // diff types of for loops
        for(int n[]: arr){
               for(int m: n)
               {
                System.out.print(m+" ");
               }
               System.out.println();
        }
        
    }
}