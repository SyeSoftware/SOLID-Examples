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
