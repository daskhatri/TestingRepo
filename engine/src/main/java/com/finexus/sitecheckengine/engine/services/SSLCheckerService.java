package com.finexus.sitecheckengine.engine.services;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import java.security.KeyManagementException;

import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.CertificateEncodingException;



public class SSLCheckerService {
	
	public static void main(String arg[]) throws KeyManagementException, NoSuchAlgorithmException, UnknownHostException, IOException, CertificateException, CertificateEncodingException {

		
		
		SSLContext sslContext = SSLContext.getInstance("TLS");
		/**
		 * The below X509TrustManager needs 3 methods to implement:
		 * - javax.net.ssl.X509TrustManager.checkClientTrusted()
		 * - javax.net.ssl.X509TrustManager.checkServerTrusted()
		 * - javax.net.ssl.X509TrustManager.getAcceptedIssuers()
		 */
		X509TrustManager passthroughTrustManager = new X509TrustManager() {		

			@Override
			public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public X509Certificate[] getAcceptedIssuers() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		sslContext.init(null, new TrustManager[] { passthroughTrustManager }, null);

		
		//Create a socket, connect and start the handshake explicitly (since you're not really going to read from it)
		
		SSLSocketFactory ssf = sslContext.getSocketFactory();		
		SSLSocket socket = (SSLSocket) ssf.createSocket("www.ginsoy.com", 443);

	/*		
	 * Starts an SSL handshake on this connection. Common reasons include a need to use new encryption keys, to change cipher suites, 
	 * or to initiate a new session. To force complete reauthentication, the current session could be invalidated before starting this 
	 * handshake.
	 * If data has already been sent on the connection, it continues to flow during this handshake. When the handshake completes, 
	 * this will be signaled with an event. This method is synchronous for the initial handshake on a connection and returns 
	 * when the negotiated handshake is complete. Some protocols may not support multiple handshakes on an existing socket 
	 * and may throw an IOException.
	*/
		socket.startHandshake(); //startHandshake();
		
		/*
		 * Returns the address to which the socket is connected. If the socket was
		 * connected prior to being closed, then this method will continue to return the
		 * connected address after the socket is closed. 
		 * Returns:
		 * the remote IP address to which this socket is connected, or null if the socket is not connected.
		 */
		InetAddress iNetAddress = socket.getInetAddress();
		System.out.println(" The iNetAddress: " + iNetAddress
		+ "\r The local Host from inetAddress: " + iNetAddress.getLocalHost()
		+ "\r The HostAddress: " + iNetAddress.getHostAddress()
		+ "\r The CanonicalHostName: " + iNetAddress.getCanonicalHostName()
		
				);
		SocketChannel socketChannel = socket.getChannel();
		System.out.println(" ********************* Socket Channel ************************************"
				+ "\r The socketChannel: " + socketChannel
			//	+ "\r The localAddress: " + socketChannel.getLocalAddress()
				+ "\r The HostAddress: " + socketChannel.getRemoteAddress()
				);
				
		InetAddress localAddress = socket.getLocalAddress();
		
		/*
		 * Returns the local port number to which this socket is bound. If the socket
		 * was bound prior to being closed, then this method will continue to return the
		 * local port number after the socket is closed. 
		 * Returns:
		 * the local port number to which this socket is bound or -1 if the socket is not bound yet.
		 */
		int localPortNum = socket.getLocalPort();
		
		//socket.getReceiveBufferSize();//int
		//socket.getSupportedCipherSuites();
	} 
	
}// end of class PingStatus 





















/*	 // private static final String URL = "https://www.google.com";
private static final String URL = "https://httpbin.org/user-agent";
  
  public static void main(String[] args) throws IOException {
	URLConnection conn = connect(URL);

	if (conn != null) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
	    String input;

	    while ((input = br.readLine()) != null) {
	      System.out.println(input);
	    } 
	  }
    }
  }

  public static URLConnection connect(String url) {
    URLConnection conn = null;
    
	try {
	  conn = new URL(url).openConnection();
	} catch (MalformedURLException e) {
      e.printStackTrace();
	} catch (IOException e) {
	  e.printStackTrace();
	}

	return conn;
  }
*/		
