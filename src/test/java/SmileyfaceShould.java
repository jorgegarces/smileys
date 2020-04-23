import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmileyfaceShould {

  @Test
  public void not_allow_building_without_eyes() {

    Assertions.assertThrows(MissingEyesException.class, () -> new Smileyface.SmileyFaceBuilder()
        .build());
  }

  @Test
  public void not_allow_building_with_invalid_eyes() {

     Assertions.assertThrows(InvalidEyesException.class, ()-> new Smileyface.SmileyFaceBuilder()
     .eyes("X")
     .build());
  }

  @Test
  public void not_allow_building_with_invalid_nose() {

    Assertions.assertThrows(InvalidNoseException.class, ()-> new Smileyface.SmileyFaceBuilder()
            .eyes(":")
            .nose("@")
            .build());
  }
}
