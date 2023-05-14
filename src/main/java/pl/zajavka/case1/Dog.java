package pl.zajavka.case1;

public class Dog extends Animal {

    @Override
    public String whatIsYourName() {
        return "My name is Dog";
    }
    private String name;

    public void sniff() {
        System.out.println("I'm soo sniffing!");
    }
}
