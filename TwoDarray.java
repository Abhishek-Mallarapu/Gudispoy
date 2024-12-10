
public class TwoDarray{
public static void main(String[] args) 
{
        int[][] matrixA={ {1,2,1},{6,7,2},{2,8,3}}; 
        int[][] matrixB={ {1,2,1},{6,7,2},{2,8,3}};  
        
        int row=matrixA.length;
        int col=matrixA[0].length;
        int[][] result=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                result[i][j]=matrixA[i][j]+matrixB[i][j];
            }

        }

        for(int[] r:result)
        {
                for(int value: r)
                {
                        System.out.print(value +" ");
                }
                System.out.println();
        }
        

    
}
    }