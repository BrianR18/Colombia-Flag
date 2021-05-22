package ui;
import model.*;
import thread.*;

public class Main{
  public final static String RESET = "\u001B[0m";

  public static void main(String[] args) throws InterruptedException{
    ColombiaFlag flag = new ColombiaFlag();
    DrawFlagThread th1 = new DrawFlagThread(flag,0,0,12,20,Colors.YELLOW);
    DrawFlagThread th2 = new DrawFlagThread(flag,0,12,18,80,Colors.BLUE);
    DrawFlagThread th3 = new DrawFlagThread(flag,0,18,24,90,Colors.RED);
    th1.start();
    th2.start();
    th3.start();
    th3.join();
    System.out.print(RESET);
  }//End main

}//End Main
