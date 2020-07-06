package pesto.sh.sync.basic;

public class JoinDemo {
  public static void main(String[] args) {
    NewThread th1 = new NewThread("ОДИН");
    NewThread th2 = new NewThread("ДВА");
    NewThread th3 = new NewThread("ТРИ");

    System.out.println("Поток ОДИН запущен: " + th1.t.isAlive());
    System.out.println("Поток ДВА запущен: " + th2.t.isAlive());
    System.out.println("Поток ТРИ запущен: " + th3.t.isAlive());

    try {
      System.out.println("Ожидание завершения потоков.");
      th1.t.join();
      th2.t.join();
      th3.t.join();
    } catch (InterruptedException e) {
      System.out.println("Главный поток прерван");
    }
    System.out.println("Поток ОДИН запущен: " + th1.t.isAlive());
    System.out.println("Поток ДВА запущен: " + th2.t.isAlive());
    System.out.println("Поток ТРИ запущен: " + th3.t.isAlive());

    System.out.println("Главный поток завершен.");
  }
}
