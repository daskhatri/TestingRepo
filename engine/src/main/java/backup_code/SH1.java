package backup_code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.security.cert.CertificateEncodingException;
import javax.xml.bind.DatatypeConverter;

public class SH1 {
	public static void main(String args[]) throws CertificateException, FileNotFoundException, NoSuchAlgorithmException, CertificateEncodingException {
	// Thumb print section
			 FileInputStream is = new FileInputStream(args[0]);
		     CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
		     X509Certificate cert = (X509Certificate) certificateFactory.generateCertificate(is);
		     String thumbprint = getThumbprint(cert);
		     System.out.println("The Thumbprint is: \r" + thumbprint);
		     
	}// end of main method
	
	private static String getThumbprint(X509Certificate cert)
		    	        throws NoSuchAlgorithmException, CertificateEncodingException {
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		byte[] der = null;
		try {
			der = cert.getEncoded();
		    } catch (java.security.cert.CertificateEncodingException e) {
		    	e.printStackTrace();
		    	}
		md.update(der);
		byte[] digest = md.digest();
		String digestHex = DatatypeConverter.printHexBinary(digest);
		return digestHex.toLowerCase();
	}

}// end of class SH1

