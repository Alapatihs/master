package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderfile {

	public static Properties prop;
	public static Properties readPropertiesFile() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/main/resources/configuration.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

		} catch (IOException e) {
			// TODO Auto-generated catch block

		}
		return prop;
	}
}
