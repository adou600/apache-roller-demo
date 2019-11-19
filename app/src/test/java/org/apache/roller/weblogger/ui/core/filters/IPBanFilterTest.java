package org.apache.roller.weblogger.ui.core.filters;

import org.junit.Test;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.*;

public class IPBanFilterTest {

    @Test
    public void x() throws Exception {
        //Given
        IPBanFilter filter = spy(new IPBanFilter());
        HttpServletRequest servletRequest = mock(HttpServletRequest.class);
        HttpServletResponse servletResponse = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);

        final String remoteAddress = "http://any.remote.org";
        when(servletRequest.getRemoteAddr()).thenReturn(remoteAddress);
        when(filter.isBanned(remoteAddress)).thenReturn(true);

        //When
        filter.doFilter(servletRequest, servletResponse, filterChain);

        //Then
        verify(servletResponse).sendError(HttpServletResponse.SC_NOT_FOUND);
        verify(filter).isBanned(remoteAddress);
    }

}