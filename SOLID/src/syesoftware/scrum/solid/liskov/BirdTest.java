/**
 * Principio de sustitución de liskov
 * La siguiente porción de código viola el principio de sustitución de liskov
 *  
 * Problema: Necesitamos garantizar el adecuado cumplimiento del principio.
 * 
 * ¿Que ajustes tendría que hacer para facilitar que se cumpla el principio?
 */

package syesoftware.scrum.solid.liskov;

import java.util.ArrayList;

public class BirdTest {

	public static void main(String[] args) {
		ArrayList<Bird> birdList = new ArrayList<Bird>();
		    birdList.add(new Bird());
		    birdList.add(new Crow());
		    birdList.add(new Avestruz());
		    letTheBirdsFly( birdList );
	}
	
	public static void letTheBirdsFly(ArrayList<Bird> birdlist){
		for(Bird b : birdlist){
			b.fly();
		}
		
	}

}
