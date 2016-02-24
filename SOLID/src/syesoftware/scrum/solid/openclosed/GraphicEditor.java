/**
 * Principio Open-Closed
 * La siguiente porción de código no favorece a que el principio de open-closed sea llevado acabo
 * 
 * Problema: Requerimos dibujar nuevas figuras como serian un triangulo y un pentagono
 * 
 * ¿Que ajustes tendría que hacer al código para que el principio open closed sea respetado en caso de querer dibujar un triangulo o un pentagono?
 * 
 * 
 * 
 */

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
