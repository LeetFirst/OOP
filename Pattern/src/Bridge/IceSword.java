package Bridge;

/**
 * Ледянной меч
 */
public class IceSword extends SwordImpl{

    @Override
    double damage() {
        return 20; // атака обычного меча + урон от холода
    }

    @Override
    double superAttack() {
        return 40; // супер атака холодом
    }
}
