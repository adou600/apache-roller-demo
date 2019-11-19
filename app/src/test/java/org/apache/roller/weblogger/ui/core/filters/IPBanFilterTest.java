package org.apache.roller.weblogger.ui.core.filters;

import org.junit.Test;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.mock;

public class IPBanFilterTest {

    @Test
    public void x() throws Exception {
        //Given
        IPBanFilter filter = new IPBanFilter();
        ServletRequest servletRequest = mock(HttpServletRequest.class);
        ServletResponse servletResponse = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);

        //When
        filter.doFilter(servletRequest, servletResponse, filterChain);

        //Then
        //TODO
    }

}