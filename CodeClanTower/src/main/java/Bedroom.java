public class Bedroom extends Room{

  private Integer roomNo;
  private BedroomType type;
  private Double rate;


        public Bedroom(Integer roomNo, BedroomType type, Double rate) {
            super(2);
        this.roomNo = roomNo;
        this.type = type;
        this.rate = rate;
        }

    public Integer getRoomNo(){
        return roomNo;
    }

    public BedroomType getBedroomType(){
        return type;
    }

    public Double getRate(){
        return rate;
    }










}
