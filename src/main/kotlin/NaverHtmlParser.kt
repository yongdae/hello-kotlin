
import org.jsoup.Jsoup
import org.jsoup.nodes.Document


class NaverHtmlParser {
    fun read() {
        val document: Document = Jsoup.connect("https://www.naver.com").get()

        document.select("p")
            .forEach(System.out::println)
    }
}