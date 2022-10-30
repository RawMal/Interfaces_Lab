import models.Swimmer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SwimmerTest {

    Swimmer swimmer;

    @BeforeEach
    public void setUp(){
        swimmer = new Swimmer("Missy");
    }

    @Test
    public void canSwim(){
        String result = swimmer.swim(4);
        assertThat(result).isEqualTo("Missy swam 4m");
    }

}
