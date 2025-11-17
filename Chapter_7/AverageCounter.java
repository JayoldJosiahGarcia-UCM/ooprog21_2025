    
    class AverageCounter {
        public static void main(String[]a){
            int[] responseTimes = {100,200,150,300};
            int count = 0;
            int y = 1;
            
            for(int tracker = 1; tracker < responseTimes.length; tracker++){
                int x = 0;
                
                int total = 0;

                for(;x < y; x++){
                    total += responseTimes[x];

                }

                total = total / y;

                if(responseTimes[y]> total){
                    count++;
                }
                y++;
                
            }
        System.out.println( count);
        
        }
    }
