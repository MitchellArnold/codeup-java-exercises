package TestPacks.JustTests;

class SuperHero extends Person {
    private String alterEgo;
    public SuperHero(String name, String alterEgo) {
        super(name);
        this.alterEgo = alterEgo;
    }
    public String getName() {
        return alterEgo;
    }
    public String getSecretIdentity() {
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero batman = new SuperHero("Bruce Wayne", "Brian Carmike");
        System.out.println(batman.getName());
        System.out.println("batman.getSecretIdentity() = " + batman.getSecretIdentity());
    }
}
