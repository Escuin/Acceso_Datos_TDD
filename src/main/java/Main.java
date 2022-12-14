import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(obtenerNumero(i));

        }
        return numbers;
    }

    private String obtenerNumero(int i) {
        if (esMultiplo(i, 3) && esMultiplo(i, 5)) return (FIZZ + BUZZ);
        else if (esMultiplo(i, 3)) return (FIZZ);
        else if (esMultiplo(i, 5)) return (BUZZ);
        else return (String.valueOf(i));
    }

    private boolean esMultiplo(int numero, int multiplo) {
        return numero % multiplo == 0;
    }
}
