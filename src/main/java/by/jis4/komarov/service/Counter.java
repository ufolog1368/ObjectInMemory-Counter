package by.jis4.komarov.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {
    private Logger logger = LoggerFactory.getLogger(Counter.class);
    private int value;
    private int step;
    private static final int MAX_COUNTER = 100;
    private static final int MIN_COUNTER = 0;
    private static final int MAX_STEP = 10;
    private static final int MIN_STEP = 1;


    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public int getValue() {
        return value;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        if (step >= MIN_STEP && step <= MAX_STEP){
            this.step = step;
        } else {
            logger.info("Value step Counter can be between (1 - 10)");
        }
    }

    public void setValue(int value) {
        if (value >= MIN_COUNTER && value <= MAX_COUNTER){
            this.value = value;
        } else {
            logger.info("Value Counter can be between (0 - 100)");
        }
    }

    public void reset(){
        this.value = 0;
        this.step = 1;
    }

    public void increment(){
        if ((getValue() + getStep()) > MAX_COUNTER){
            logger.info("You have Max limit counter");
        } else {
            this.value = getValue() + getStep();
        }
    }

    public void decrement(){
        if ((getValue() - getStep()) < MIN_COUNTER){
            logger.info("You have min limit counter");
        } else {
            this.value = getValue() - getStep();
        }
    }
}
