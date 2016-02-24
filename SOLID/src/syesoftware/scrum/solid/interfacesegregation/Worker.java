package syesoftware.scrum.solid.interfacesegregation;

public class Worker implements IWorker{

	@Override
	public void work() {
		System.out.println("Human is working here");
		
	}

	@Override
	public void eat() {
		System.out.println("Human is eating here");
		
	}

}
