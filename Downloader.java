import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Downloader {
	public static void download(String src, String dest) {
    try {
  		URL url = new URL(src);
  		InputStream i = url.openStream();
  		OutputStream o = new FileOutputStream(dest);

  		byte[] b = new byte[2048];
  		int length;

  		while ((length = i.read(b)) != -1) {
  			o.write(b, 0, length);
  		}

  		i.close();
  		o.close();
    } catch (IOException E) {
      System.out.println("error while downloading: " + src);
    }
	}

}
