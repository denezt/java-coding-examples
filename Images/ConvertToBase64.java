import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets; 
import java.util.Base64;

public class ConvertToBase64 {
	public static void main(String[] args) throws Exception{
        	File f =  new File("iconfinder_system-file-manager_118825.png");
 		String encodstring = encodeFileToBase64Binary(f);
		System.out.println(encodstring);
	}
 
	private static String encodeFileToBase64Binary(File file) throws Exception{
		FileInputStream fileInputStreamReader = new FileInputStream(file);
		byte[] bytes = new byte[(int)file.length()];
		fileInputStreamReader.read(bytes);
		return new String(Base64.getEncoder().encodeToString(bytes));
	}        
}
