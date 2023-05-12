public class Main {
    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(-1);
    }
    private static void validateAge(int age) throws AgeLessThanZeroException {
        if (age<0){
            throw new AgeLessThanZeroException("Age is less than zero");
        }
    }
}
