package MovieTicketBooking;

public class LoginSuccessException extends Throwable {
    public LoginSuccessException(String invalidUserNameOrPass) {
        super(invalidUserNameOrPass);
    }
    public LoginSuccessException(){}
    public LoginSuccessException(Throwable cause){
        super(cause);
    }
}
