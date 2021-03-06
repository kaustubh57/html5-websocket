package com.kaustubh57.jettyWebsocket;

import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

@SuppressWarnings("serial")
public class EventServlet extends WebSocketServlet
{
    @Override
    public void configure(WebSocketServletFactory factory)
    {
        // factory.getPolicy().setIdleTimeout(10000); // 10 seconds
        factory.register(EventSocket.class);
    }
}