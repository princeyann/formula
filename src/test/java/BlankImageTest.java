import image.BlankImage;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class BlankImageTest {
  @Test
  public void testBlankImageGetWidth(){
    BlankImage blankImage = new BlankImage(200, 300);
    assertThat(blankImage.getWidth(), is(equalTo(200)));
  }

  @Test
  public void testBlankImageGetHeight(){
    BlankImage blankImage = new BlankImage(200, 300);
    assertThat(blankImage.getHeight(), is(equalTo(300)));
  }

  @Test
  public void testBlankImageGetPixelColor(){
    BlankImage blankImage = new BlankImage(200, 300);
    assertThat(blankImage.getPixelColor(0,0), is(equalTo(Color.WHITE)));
    assertThat(blankImage.getPixelColor(100,100), is(equalTo(Color.WHITE)));
    assertThat(blankImage.getPixelColor(199,299), is(equalTo(Color.WHITE)));
  }

}
