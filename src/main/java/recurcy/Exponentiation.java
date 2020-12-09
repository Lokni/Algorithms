package recurcy;

public class Exponentiation {
    public static int exponent(int num, int exp){
        if (num == 1 || exp == 1){
            return num;
        }
        return num * exponent(num, --exp);
    }

    public static void main(String[] args) {
        System.out.println(exponent(5,3));
    }
}
