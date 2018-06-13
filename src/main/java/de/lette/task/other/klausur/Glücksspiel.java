package de.lette.task.other.klausur;

/**
 * With the the class {@link Glücksspiel} you can try you luck in the jackpot, it contains a method to play and a test {@link #main(String[]) main} function
 */
public class Glücksspiel {
    private static int jackpot;
    private int einsatz;

    /**
     * Creates a {@link Glücksspiel} object with the given parameter and adds the bet to the {@link #jackpot}
     *
     * @param einsatz the bet you need to place
     */
    public Glücksspiel(int einsatz) {
        jackpot += einsatz;
        this.einsatz = einsatz;
    }

    /**
     * You are only able to play one time, your chance to win is 1%
     *
     * @throws Exception if you win or play more than one time
     */
    public void spiele() throws Exception {
        if (einsatz == 0)
            throw new Exception("Das Spiel ist aus");

        double random = Math.random();
        if (random < 0.01) {
            if (jackpot != 0) {
                int jackpot = Glücksspiel.jackpot;
                Glücksspiel.jackpot = 0;
                throw new HappyException(jackpot);
            } else {
                System.out.println("Der Jackpot ist leer");
            }
        } else {
            System.out.println("Sie haben mit einem Einsatz von " + einsatz + "€ verloren.");
        }
        einsatz = 0;
    }

    /**
     * Testing the {@link Glücksspiel}
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            for (int i = 0; i <= 1000; i++)
                new Glücksspiel((int) ((Math.random() * 90) + 10)).spiele();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            Glücksspiel gs = new Glücksspiel(50);
            gs.spiele();
            gs.spiele();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
