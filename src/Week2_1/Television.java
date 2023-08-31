package Week2_1;

public class Television {
    public boolean on;
    int channel;

    public Television() {
        this.on = false;
        this.channel = 1;
    }

    public boolean isOn() {
        return on;
    }

    public boolean pressOnOff() {
        this.on = !this.on;
        return isOn();
    }
    public int getChannel(){
        return channel;
    }

    public int setChannel(int channel) {
        if (channel>10){
            channel = 1;
        }
        this.channel = channel;
        return this.channel;
    }
}
