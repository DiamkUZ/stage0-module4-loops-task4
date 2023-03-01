package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int sumToSkip = 0;
        int SumLastInRow = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                sumToSkip = sumToSkip + i;
            }
            else {
                SumLastInRow = SumLastInRow + i;
            }

            }
        System.out.println("skipped sum is "+sumToSkip);
        System.out.println("counted sum is "+SumLastInRow);


    }
}

