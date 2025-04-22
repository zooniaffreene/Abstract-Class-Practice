public class Main {
  public static void main(String[] args) {
    Instrument violin = new Violin();
    Instrument glockenspiel = new Glockenspiel();

    violin.tune();
    violin.play();
    violin.done();

    glockenspiel.tune();
    glockenspiel.play();
    glockenspiel.done();
  }
}
