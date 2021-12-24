package project9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapBookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book> books=new HashMap<Integer,Book>();
		Book book1 = new Book("���������������ɵġ�",35,"�����ʵ������");
		Book book2 = new Book("������Ů����",30,"�����ʵ������");
		Book book3 = new Book("���»��ֵ䡷",40,"�й����������");
		Book book4 = new Book("���ִ�����ϵͳ��",60,"��е��ҵ������");
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
