public class Vogel implements KannFliegen {

    @Override
    public void fliegen(int strecke) {
        for (int i = 0; i < strecke; i+=100) {
            System.out.println("...");
        }
    }
}