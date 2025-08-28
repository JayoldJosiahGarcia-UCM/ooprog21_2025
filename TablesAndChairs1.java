
public class TablesAndChairs1{
    public static void main(String[]args){
        for (int i = 0; i <= 5; i++) 
        {
            if(i==1||i==2){
            for(int x = 0; x <= 23; x++)
            {
                if(x==0)
                {
                    System.out.print("X");
                    }
                else if(x==23)
                {
                    System.out.println("X");
                }
                else
                {
                    System.out.print(" ");
                    }
                }
                          }
            if(i==3){
            for(int x = 0; x <= 23;x++)
            {
                if(x==0)
                {
                    System.out.print("X");
                    }
                else if(x==23)
                {
                    System.out.println("X");
                }
                else if(x>=17||x<=6){
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("X");
                }    
                }
            }
        }
    }
}
