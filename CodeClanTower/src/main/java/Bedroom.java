public class Bedroom extends Room{

  private int roomNo;
  private BedroomType type;
  private double rate;


  public Bedroom(int roomNo, BedroomType type, double rate){
      super(2);
      this.roomNo = roomNo;
      this.type = type;
      this.rate = rate;
      }

    public int getRoomNo(){
        return roomNo;
    }

    public BedroomType getBedroomType(){
        return type;
    }

    public double getRate(){
        return rate;
    }










}
