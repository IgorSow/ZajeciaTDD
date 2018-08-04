

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


@Slf4j
public class MyFirstTest {

//    private static Logger log = LoggerFactory.getLogger(MyFirstTest.class);


//    @DisplayName("Single test succesful")
    @Test
    void testingSingleSuccesTest(){
        log.info("succes");

//        assertThat("SAURON").isEqualTo("FRODO");
    }

    @Test
    void shouldCheckIfSauronIsInTeamandSize5(){
        FollowshipOfTheRing followshipOfTheRing1 = new FollowshipOfTheRing();

        assertThat(followshipOfTheRing1.team).hasSize(5)
                .doesNotContain("Sauron");

    }



}
