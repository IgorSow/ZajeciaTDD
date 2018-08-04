package prime;



import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import prime.Exepction.MyExepction;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
@RunWith(JUnitParamsRunner.class)
public class PrimeNumberTest {

    //to jesli nie mamy LOMBOK-a
//    private static Logger log = LoggerFactory.getLogger(PrimeNumberTest.class)

    //TODO napisac logike -- DONE
    //TODO refactor -- DONE
    //TODO podpisac junit params do pom'a
    //TODO refactor na test z parametrami



    @Test
    public void shouldCheckIf1IsPrimeNumber() throws MyExepction {

        log.info("Succes");

        //given
        int nmber = 1;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();

        //when
        boolean isPrime = PrimeNumberUtils.isPrime(nmber);

        //then

        assertThat(isPrime).isFalse();

    }

    @Test
    public void shouldCheckIf2IsPrimeNumber() throws MyExepction{

        log.info("Succes");

        //given
        int nmber = 2;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();

        //when
        boolean isPrime = PrimeNumberUtils.isPrime(nmber);

        //then

        assertThat(isPrime).isTrue();

    }

    @Test
    public void shouldCheckIf3IsPrimeNumber() throws MyExepction{

        log.info("Succes");

        //given
        int nmber = 3;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();

        //when
        boolean isPrime = PrimeNumberUtils.isPrime(nmber);

        //then

        assertThat(isPrime).isTrue();

    }

    @Test
    public void shouldCheckIf4IsPrimeNumber() throws MyExepction{

        log.info("Succes");

        //given
        int nmber = 4;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();

        //when
        boolean isPrime = PrimeNumberUtils.isPrime(nmber);

        //then

        assertThat(isPrime).isFalse();

    }

    @Test
    public void shouldCheckIf5IsPrimeNumber() throws MyExepction{

        log.info("Succes");

        //given
        int number = 5;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();

        //when
        boolean isPrime = PrimeNumberUtils.isPrime(number);

        //then

        assertThat(isPrime).isTrue();

    }


    @Test
    @Parameters({
            "2, true",
            "3, true",
            "4, false",
            "5, true",})
    public void shouldCheckIf5IsPrimeNumber(int number, boolean valid) throws MyExepction{

        log.info("Succes" + number);

        //given
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();

        //when
        boolean isPrime = PrimeNumberUtils.isPrime(number);

        //then

        assertThat(isPrime).isEqualTo(valid);

    }




}

