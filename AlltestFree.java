package alltestfree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AllTestFree 
{
    public static void main(String []args) throws InterruptedException, IOException
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
        int d=0;
        int len=1;
        int bre=1;
        while(true)
        {
            if(temp==16)
                break;
            if(d==0)
            {
            for(int i=temp;i<5+temp;i++)
            {
                arr[len][i]="~";
                bre=i;
                
            }
            }
            if(d==1)
            {
               for(int i=temp;i<5+temp;i++)
                {
                    arr[i][bre]="~";
                    len=i;
                } 
            }
//            if(d==3)
//            {
//               for(int i=temp;i<5+temp;i++)
//                {
//                    arr[i][bre]="~";
//                    len=i;
//                } 
//            }
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
                for(int j=1;j<19;j++)
                {
                     arr[i][j]=" ";
                     arr[5][8]="*";
                     arr[17][4]="*";
                     arr[6][13]="*";
                     arr[12][4]="*";
                     arr[5][6]="*";
                     arr[17][18]="*";
                     arr[19][6]="*";
                     arr[7][3]="*";
                     arr[1][10]="*";
                }
            }
         Thread.sleep(550);
       

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.currentTimeMillis();
        while ((System.currentTimeMillis() - startTime) < 500 && !in.ready()) 
        {
        }
        if (in.ready()) 
        {
            Scanner s=new Scanner(System.in);
            d=s.nextInt();
        }

         
       }
    }

}
    

