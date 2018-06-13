package de.lette.task.other.klausur;

public class Glücksspiel {
    private static int jackpot;
    private int einsatz;

    public Glücksspiel(int einsatz) {
        jackpot += einsatz;
        this.einsatz = einsatz;
    }

    public void spiele() throws Exception {
        if (einsatz == 0)
            throw new Exception("Das Spiel ist aus");

        int random = (int) (Math.random() * 1000);
        if (random < 7) {
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

    public static void main(String[] args) {
        try {
            for (int i = 0; i <= 1000; i++)
                new Glücksspiel((int) (Math.random() * 90));
            Glücksspiel gs = new Glücksspiel(50);
            gs.spiele();

            gs.spiele();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
