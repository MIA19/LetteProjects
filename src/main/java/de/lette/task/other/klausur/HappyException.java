package de.lette.task.other.klausur;

/**
 * A exception for the winner of the {@link Glücksspiel#spiele game}
 */
public class HappyException extends Exception {

    private int gewinn;

    /**
     * Creates a {@link HappyException} object with a {@link #gewinn win pool}
     *
     * @param gewinn the win pool
     */
    public HappyException(int gewinn) {
        super("Dein Gewinn beträgt " + gewinn + "€");
        this.gewinn = gewinn;
    }
}
