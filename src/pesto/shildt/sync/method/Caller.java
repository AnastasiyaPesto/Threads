package pesto.shildt.sync.method;

public class Caller implements Runnable {
  String msg;
  Callme target;
  Thread th;

  public Caller(Callme target, String msg) {
    this.target = target;
    this.msg = msg;
    this.th = new Thread(this);
    th.start();
  }

  @Override
  public void run() {
    target.call(msg);
  }
}
