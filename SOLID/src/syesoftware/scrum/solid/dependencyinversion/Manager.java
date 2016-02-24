package syesoftware.scrum.solid.dependencyinversion;

public class Manager {
	Worker worker;
	
	public void setWorker(Worker w){
		worker = w;
	}
	
	public void manage(){
		worker.work();
	}
	
}
