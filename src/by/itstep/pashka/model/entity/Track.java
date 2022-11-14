package by.itstep.pashka.model.entity;


public final class Track extends Duration {

    private String name;
    private String genre;
    private String tempo;


    public Track() {
    }

    public Track(String name) {
        this.name = name;
    }

    public Track(double duration, String name,
                 String genre, String tempo) {
        super();
        this.name = name;
        this.genre = genre;
        this.tempo = tempo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getInfo() {
        return getInfo() + name + genre + tempo;
    }

    @Override
    public void record () {

    }
}
