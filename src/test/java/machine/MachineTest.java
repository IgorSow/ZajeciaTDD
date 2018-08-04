package machine;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
@RunWith(JUnitParamsRunner.class)
public class MachineTest {

    @Test
    public void test() {
        log.info("Test");
    }


    @Test
    @Parameters({"3.99, 5.00",
            "3.99, 5.00",
            "2.99, 6.00",
            "3.99, 2.00"})
    public void shouldSellSodaWhenBalanceIsOK(double priceOfSoda, double balance) {
        //given

        SodaMachine sodaMachine = new SodaMachine();

        //when
        //toDo logika

        double isSold = sodaMachine.sell(priceOfSoda, balance);

        //then
        assertThat(isSold).isLessThanOrEqualTo(balance);
    }




    @Test
    @Parameters({"11.99, 5.00",
                })
    public void shouldAskForMoneySodaWhenIsBalanceIsWrong(double priceOfSoda, double balance) {
        //given
        SodaMachine sodaMachine = new SodaMachine();

        //when
        //toDo logika

        double restOfMoney = sodaMachine.sell(priceOfSoda, balance);

        //then
        assertThat(restOfMoney).isLessThanOrEqualTo(balance);
    }


    @Test
    @Parameters({
            "1.00,5.00,coke",
            "2.00,5.00,fanta",
            "3.00,5.00,sprite",
            "4.00,5.00,beer"

    })

    public void shouldReturnSoda(double priceOfSoda, double balance, String sodaName) {
        //given
        SodaMachine sodaMachine = new SodaMachine();

        //when

        String nameOfSoda = sodaMachine.payAndGetSoda(priceOfSoda,balance,sodaName);

        // then

        assertThat(nameOfSoda).isEqualTo(sodaName);
    }


    @Test

    public void shouldSellCokeIfEnoughMoney() {
        //given
        double balance = 5.00;
        String drinkToBuy = "fanta";

        SodaMachine sodaMachine = new SodaMachine();

        //when

        DrinkStatus drinkStatus = sodaMachine.sell(drinkToBuy, balance);

        // then

        assertThat(drinkStatus.getBalanceAfterDrink()).isEqualTo(4.00);

        assertThat(drinkStatus.getBoughtDrinkName()).isEqualTo(DrinkName.COKE);

    }
}
