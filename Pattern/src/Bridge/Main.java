package Bridge;

public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword();
        System.out.println(sword.getRealSword() instanceof SwordImpl);
        sword.transformToFireSword();
        System.out.println(sword.getRealSword() instanceof FireSword);
        sword.transformToIceSword();
        System.out.println(sword.getRealSword() instanceof IceSword);
    }
}
