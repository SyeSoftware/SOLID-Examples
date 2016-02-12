package syesoftware.scrum.solid.openclosed;

public class GraphicEditor {

	public void drawShape(Shape s) {
 		if (s.m_type==1)
 			drawRectangle((Rectangle)s);
 		else if (s.m_type==2)
 			drawCircle((Circle)s);
 	}
 	public void drawCircle(Circle r) {
 		//Implementation code goes here
 	}
 	public void drawRectangle(Rectangle r) {
 		//Implementation code goes here
 	}
}
