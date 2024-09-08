package interview;

import java.util.stream.IntStream;

public class Lti2 {
	
	public static void main(String[] args) {
        String str = "maanab";
        int length = str.length();

        IntStream.range(0, length)
                .forEach(i -> IntStream.range(i + 1, length + 1)
                        .forEach(j -> {
                            String substring = str.substring(i, j);
                            if (isPalindrome(substring)) {
                                System.out.println(substring);
                            }
                        }));
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


