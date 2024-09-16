public class Reduce {

    public static void main(String[] args) {
        int n = 100;
        int steps = 0;

        while(n > 0){
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }
            steps++;
        }

        System.out.println("It took " + steps + " steps to reach 0 from 100.");
    }
}
