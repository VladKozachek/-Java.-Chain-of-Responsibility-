public class DbLoger extends Loger {
    @Override
    void write(String message) {
        System.out.println("Db Loger : "+ message);
    }
}
