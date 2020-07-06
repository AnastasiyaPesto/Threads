package pesto.sh.sync.method;

public class Sync {
  public static void main(String[] args) {
    Callme target = new Callme();
    Caller caller1 = new Caller(target,"Добро пожаловать");
    Caller caller2 = new Caller(target,"в синхронизированный");
    Caller caller3 = new Caller(target,"мир!");

    // ожидать завершения потока исполнения
    try {
      caller1.th.join();
      caller2.th.join();
      caller3.th.join();
    } catch (InterruptedException e) {
      System.out.println("Прервано");
    }
  }
}