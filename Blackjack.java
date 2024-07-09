public class Blackjack {
    public static void main(String[] args) {
        int[] array = { 18, 19, 26, 33, 20, 35, 13, 32, 15, 34};  
        int largest = array[0];
        
        for (int value : array) {
            if (value > largest) {
                largest = value;
            }
        }

        System.out.println("The Largest Number is: " + largest);
    }
}