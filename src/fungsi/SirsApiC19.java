package fungsi;

import AESsecurity.EnkripsiAES;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Properties;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.web.client.RestTemplate;

public class SirsApiC19 {        
    private static final Properties prop = new Properties();
    private String Key,Consid;
    private long GetUTCdatetimeAsString;
    private String salt,pass;
    private String generateHmacSHA256Signature;
    private byte[] hmacData;
    private Mac mac;
    private long millis;
    private SSLContext sslContext;
    private SSLSocketFactory sslFactory;
    private SecretKeySpec secretKey;
    private Scheme scheme;
    
    private HttpComponentsClientHttpRequestFactory factory;
    public SirsApiC19(){
        try {            
            prop.loadFromXML(new FileInputStream("setting/database.xml"));   
            pass = koneksiDB.PASSSIRSC19();
        } catch (Exception ex) {
            System.out.println("Notifikasi : "+ex);
        }
    }
    
 public long GetUTCdatetimeAsString(){    
        millis = System.currentTimeMillis();   
        return millis/1000;
    }
    
    
    
   public RestTemplate getRest() throws NoSuchAlgorithmException, KeyManagementException {
        sslContext = SSLContext.getInstance("SSL");
        TrustManager[] trustManagers= {
            new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {return null;}
                public void checkServerTrusted(X509Certificate[] arg0, String arg1)throws CertificateException {}
                public void checkClientTrusted(X509Certificate[] arg0, String arg1)throws CertificateException {}
            }
        };
        sslContext.init(null,trustManagers , new SecureRandom());
        sslFactory=new SSLSocketFactory(sslContext,SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        scheme=new Scheme("https",443,sslFactory);
        factory=new HttpComponentsClientHttpRequestFactory();
        factory.getHttpClient().getConnectionManager().getSchemeRegistry().register(scheme);
        return new RestTemplate(factory);
    }

}
