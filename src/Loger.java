public abstract class Loger {
   private Loger nextLog;  // ссылка на следующий обьект
    void setNextLog(Loger log){
        nextLog=log;

    }
    void writeMessage(String message){
        write(message);      //выводим сообщение лога
        if(nextLog!=null){   //есле есть еще один объект(обработчик) выводим и его
            nextLog.writeMessage(message);
        }
    }
    abstract void write(String message) ;  //переопределиться в конкретном классе
}
