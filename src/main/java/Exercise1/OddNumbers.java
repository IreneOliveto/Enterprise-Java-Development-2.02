package Exercise1;

public class OddNumbers {

    public int[] oddInteger (int n) {
        if (n <= 1) {
            return new int[] {};
        }
        else {
            int[] result = new int[n/2];
            int oddNumber = 1;
            for (int i = 0; i < result.length; i++) {
                result[i] = oddNumber;
                oddNumber = oddNumber+2;
            }
            return result;
        }
    }
}
