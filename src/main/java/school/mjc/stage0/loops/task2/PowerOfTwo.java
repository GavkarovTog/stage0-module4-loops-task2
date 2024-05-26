package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }

        int result = 1;
        int currentPower = 0;

        while (currentPower <= power) {
            if (currentPower != 0) {
                result *= 2;
            }

            System.out.println(result);
            currentPower ++;
        }
    }
}
