import models.Triathlete;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TriathleteTest {

    Triathlete triathlete;

    @BeforeEach
    public void setUp(){
        triathlete = new Triathlete("Alistair");
    }

    @Test
    public void canSwim(){
        String result = triathlete.swim(4);
        assertThat(result).isEqualTo("Alistair swam 4m from the start");
    }

    @Test
    public void canCycle(){
        String result = triathlete.cycle(50);
        assertThat(result).isEqualTo("Alistair cycled 50m after swimming");
    }

    @Test
    public void canRun(){
        String result = triathlete.run(6);
        assertThat(result).isEqualTo("Alistair ran 6m after cycling");
    }

}
