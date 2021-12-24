package project9;

public class Book {
	private static int bookNums;
	private int bookId=0;//���
	private String bookName;//����
	private String press;//������
	private double price;//����
	public Book(String bookName,double price,String press) {
		this.bookNums++;
		bookId=bookNums;
		this.bookName=bookName;
		this.price=price;
		this.press=press;
	}
	public void showBook() {
		System.out.println(bookId+" "+bookName+" "+price+"Ԫ "+press);
	}
	public void setBookName(int bookId) {
		this.bookId=bookId;
	}
	public void setBookId(String bookName) {
		this.bookName=bookName;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setPress(String press) {
		this.press=press;
	}
	
	public int getBookId() {
		return this.bookId;
	}
	public String getBookName() {
		return this.bookName;
	}
	public double getPrice() {
		return this.price;
	}
	public String getPress() {
		return this.press;
	}
	
}
