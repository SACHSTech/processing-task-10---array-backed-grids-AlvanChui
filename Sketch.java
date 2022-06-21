import processing.core.PApplet;

public class Sketch extends PApplet {
	
  int CELL_WIDTH = 20;
  int CELL_HEIGHT = 20;
  int MARGIN = 5;
  int ROW_COUNT = 10;
  int COLUMN_COUNT = 10;
  int intGrid[][];
  int mouseGridX;
  int mouseGridY;

  int SCREEN_WIDTH = (CELL_WIDTH + MARGIN) * COLUMN_COUNT + MARGIN;
  int SCREEN_HEIGHT = (CELL_HEIGHT + MARGIN) * ROW_COUNT + MARGIN;

  public void settings() {
    // put your size call here
    size(500, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0);
    int[][] intGrid = new int[ROW_COUNT][COLUMN_COUNT];
  }
  
  public void draw() {
    //intGrid[1][5] = 1;
    for(int column = 0; column <= COLUMN_COUNT; column++){
      for (int row = 0; row <= ROW_COUNT; row++){
        if(intGrid[column][row] == 1){
          fill(0,255,0);
          rect(column*(CELL_WIDTH + MARGIN + 1), row*(CELL_HEIGHT + MARGIN + 1), CELL_WIDTH, CELL_HEIGHT);  
        }
        else{
          fill(255);
          rect(column*(CELL_WIDTH + MARGIN + 1), row*(CELL_HEIGHT + MARGIN + 1), CELL_WIDTH, CELL_HEIGHT);
        }
      }
    }

  }

  public void mousePressed(){
    mouseGridX = (int)(mouseX / (CELL_WIDTH + MARGIN));
    mouseGridY = (int)(mouseY / (CELL_HEIGHT + MARGIN));
    println("clicked, " + "mouse coordinates: " mouseX + mouseY + ", grid coordinates: " + mouseGridX + mouseGridY);
    intGrid[mouseGridX][mouseGridY] = 1;
  }
}
