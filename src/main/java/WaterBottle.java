public class WaterBottle {

    public int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return volume;
    }

    public void drink() {
        this.volume -= 10;
    }

    public void empty(){
        volume = 0;
    }

    public void fill(){
        volume = 100;
    }
}
