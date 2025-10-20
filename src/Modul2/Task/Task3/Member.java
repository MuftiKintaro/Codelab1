package Modul2.Task.Task3;

public class Member {
    private String name;

    public Member(String name) {
        this.setName(name);
    }

    //Refactoring encapsulate field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
