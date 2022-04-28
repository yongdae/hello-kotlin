
import org.jsoup.Jsoup
import org.jsoup.nodes.Document


private const val SITE_URL = "https://www.naver.com"

class NaverHtmlParser {
    fun read() {
        val document: Document = Jsoup.connect(SITE_URL).get()

        document.select("p")
            .forEach(System.out::println)
    }

    fun readWithOption() {
        val document: Document = Jsoup.connect(SITE_URL)
            .header("meta", "xyz123")
            .timeout(5000)
            .userAgent("Mozilla")
            .cookie("cookiename", "usejsoup")
            .referrer("https://www.google.com")
            .get();

        document.select("p")
            .forEach(System.out::println)
    }
}