package by.itstep.pashka.model.logic;


public class SoundRecording {
    public static void justRecord(Recordable recordable) {
        recordable.record(new track1());
        recordable.record(new track2());
        recordable.record(new track3());
        recordable.record(new track4());


    }
    public record Recordable() {
        public void record() {
        }
    }

}


