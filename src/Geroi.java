public class Geroi {
    public int getHealse() {
        return healse;
    }

    public int getUron() {
        return uron;
    }

    public String getSupersposobnacti() {
        return supersposobnacti;
    }


    private int healse;
    private int uron;
   private String supersposobnacti;

    public Geroi(int healse, int uron, String supersposobnacti) {
        this.healse = healse;
        this.uron = uron;
        this.supersposobnacti = supersposobnacti;

    }


     public Geroi(int healse, int uron){
            this.healse = healse;
            this.uron = uron;

    }
}
