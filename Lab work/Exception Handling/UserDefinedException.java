class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}