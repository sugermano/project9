package project9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapBookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book> books=new HashMap<Integer,Book>();
		Book book1 = new Book("《钢铁是怎样炼成的》",35,"人民邮电出版社");
		Book book2 = new Book("《海的女儿》",30,"人民邮电出版社");
		Book book3 = new Book("《新华字典》",40,"中国商务出版社");
		Book book4 = new Book("《现代操作系统》",60,"机械工业出版社");
		books.put(book1.getBookId(), book1);
		books.put(book2.getBookId(), book2);
		books.put(book3.getBookId(), book3);
		books.put(book4.getBookId(), book4);
		
		System.out.println("MapDemo:");
		Iterator it = books.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			((Book)entry.getValue()).showBook();
		}
	}

}
