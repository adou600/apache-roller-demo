package org.apache.roller.weblogger.ui.rendering.plugins.comments;

import org.junit.Test;

import javax.servlet.ServletException;
import java.io.IOException;

public class AkismetCommentValidatorTest {

    @Test
    public void x() throws IOException, ServletException {
        //Given
        AkismetCommentValidator validator = new AkismetCommentValidator();
        //TODO: start here

        //When
        int result = validator.validate(null, null);

        //Then

    }

}