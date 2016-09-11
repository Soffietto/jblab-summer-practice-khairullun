package Builder;

public class HumanBuilder {
    String name;
    int age;
    int weight;

    HumanBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    HumanBuilder buildWeight(int weight) {
        this.weight = weight;
        return this;
    }

    HumanBuilder buildAge(int age) {
        this.age = age;
        return this;
    }

    Human build() {
        Human human = new Human();
        human.setName(name);
        human.setAge(age);
        human.setWeight(weight);
        return human;
    }


}
