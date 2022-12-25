public class exc42 {
    public static void main(String[] args) {
        /*boolean generator = false;
        int gen_number = 0;
        int prime = 107377;
        while(!generator) {
            if(is_prime(prime)) {
                for(int k = 100001; k < prime; k++) {
                    if (is_generator(k, prime)) {
                        generator = true;
                        gen_number = k;
                        break;
                    }
                }
                System.out.println("No generator > 10^5 for " + prime++);
            }
            else
                prime++;
        }*/
        System.out.println(is_generator(100002, 150001));
        System.out.println("--------");
        System.out.println("--------");
        //System.out.println(gen_number + " ist ein Generator für " + prime);
    }

    public static boolean is_generator(int gen, int prime){
        int sum = 0;
        int gen_sum = 0;
        for(int i = 1; i < prime; i++){
            sum += i;
            gen_sum += (Math.pow(gen, i)%prime);
        }
        return sum == gen_sum;
    }

    public static boolean is_prime(int no){
        for(int i = 2; i < no; i++){
            if((no%i) == 0)
                return false;
        }
        return true;
    }

    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }
}
