public class FindPower {
    public static void main(String[] args) {
        int base=2;
        int power=4;
        double result = 1;
        if(power < 0)
        {
            base = 1 / base;
            power = -(power);
        }
        if(power == 0)
        {
            System.out.println(result);
        }
        while(power!=0)
        {

        }
        
        for(int i = 0; i < power; i++) {
            result = result * base;
        }
        System.out.println(result);
    }
    
}
