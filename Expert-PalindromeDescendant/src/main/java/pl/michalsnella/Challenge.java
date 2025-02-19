package pl.michalsnella;

public class Challenge {
    public static boolean palindromeDescendant(int number) {

        int num = number;
        int digitCount = getDigitCount(number);

        while (digitCount > 3) {
            num = sumOfEachPairOfAdjacentDigits(num, digitCount);
            System.out.println(num);
            digitCount = getDigitCount(num);
        }

        if (sumOfEachPairOfAdjacentDigits(num, digitCount) > 10) {
            num = sumOfEachPairOfAdjacentDigits(num, digitCount);
        }

        return String.valueOf(num).charAt(0) == String.valueOf(num).charAt(String.valueOf(num).length() - 1);
    }

    private static int sumOfEachPairOfAdjacentDigits(int number, int digitCount) {
        String num = String.valueOf(number);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < digitCount - 1; i = i + 2) {
            int sum = Character.getNumericValue(num.charAt(i))  + Character.getNumericValue(num.charAt(i+1));
            result.append(sum);
        }
        return Integer.parseInt(result.toString());
    }

    private static int getDigitCount(int number) {
        return (number == 0) ? 1 : (int) Math.log10(Math.abs(number)) + 1;
    }
}
