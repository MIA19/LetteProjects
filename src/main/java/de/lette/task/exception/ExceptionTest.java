package de.lette.task.exception;

import java.util.Random;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            new ExceptionTest().wrapException(new Random().nextInt(123));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public void wrapException(int i) throws CustomException {
        throw new CustomException("Number " + i + " exception");
    }
}
