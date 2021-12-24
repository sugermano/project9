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
		Book book1 = new Book("���������������ɵġ�",35,"�����ʵ������");
		Book book2 = new Book("������Ů����",30,"�����ʵ������");
		Book book3 = new Book("���»��ֵ䡷",40,"�й����������");
		Book book4 = new Book("���ִ�����ϵͳ��",60,"��е��ҵ������");
		
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
