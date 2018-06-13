public class Main {
    public static void main(String[] args) {
        Loger loger0=new SmsLoger();     //создаем обекты различных обработчиков логов
        Loger loger1=new FileLoger();
        Loger loger2=new DbLoger();
        loger0.setNextLog(loger1);  // передаем следующий объект
        loger1.setNextLog(loger2); // передаем следующий объект

        loger0.writeMessage("Hello");
    }
}
