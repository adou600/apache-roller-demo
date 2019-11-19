package org.apache.roller.weblogger.ui.core.filters;

import org.apache.roller.weblogger.util.IPBanList;
import org.junit.Test;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class IPBanFilterTest {

    @Test
    public void x() throws Exception {
        //Given
        IPBanFilter filter = spy(new IPBanFilter());
        ServletRequest servletRequest = mock(HttpServletRequest.class);
        ServletResponse servletResponse = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);

        final String remoteAddress = "http://any.remote.org";
        when(servletRequest.getRemoteAddr()).thenReturn(remoteAddress);
        when(filter.isBanned(remoteAddress)).thenReturn(true);

        //When
        filter.doFilter(servletRequest, servletResponse, filterChain);

        //Then
        //TODO
    }

}