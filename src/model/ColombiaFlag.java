package model;

public class ColombiaFlag{

	private final String YELLOW_COLOR =  "\u001B[43m";
	private final String BLUE_COLOR = "\u001B[44m";
	private final String RED_COLOR = "\u001B[41m";
  private final int MAXIMUN_WIDTH = 100;

  public ColombiaFlag(){
  }//End ColombiaFlag constructor

  public String drawFlag(Colors color){
    if(color == Colors.YELLOW)
        return YELLOW_COLOR + " ";
    else if(color == Colors.BLUE)
        return BLUE_COLOR + " ";
    else
        return RED_COLOR + " ";
  }//End drawFlag

  public int getMaximunWidth(){
    return MAXIMUN_WIDTH;
  }//End getMaximunWidth

}//End ColombiaFlag
