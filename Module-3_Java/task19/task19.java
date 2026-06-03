interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Strumming the Guitar...");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Piano...");
    }
}

public class task19 {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play();
        piano.play();
    }
}
