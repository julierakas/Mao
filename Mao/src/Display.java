import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

public class Display {
	
	private long window;
	
	public Display() {
		init();
	}
	
	public void init() {
		
		if (glfwInit() != true) {
		    System.err.println("Error initializing GLFW");
		    System.exit(1);
		}
		
		window = glfwCreateWindow(1280, 720, "Mao", 0, 0);
		
		if (window == Null) {
		    System.err.println("Error creating a window");
		    System.exit(1);
		}
		
		glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GL_TRUE);
		glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);
		
	}
	
	public void terminate() {
		
		glfwDestroyWindow(window);
		
		glfwTerminate();
		
	}
	
	
}
