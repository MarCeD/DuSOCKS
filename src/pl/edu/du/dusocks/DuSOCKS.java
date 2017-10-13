/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.du.dusocks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fucksocks.client.SocksProxy;
import fucksocks.client.SocksProxyFactory;
import fucksocks.common.SSLConfiguration;
import fucksocks.common.methods.NoAuthencationRequiredMethod;
import fucksocks.common.methods.SocksMethod;
import fucksocks.common.methods.UsernamePasswordMethod;
import fucksocks.server.GenericSocksProxyServer;
import fucksocks.server.SSLSocksProxyServer;
import fucksocks.server.Socks5Handler;
import fucksocks.server.SocksProxyServer;
import fucksocks.server.User;
import fucksocks.server.UsernamePasswordAuthenticator;
import fucksocks.server.filters.IPSessionFilter;
import fucksocks.server.filters.IPSessionFilter.Mode;
import fucksocks.server.filters.SessionFilter;





/**
 *
 * @author Damian Kruzel
 */
public class DuSOCKS {
    
    private static final Logger logger = LoggerFactory.getLogger(DuSOCKS.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port = PORT;
        boolean noneAuth = true;
        int maxConnection = CONNECTION_NUMBER;
        int bufferSize = BUFFER_SIZE;
        int timeout = TIMEOUT;
        List<SessionFilter> sessionFilters = new ArrayList<>();
        List<User> users = new ArrayList<>();
        SocksProxy proxy = null;
        SSLConfiguration configuration = null;
        
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-h")) {
                printUsage();
                System.exit(0);
            }
        }
        
        
    }
    
}
