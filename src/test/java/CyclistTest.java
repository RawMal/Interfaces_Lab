import models.Cyclist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CyclistTest {

        Cyclist cyclist;

        @BeforeEach
        public void setUp(){
            cyclist = new Cyclist("Victoria");
        }

        @Test
        public void canCycle(){
            String result = cyclist.cycle(50);
            assertThat(result).isEqualTo("Victoria cycled 50m");
        }


}



