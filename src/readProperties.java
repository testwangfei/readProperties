import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		readProperties rp =new readProperties();
		rp.read();
	}
	public void read() throws FileNotFoundException, IOException{
		Properties p = new Properties();
		InputStream in = this.getClass().getResourceAsStream("/user.properties");
		p.load(in);
		String name =p.getProperty("name").trim();
		System.out.println("name="+name);
		String age =p.getProperty("age").trim();
		System.out.println("age="+age);
	}
}
