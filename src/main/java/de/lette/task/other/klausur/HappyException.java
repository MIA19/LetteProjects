package de.lette.task.other.klausur;

public class HappyException extends Exception {

    private int gewinn;

    public HappyException(int gewinn)
    {
        super("Dein Gewinn beträgt " + gewinn + "€");
        this.gewinn = gewinn;
    }
}
