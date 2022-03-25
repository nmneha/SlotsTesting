public class SlotsPlayer {
    int age;
    String name;
    double funds;

    public SlotsPlayer(String name, int age, double funds) {
        this.name = name;
        this.age = age;
        this.funds = funds;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

}
