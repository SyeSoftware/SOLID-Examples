package syesoftware.scrum.solid.singleresponsibility;

public class PlainTextPrinter implements Printer {

	@Override
	public void printPage(Page pageToPrint) {
		System.out.println(pageToPrint.content);

	}

}
