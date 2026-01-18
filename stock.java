public class stock {
    public static int profit(int stock[], int price){
        int dayOfbuying = 0;
        int sellDay = 0;

        for(int i = 0; i < stock.length; i++){
            if(stock[i] == price){
                dayOfbuying = i;
            }
        }
        int curr = 0;
        for(int i = dayOfbuying + 1; i < stock.length; i++){
            curr = stock[i];
             if(curr >= price){
                sellDay = i;
                price = curr;
             } 
        }
        return sellDay;
    }

    public static void main(String[] args){
        int stock[] = {150, 160, 20, 350, 800, 100, 50, 60};

        System.out.print(profit(stock, 20));
    }
}
