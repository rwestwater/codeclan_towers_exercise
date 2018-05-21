public class CDPlayer extends Component {

    public CDPlayer(String make, String model){
        super(make, model);

    }

    @Override
    public String play(Song song){
        return "Now playing " + song.getName() + " by " + song.getArtist();
    }

    public int getNumberOfCDS(){
        return this.
    }
}
