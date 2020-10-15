package practice03;

import common.IntroductionBuilder;

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return new IntroductionBuilder().appendWorker()
                .appendWorkerJob()
                .toString();
    }
}
