package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie5;

public class MainInstruments {

    public static void main(String[] args) {

        Instrumental[] instruments = new Instrumental[]{new Drum(), new Guitar(), new Piano()};

        for (Instrumental instrument : instruments) {
            instrument.play();
        }

    }

}
