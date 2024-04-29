public abstract class Zarizeni {
    private boolean pujceno;
    private int udrzba;
    public void rezervace() {
        if (pujceno == false) {
            pujceno = true;
            udrzba++;
        }
        else {
            System.out.println("Zařízení už je vypůjčeno jiným, počkejte si na svou řadu");
        }
    }
    public void vraceni() {
        pujceno = false;
    }
    public void vypisInfo() {
        System.out.println("Pujceno: "+ pujceno+" poslední udrzba pred "+udrzba+" použitími");
    }
    public void udrzba() {
        udrzba = 0;
    }

    public Zarizeni(boolean pujceno, int udrzba) {
        this.pujceno = pujceno;
        this.udrzba = udrzba;
    }
}
