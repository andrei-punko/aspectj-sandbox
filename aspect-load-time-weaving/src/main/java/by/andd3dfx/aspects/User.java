package by.andd3dfx.aspects;

public class User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printHello() {
        CustomUserAspect.getWriter().append("Hello, " + name + "! You are " + age + " years old!");
    }
}
