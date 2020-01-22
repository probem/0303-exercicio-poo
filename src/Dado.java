import java.util.Random;

public class Dado {
    private int lados;
    private Random random;

    public Dado(int ladosInformados){
        lados = ladosInformados;
        random = new Random();
    }

    public int jogar(){
        return random.nextInt(lados) + 1;
    }
}
