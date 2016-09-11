package Builder;

public class Main {
    public static void main(String[] args) {
        Human human = new HumanBuilder()
                .buildName("Azat")
                .buildAge(18)
                .buildWeight(74)
                .build();
    }
}
