# html5-websocket
http://www.tutorialspoint.com/html5/html5_websocket.htm

### Create Websocket object
```javascript
var Socket = new WebSocket(url, [protocal] );
```

### WebSocket Attributes
- **Socket.readyState** - The readonly attribute readyState represents the state of the connection. It can have the following values:
    - A value of 0 indicates that the connection has not yet been established.
    - A value of 1 indicates that the connection is established and communication is possible.
    - A value of 2 indicates that the connection is going through the closing handshake.
    - A value of 3 indicates that the connection has been closed or could not be opened.

- **Socket.bufferedAmount** - The readonly attribute bufferedAmount represents the number of bytes of UTF-8 text that have been queued using send() method.

### WebSocket Events
- **open** - This event occurs when socket connection is established.
- **message** - This event occurs when client receives data from server.
- **error** - This event occurs when there is any error in communication.
- **close** - This event occurs when connection is closed.

### WebSocket Methods
- **Socket.send()** - The send(data) method transmits data using the connection.
- **Socket.close()** - The close() method would be used to terminate any existing connection.