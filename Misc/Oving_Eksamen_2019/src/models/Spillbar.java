package models;

public abstract class Spillbar implements Comparable<Spillbar> {

    private String name;
    private int durationSec;

    public Spillbar(String soundClip, int durationSec){
        this.name = soundClip;
        this.durationSec = durationSec;
    }

    public String getName(){
        return name;
    }

    public int getDurationSec(){
        return durationSec;
    }
    //Ser at video og lydklipp har en størrelse, og disse har forskjellige metoder for å beregne størrelsen. Derfor har
    //jeg laget en abstract metode for dette, og vi må derfor bruke @Override for å overskrive metoden i de Lyd klassen.
    public abstract long getSize();

    //implementere spill, da begge klassene kan spille av filene.
    public abstract void spill();

    @Override
    public int compareTo(Spillbar o) {
        return this.name.compareTo(o.name);
    }
}

public class Lyd extends Spillbar {
    private int channel;
    private int samplingRate;
    private int bitrate;
    private LydSamples lydSamples;

    public Lyd(String soundClip, int durationSec, int channel, int samplingRate, int bitrate,
               LydSamples lydSamples){

        super(soundClip, durationSec)
        if(channel >= 1 && channel <= 24){
            this.channel = channel;
        }
        else{
            throw new IllegalArgumentException();
        }
        this.samplingRate = samplingRate;
        this.bitrate = bitrate;
        this.lydSamples = lydSamples;

    }

    public int getChannel(){
        return this.channel;
    }

    public int getSamplingRate(){
        return this.samplingRate;
    }

    public int getBitrate(){
        return this.bitrate;
    }

    public LydSamples lydSamples(){
        return this.lydSamples;
    }

    @Override
    public void spill(){

    }

    @Override
    public long getSize(){
        int size = 0;
        size = this.channel * this.samplingRate * (this.bitrate/8) * this.durationSec;
        size = (int) Math.ceil(size);
        return size;
    }

    public boolean cdKvalitet(){
        int Hz = 44100;
        if(channel >=2 && samplingRate >= Hz && bitrate >= 16){
            return true;
        }
        else{
            return false;
        }
    }

}

