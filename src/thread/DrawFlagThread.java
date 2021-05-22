package thread;
import model.*;

public class DrawFlagThread extends Thread{

  private final static String ESC = "\u001b[";
  private ColombiaFlag flag;
  private int x;
  private int y;
  private int finalY;
  private int sleep;
  private Colors color;
  public DrawFlagThread(ColombiaFlag flag, int x, int y, int finalY, int sleep, Colors color){
    this.flag = flag;
    this.x = x;
    this.y = y;
    this.finalY = finalY;
    this.sleep = sleep;
    this.color = color;
  }//End DrawFlagThread constructor

  @Override
  public void run(){
    printFlag();
  }//End run

  public synchronized void printFlag(){
    for(int i = x; i < flag.getMaximunWidth();i++){
      for(int j = y; j < finalY; j++){
        String moveH = ESC+(i)+"G";
        String moveV = ESC+(j)+"d";
        System.out.print(moveH+moveV+flag.drawFlag(color));
        try{
          Thread.sleep(sleep);
        }catch(InterruptedException e){
            System.out.println("Paila");
        }
      }//End for
    }//End for
  }//End printFlag

}//End DrawFlagThread
