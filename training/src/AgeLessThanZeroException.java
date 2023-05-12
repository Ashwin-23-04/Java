public class AgeLessThanZeroException extends Throwable {
    public AgeLessThanZeroException(){
    }
    public AgeLessThanZeroException(String message){
        super(message);
    }
    public AgeLessThanZeroException(Throwable cause){
        super(cause);
    }
}
