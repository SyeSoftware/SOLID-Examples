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

	/* A) Escenario Común
	public Page printCurrentPage(){

		System.out.println("Contenido de la página");

	}
	*/



	public static void main(String[] args) {

	Book newBook = new Book();
	//newBook.printCurrentPage(); // (A)
	
	/*
	HtmlPrinter webBrowser = new HtmlPrinter();
	PlainTextPrinter textPrinter = new PlainTextPrinter();
	webBrowser.printPage(newBook.getCurrentPage());
	textPrinter.printPage(newBook.getCurrentPage());*/

	}
	
}