import processing.core.PApplet;
import processing.core.PConstants;
import remixlab.proscene.AWTDesktopEvents;
import remixlab.proscene.Scene;


public class MainApplet extends PApplet{
	/**
	 * Serial por defecto
	 */
	private static final long serialVersionUID = 1L;
	
	private Scene scene;

	@Override
	public void setup() {
		size(640, 480);
		scene = new Scene(this);
	}
	
	@Override
	public void draw() {
		scene.beginScreenDrawing();
		
		scene.parent.background(0);
		fill(255,0,0);
		rect(50, 50, 100, 100);
		fill(0,255,0);
		ellipse(200, 200, 50, 50);
		fill(0,0,255);
		translate(300, 400);
		beginShape();
		vertex(0, 0);
		vertex(80, 80);
		vertex(0, 80);
		endShape(PConstants.CLOSE);
		
		// En 2d la escena maneja un puerto de vista y no una camara
		scene.viewWindow();
		
		scene.endScreenDrawing();
		
		noLoop();
	}

}
