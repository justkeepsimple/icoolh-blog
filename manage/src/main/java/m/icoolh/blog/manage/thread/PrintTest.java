package m.icoolh.blog.manage.thread;

/**
 * Created by yangkaihong on 2019/3/18
 */
public class PrintTest {
    public static void main(String[] args) throws InterruptedException {
        Object lockA = new Object();
        Object lockB = new Object();
        Object lockC = new Object();
        Thread pa = new Thread(new PrintA(lockA, lockB, lockC));
        Thread pb = new Thread(new PrintB(lockA, lockB, lockC));
        Thread pc = new Thread(new PrintC(lockA, lockB, lockC));
        pa.start();
        //Thread.sleep(100);
        pb.start();
        //Thread.sleep(100);
        pc.start();

    }

}

class PrintA implements Runnable {
    private Object lockOne;
    private Object lockTwo;
    private Object lockThree;

    public PrintA(Object lockOne, Object lockTwo, Object lockThree) {
        this.lockOne = lockOne;
        this.lockTwo = lockTwo;
        this.lockThree = lockThree;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lockThree){
                synchronized (lockOne) {
                    System.out.println("A");
                    lockOne.notifyAll();
                }
                try {
                    lockThree.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class PrintB implements Runnable {
    private Object lockOne;
    private Object lockTwo;
    private Object lockThree;

    public PrintB(Object lockOne, Object lockTwo, Object lockThree) {
        this.lockOne = lockOne;
        this.lockTwo = lockTwo;
        this.lockThree = lockThree;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lockOne) {
                synchronized (lockTwo){
                    System.out.println("B");
                    lockTwo.notifyAll();
                }
                try {
                    lockOne.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class PrintC implements Runnable {
    private Object lockOne;
    private Object lockTwo;
    private Object lockThree;

    public PrintC(Object lockOne, Object lockTwo, Object lockThree) {
        this.lockOne = lockOne;
        this.lockTwo = lockTwo;
        this.lockThree = lockThree;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lockTwo) {
                synchronized (lockThree){
                    System.out.println("C");
                    lockThree.notifyAll();
                }
                try {
                    lockTwo.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

class LockA {

}

class LockB {

}

class LockC {

}
