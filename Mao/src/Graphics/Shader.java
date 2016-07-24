package Graphics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Shader {
	
	private String shade;
	
	private int ID;
	
	public Shader(String shaderFile, String type) {
		shade = loadAsString(shaderFile);
		ID = 
	}
	
	public String loadAsString(String file) {
		StringBuilder result = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String buffer = "";
			while ((buffer = reader.readLine()) != null) {
				result.append(buffer);
			}
			reader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
	public String getShader() {
		return shade;
	}
	
	public int getID() {
		return ID;
	}
}
