package Ex3;

import java.util.Arrays;

public class BigNumber {
    public int[] add(int[] number1, int[] number2) {
        int carry = 0;
        int[] result = new int[number1.length + 1];
        for (int i = number1.length - 1; i >= 0; i--) {
            int sum = number1[i] + number2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;
        if (carry == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;

    }

    public int[] sub(int[] number1, int[] number2) {
        int borrow = 0;
        int[] result = new int[number1.length];

        for (int i = number1.length - 1; i >= 0; i--) {
            int sub = number1[i] - number2[i] - borrow;
            if (sub < 0) {
                sub += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = sub;
        }

        return result;
    }

    public int[] mul(int[] number1, int number2) {
        int[] result = new int[number1.length + 1];
        int carry = 0;
        for (int i = number1.length - 1; i >= 0; i--) {
            int product = number1[i] * number2 + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }
        result[0] = carry;
        if (carry == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;
    }

    public int[] div(int[] number1, int number2) {
        int[] result = new int[number1.length];
        int rest = 0;

        for (int i = 0; i < number1.length; i++) {
            int current = rest * 10 + number1[i];
            result[i] = current / number2;
            rest = current % number2;
        }

        return result;
    }
}
