import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class swiecace_kwadraty extends PApplet {

int dim = 20; //zmienna przechwująca wielkość tablicy
boolean[][] cells = new boolean[dim][dim];//tablica przechowująca stany komórek

public void setup()
{
  
  background(255);
  stroke(0);
  randomizeCells();//przy starcie tablica zostanie wypelniona losowymi wartosciami boolean
  frameRate(12);
  
}

public void draw()
  {
    for(int row=0; row<dim;row++)
  {
    for(int col=0; col<dim;col++)
    {
      if(cells[col][row]) fill(random(255)); else fill(random(255));
      rect(width/dim*col, height/dim*row, width/dim, height/dim);
      if(key==' ')  
      {
        if(cells[col][row]) fill(random(255),random(255), random(255)); else fill(random(255),random(255), random(255));
        rect(width/dim*col, height/dim*row, width/dim, height/dim);
      }  

       //wspołrzedne lewego gornego rogu  //szerokosc i wysokosc
       //dzielimy wysokosc i szerokosc okna przez wielkosc tablicy co daje info jak duza jest kazda komorka
    }
  }

  }
  

public void randomizeCells()//wypelnia tablice losowymi wartosciami
{
  for(int row=0; row<dim;row++)
  {
    for(int col=0; col<dim;col++)
    {
      cells[col][row]= randomBoolean();
    }
  }
  
}

public boolean randomBoolean() //generuje losowe boolean
{
  float r = random(1000);
  if(r>500) return true;
  return false;
}

 public void mousePressed() {
   for(int row=0; row<dim;row++)
  {
    for(int col=0; col<dim;col++)
    {
    if(cells[col][row]) fill(random(255),random(255), random(255)); else fill(random(255),random(255), random(255));
    rect(width/dim*col, height/dim*row, width/dim, height/dim);
    }
  }
}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "swiecace_kwadraty" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
