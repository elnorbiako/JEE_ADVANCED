package pl.coderslab.s2ex1;

public class UrlMain {

    public static void main(String[] args) {

        StandardUrl su1 = new StandardUrl();
        StandardUrl su2 = new StandardUrl();

        System.out.println(su1.getParam("param1", "http://wp.pl?param2=hello&param1=69"));
        System.out.println(su1.getParam("param2", "http://wp.pl?param2=hello&param1=69"));

        ExtendedUrl ex1 = new ExtendedUrl();
        System.out.println(ex1.getParam("param1", "url_example/param1.99/param2.string"));
        System.out.println(ex1.getParam("param2", "url_example/param1.99/param2.string"));

    }
}
