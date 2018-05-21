public abstract class Component {

    private String make;
    private String model;

    public Component(String make, String model){
        this.make = make;
        this.model = model;
    }

    public abstract String play(Song song);

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
