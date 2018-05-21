public class MP3Player implements IConnect{
    Stereo connectedStereo;

    @Override
    public String Connect(Stereo stereo) {
        stereo.setConnectedDevice(this);
        this.connectedStereo = stereo;
        return "Successfully connected!!!!!";
    }
}
