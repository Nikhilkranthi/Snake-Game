package alltestfree;
public class AllTestFree {
    public static void main(String []args) throws InterruptedException
     {
        String [][] arr=new String [20][20];
        for(int i=0;i<20;i++)
        {
            for(int j=0;j<20;j++)
            {
                arr[i][j]=" ";
            }
        }
        for(int i=0;i<20;i++)
        {
            arr[i][0]=".";
        }
        for(int i=0;i<20;i++)
        {
            arr[0][i]=".";
        }
        for(int i=1;i<20;i++)
        {
           
            arr[i][19]=".";
        }
        for(int i=1;i<20;i++)
        {
            arr[19][i]=".";
        }
        arr[5][8]="*";
        arr[17][4]="*";
        arr[6][13]="*";
        arr[12][4]="*";
        arr[5][6]="*";
        arr[17][18]="*";
        arr[19][6]="*";
        arr[7][3]="*";
        arr[1][10]="*";
        int temp=1;
        while(true)
        {
            if(temp==16)
                break;
            for(int i=temp;i<5+temp;i++)
            {
                arr[1][i]="~";
            }
            temp++;
        for(int i=0;i<20;i++)
        {
            for(int j=0;j<20;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
         for(int i=1;i<19;i++)
            {
                arr[1][i]=" ";
            }
         Thread.sleep(500);
         System.out.println();
        }
        
        
             }
    
}
