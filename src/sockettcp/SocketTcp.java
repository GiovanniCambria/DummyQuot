/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sockettcp;

/**
 *
 * @author debug
 */
public class SocketTcp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws java.io.IOException {
        String[] argsserver = {"8000"};
        //String[] argsclient = {"localhost", "prova", "8000"};
        TCPQuoteServer.main(argsserver);
        //TCPEchoClient.main(argsclient);
    }
}
