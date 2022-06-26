package models;

import java.util.ArrayList;

public class Lyd extends Spillbar{
    private String name;
    private int durationSec;

    private int channel;
    private int samplingRate;
    private int bitrate;
    private LydSamples lydSamples;

    public Lyd(String name, int durationSec, int channel, int samplingRate, int bitrate,
               LydSamples lydSamples){

        this.name = name;
        this.durationSec = durationSec;
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

    public String getSoundClip(){
        return this.name;
    }

    public int getDurationSec(){
        return this.durationSec;
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

    public void spill(){

    }

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
    @Override
    public String toString(){
        return "Lyd " + getName() + " " + getDurationSec();
    }
}
