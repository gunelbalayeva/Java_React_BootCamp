package day_3_inheritance.tasks_36_39.polymorphism_demo;

public class FileLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Loged to file..");

    }
}
