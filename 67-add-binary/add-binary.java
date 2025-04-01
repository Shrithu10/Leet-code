import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2); // Convert binary string to BigInteger
        BigInteger num2 = new BigInteger(b, 2); // Convert binary string to BigInteger
        BigInteger sum = num1.add(num2); // Add the two numbers
        return sum.toString(2); // Convert result back to binary string
    }
}