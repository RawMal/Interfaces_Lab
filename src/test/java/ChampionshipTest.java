import models.Championship;
import models.Swimmer;
import models.Triathlete;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChampionshipTest {

    Championship championship;
    Swimmer swimmer;
    Triathlete triathlete;

    @BeforeEach
    public void setUp(){
        championship = new Championship("World Athletics");
        swimmer = new Swimmer("Jane");
        triathlete = new Triathlete("Kevin");
    }

    @Test
    public void canAddSwimmingAthleteToChampionship(){
        championship.addSwimmer(swimmer);
        championship.addSwimmer(triathlete);
        int expected = 2;
        int actual = championship.getSwimmers().size();
        assertThat(championship.getSwimmers().size()).isEqualTo(2);
        System.out.println(championship.getSwimmers());
    }




}
