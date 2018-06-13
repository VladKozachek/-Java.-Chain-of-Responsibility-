public class SmsLoger extends Loger {
    @Override
    void write(String message) {
        System.out.println("Sms Loger : "+message);
    }
}
