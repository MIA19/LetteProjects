package de.lette.task.multiple.collections;

import java.util.Random;

public enum Mark
{
    EINS((short) 1),
    ZWEI((short) 2),
    DREI((short) 3),
    VIER((short) 4),
    FUENF((short) 5),
    SECHS((short) 6);

    private short number;

    Mark(short number) {
        this.number = number;
    }

    public static Mark getRandomMark()
    {
        return Mark.values()[new Random().nextInt(Mark.values().length)];
    }
}
