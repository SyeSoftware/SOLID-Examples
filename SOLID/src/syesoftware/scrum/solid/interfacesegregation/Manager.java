/**
 * Principio de segregación de interfaces
 * La siguiente porción de código viola el principio de segregación de interfaces dado que atribuye responsabilidades que no necesitan algunas clases
 * 
 * ¿Que ajustes tendría que hacer a las clases para garantizar que las clases usen unicamente las interfaces que necesitan?
 */

package syesoftware.scrum.solid.interfacesegregation;

public class Manager {

	IWorker worker;
	
	public void setWorker(IWorker w){
		worker = w;
	}
	
	public void manage(){
		worker.work();
	}
	
}
