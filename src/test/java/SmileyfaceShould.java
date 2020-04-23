import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmileyfaceShould {

   @Test
    public void not_allow_building_without_eyes() {

       Assertions.assertThrows(MissingEyesException.class, ()-> new Smileyface.SmileyfaceBbuilder()
               .build());
    }
}
