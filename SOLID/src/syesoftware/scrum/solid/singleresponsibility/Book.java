/**
 * Principio de unica responsabilidad
 * La siguiente porción de código atribuye responsabiliddes a una clase libro que van más alla de lo que tradicionalmente se espera que haga.
 * 
 * Problema: Requerimos que las paginas de un libro puedan ser visualizadas en browsers web (HTML), en texto plano y en dispositivos moviles.
 * 
 * ¿Que ajustes tendría que hacer a la clase para que el principio de única responsabilidad no sea violado?
 * 
 */

package syesoftware.scrum.solid.singleresponsibility;



public class Book {

	Page currentPage = new Page();

	public String getTitle(){

		return "Un gran libro";

	}


	public String getAuthor(){

		return "JK Rowling";

	}


	public void turnPage(){
		//pointer to the next page
	}

	public Page getCurrentPage(){
		return currentPage;
	}

	public void printCurrentPage(){

		System.out.println("Contenido de la página");

	}


	public static void main(String[] args) {

		Book newBook = new Book();
		newBook.printCurrentPage(); // (A)


	}
	
}