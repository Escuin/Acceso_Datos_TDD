import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    public List<String> listaNumeros;
    @Before
    public void antes(){
        Main game = new Main();
        listaNumeros = game.getNumbers();
    }

    @Test
    public void deberiaDevolverNumerosCuandoNoSonMultiplicamosNiDe3NiDe5(){

        Assert.assertEquals("1", listaNumeros.get(0));
        Assert.assertEquals("2", listaNumeros.get(1));
        Assert.assertEquals("7", listaNumeros.get(6));
        Assert.assertEquals("13", listaNumeros.get(12));

    }

    @Test
    public void deberiaDevolverFizzCuandoSeaMultiploDe3(){

        Assert.assertEquals("fizz", listaNumeros.get(2));
        Assert.assertEquals("fizz", listaNumeros.get(5));
        Assert.assertEquals("fizz", listaNumeros.get(8));
        Assert.assertEquals("fizz", listaNumeros.get(11));
        Assert.assertEquals("fizz", listaNumeros.get(17));
    }

    @Test
    public void deberiaDevolverBuzzCuandoSeaMultiploDe5(){

        Assert.assertEquals("buzz", listaNumeros.get(4));
        Assert.assertEquals("buzz", listaNumeros.get(9));
        Assert.assertEquals("buzz", listaNumeros.get(19));
        Assert.assertEquals("buzz", listaNumeros.get(24));
        Assert.assertEquals("buzz", listaNumeros.get(34));
    }

    @Test
    public void deberiaDevolverFizzBuzzCuandoSeaMultiploDe3Y5() {
        Assert.assertEquals("fizzbuzz", listaNumeros.get(14));
        Assert.assertEquals("fizzbuzz", listaNumeros.get(29));
    }
}
