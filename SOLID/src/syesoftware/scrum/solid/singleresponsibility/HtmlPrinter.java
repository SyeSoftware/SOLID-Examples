package syesoftware.scrum.solid.singleresponsibility;

public class HtmlPrinter implements Printer {

	@Override
	public void printPage(Page pageToPrint) {
		System.out.println("<div style='single-page'>"+pageToPrint.content+"</div>");

	}

}
