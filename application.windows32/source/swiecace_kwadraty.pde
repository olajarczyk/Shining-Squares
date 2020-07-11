int dim = 20; //zmienna przechwująca wielkość tablicy
boolean[][] cells = new boolean[dim][dim];//tablica przechowująca stany komórek

void setup()
{
  size(500,500);
  background(255);
  stroke(0);
  randomizeCells();//przy starcie tablica zostanie wypelniona losowymi wartosciami boolean
  frameRate(12);
  
}

void draw()
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
  

void randomizeCells()//wypelnia tablice losowymi wartosciami
{
  for(int row=0; row<dim;row++)
  {
    for(int col=0; col<dim;col++)
    {
      cells[col][row]= randomBoolean();
    }
  }
  
}

boolean randomBoolean() //generuje losowe boolean
{
  float r = random(1000);
  if(r>500) return true;
  return false;
}

 void mousePressed() {
   for(int row=0; row<dim;row++)
  {
    for(int col=0; col<dim;col++)
    {
    if(cells[col][row]) fill(random(255),random(255), random(255)); else fill(random(255),random(255), random(255));
    rect(width/dim*col, height/dim*row, width/dim, height/dim);
    }
  }
}
