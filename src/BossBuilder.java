public class BossBuilder {
    private String healse;
    private int uron;
    private String zashita;

    public BossBuilder setHealse(String healse) {
        this.healse = healse;
        return this;
    }

    public BossBuilder setUron(int uron) {
        this.uron = uron;
        return this;
    }

    public BossBuilder setZashita(String zashita) {
        this.zashita = zashita;
        return this;
    }

    public Boss createBoss() {
        return new Boss(healse, uron, zashita);
    }
}