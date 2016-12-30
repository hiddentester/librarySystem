public class Printer{
  protected final double PRICE_BW = 0.15;
  protected final double PRICE_COLOUR = 0.50;
  protected long id;
  protected int maxPaper;
  protected int numPaper;
  
  public Printer(long identification, int max, int num){
    id = identification;
    maxPaper = max;
    numPaper = num;
  }//Printer constructor
  
  public String toString(){
    return "ID: "+id + " Max Number of Paper(s): " +  maxPaper + "Current Number of Paper(s): " +numPaper;
  }//toString method
  
  public boolean equals(Printer other){
    if(id == other.id){
      return true;
    }
    return false;
  }//equals method
  
  public long getID(){
    return id;
  }//getID method
  
  public int getNumPaper(){
    return numPaper;
  }//getPaper method
  
  public boolean print(int needed){  //Checks if printing is possible and adds to amount due
    //missing the add to amount due part, we need to be able to differentiate from BW and COLOUR so either, we need another
    //variable in the method or two seperate methods
    if(numPaper - needed >= 0){
      return true;
    }
    return false;
  }//print method
  
  public boolean addPaper(int sheets){  //Adds sheets of paper to the printer
    if(maxPaper >= sheets + numPaper){
      numPaper = numPaper + sheets;
      return true;
    }
    return false;
  }//addPaper method
  
}//Printer class
