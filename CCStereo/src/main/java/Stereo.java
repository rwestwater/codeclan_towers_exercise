import java.util.ArrayList;
import java.util.List;

public class Stereo {
    private static final int MAX_VOL = 11;
    private List<Component> components;
    private Radio radio;
    private int volume;
    private IConnect connectedDevice;

    public Stereo(List<Component> components, Radio radio){
        this.volume = 0;
        this.components = new ArrayList<Component>(components);
        this.radio = radio;
    }

    public void increaseVolume(int amount){
        if(volume + amount <= MAX_VOL){
            volume += amount;
        }
    }

    public void reduceVolume(int amount){
        if(volume - amount >= 0){
            volume -= amount;
        }
    }

    public void setConnectedDevice(IConnect device){
        this.connectedDevice = device;

    }

}
