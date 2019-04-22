import java.util.concurrent.atomic.*; 
  
public class IncrementSyncronize{
  private int value = 0;

  public synchronized int getNextValue1(){
    return ++value;
  }

  public int getNextValue2(){
    synchronized(this){
      return ++value;
    }
  }
  
  public int getNextValue3(){
    return (new AtomicInteger(value)).getAndIncrement();
  }
  
}