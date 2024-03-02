//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        EmailLoger Loger = new EmailLoger();
//        Loger.log("log mesajı");
//        DataBaseLogger logger = new DataBaseLogger();
//        logger.log("log mesajı");
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DataBaseLogger(), new EmailLoger(), new ConsoleLogger()};
//        for (BaseLogger logger1:loggers){
//            logger1.log("Log mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}