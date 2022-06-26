package models;

public class Video extends Spillbar{
    private Lyd lyd;
    private BildeSekvens bildeSekvens;

    public Video(String name, Lyd lyd, BildeSekvens bildeSekvens){

        this.lyd = lyd;
        this.bildeSekvens = bildeSekvens

        int durationSec = 0;
        if(lyd.getDurationSec() > bildeSekvens.getDurationSec()){
            durationSec = lyd.getDurationSec();
        }
        else {
           durationSec = bildeSekvens.getDurationSec
        }

        super(name,durationSec);

    }
    @Override
    public String toString(){
        return "Video " + getName() + " " + getDurationSec();
    }
}
