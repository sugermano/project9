package project9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> arrbooks=new ArrayList<Book>();
		LinkedList<Book> listbooks=new LinkedList<Book>();
		Book book1 = new Book("《钢铁是怎样炼成的》",35,"人民邮电出版社");
		Book book2 = new Book("《海的女儿》",30,"人民邮电出版社");
		Book book3 = new Book("《新华字典》",40,"中国商务出版社");
		Book book4 = new Book("《现代操作系统》",60,"机械工业出版社");
		
		arrbooks.add(book1);
		arrbooks.add(book2);
		arrbooks.add(book3);
		arrbooks.add(book4);
		
		listbooks.push(book1);
		listbooks.push(book2);
		listbooks.push(book3);
		listbooks.push(book4);
		
		System.out.println("ArrayListDemo:");
		Iterator<Book> arrIt = arrbooks.iterator();
		while(arrIt.hasNext()) {
			Book book = (Book)arrIt.next();
			book.showBook();
		}
		System.out.println("LinkedListDemo:");
		Iterator<Book> listIt = listbooks.iterator();
		while(listIt.hasNext()) {
			Book book = (Book)listIt.next();
			book.showBook();
		}
	}

}
