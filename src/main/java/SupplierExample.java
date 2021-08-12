import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<List<String>> urls = getDBConnectionUrls();
        System.out.println(urls.get());
    }

    static Supplier<List<String>> getDBConnectionUrls() {
        return () -> List.of("http://localhost:8080", "http://www.google.com");
    }

}
