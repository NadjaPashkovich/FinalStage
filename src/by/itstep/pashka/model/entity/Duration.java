package by.itstep.pashka.model.entity;

public  abstract class Duration implements Recordable{

    private double duration;

    public Duration() {
    }

    public Duration(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getInfo(){
        return duration + " ";
    }
         @Override
         public  abstract void record();
}
