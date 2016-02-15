package syesoftware.scrum.solid.interfacesegregation;

public class Robot implements IWorker {

	@Override
	public void work() {
		System.out.println("Robot Working");

	}

	@Override
	public void eat() {
		System.out.println("Robots don't eat");

	}

}
