// isComment
package org.sipdroid.net;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import org.ice4j.socket.DatagramSocketFactory;

public class isClassOrIsInterface implements DatagramSocketFactory {

    @Override
    public DatagramSocket isMethod() throws SocketException {
        return new SipdroidSocket();
    }
}
