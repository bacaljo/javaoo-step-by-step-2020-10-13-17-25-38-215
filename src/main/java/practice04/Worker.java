package practice04;

import common.IntroductionBuilder;

public class Worker extends Person {

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        String workerIntroduction = new IntroductionBuilder().appendWorker()
                .appendWorkerJob()
                .toString();

        return String.format("%s %s", basicIntroduce(), workerIntroduction);
    }

}
