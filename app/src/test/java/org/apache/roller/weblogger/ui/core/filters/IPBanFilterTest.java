package org.apache.roller.weblogger.ui.core.filters;

import org.junit.Test;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import static org.mockito.Mockito.mock;

public class IPBanFilterTest {

    @Test
    public void x() throws Exception {
        //Given
        IPBanFilter filter = new IPBanFilter();
        ServletRequest servletRequest = mock(ServletRequest.class);
        ServletResponse servletResponse = mock(ServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);

        //When
        filter.doFilter(servletRequest, servletResponse, filterChain);

        //Then
        //TODO
    }

}