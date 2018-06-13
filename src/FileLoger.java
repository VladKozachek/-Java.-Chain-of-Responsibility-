public class FileLoger extends Loger {
    @Override
    void write(String message) {
        System.out.println("File Log : "+message);
    }
}
