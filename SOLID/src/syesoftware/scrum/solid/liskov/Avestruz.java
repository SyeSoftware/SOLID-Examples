package syesoftware.scrum.solid.liskov;

public class Avestruz extends Bird {

	public void fly(){
		throw new UnsupportedOperationException();
	}
}
