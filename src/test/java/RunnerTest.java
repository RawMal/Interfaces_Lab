import models.Runner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RunnerTest {
    Runner runner;

    @BeforeEach
    public void setUp(){
        runner = new Runner("Dina");
    }

    @Test
    public void canRun(){
        String result = runner.run(2);
        assertThat(result).isEqualTo("Dina ran 2m");
    }

}
