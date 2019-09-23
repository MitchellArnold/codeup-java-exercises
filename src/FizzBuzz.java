public class FizzBuzz {

    public static void main(String[] args) {

        fizzBuzzLoop();
    }

        public static void fizzBuzzLoop(int i) {
            i = 1;
            while (true) {
                if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
//                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
//                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                if (i == 100) {
                    break;
                }
                i++;
        }
            return ;
    }


}
