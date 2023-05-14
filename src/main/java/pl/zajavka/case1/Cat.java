package pl.zajavka.case1;

public class Cat extends Animal {
String name;
String surname;
Integer age;
    private String milk;

    public Cat(String milk) {
        this.milk = milk;
    }

    private String milk;

    public Cat(String milk) {
        this.milk = milk;
    }

    @Override
    public String whatIsYourName() {
        return "My name is Cat";
    }
}
