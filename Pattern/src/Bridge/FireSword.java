package Bridge;

public class FireSword extends SwordImpl{
    @Override
    double damage() {
        return 22; // атака огенным мечом
    }

    @Override
    double superAttack() {
        return 50; // огенная супер атака
    }
}
