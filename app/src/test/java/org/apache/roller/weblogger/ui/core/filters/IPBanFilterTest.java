package org.apache.roller.weblogger.ui.core.filters;

import org.junit.Test;

import javax.servlet.ServletException;
import java.io.IOException;

import static org.junit.Assert.*;

public class IPBanFilterTest {

    @Test
    public void x() throws Exception {
        //Given
        IPBanFilter filter = new IPBanFilter();

        //When
        filter.doFilter(null, null, null);

        //Then
        //TODO
    }

}