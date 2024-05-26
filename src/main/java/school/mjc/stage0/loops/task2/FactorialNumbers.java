package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;

        while (counter <= printToInclusive) {
            if (counter == 0) {
                System.out.println(1);
            } else {
                int result = 1;

                int innerCounter = 1;
                while (innerCounter <= counter) {
                    result *= innerCounter;
                    innerCounter ++;
                }

                System.out.println(result);
            }

            counter ++;
        }
    }
}
