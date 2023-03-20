package com.example.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.misc.Unsafe;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("how are you");
		System.out.println("hello world");
		System.out.println("i'm fine");
		Unsafe ss;
	}

	@Test
	public void testHtml(){
		String html = "<html><head><title>First parse</title></head>"
				+ "<body><p>Parsed HTML into a doc.</p><img src='/lib/img.png'/><img src='/lib/img.png'/><img src='/lib/img.png'/><img src='/lib/img.png'/></body></html>";
		Document doc = Jsoup.parse(html);
		Elements select = doc.select("img[src]");
		System.err.println(select.attr("src"));

	}


}
