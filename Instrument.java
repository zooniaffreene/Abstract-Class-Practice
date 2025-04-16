public abstract class Instrument {
  public abstract void play();

  public abstract void tune();

  public void done()
  {
    System.out.print(this + " has been tuned and played!");
  }
}
