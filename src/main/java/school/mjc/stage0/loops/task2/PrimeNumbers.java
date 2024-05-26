package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive) {
            int divider = 2;
            boolean isPrime = true;

            while (divider <= Math.sqrt(counter)) {
                if (counter % divider == 0) {
                    isPrime = false;
                }

                divider ++;
            }

            if (isPrime) {
                System.out.println(counter);
            }

            counter ++;
        }
    }
}
