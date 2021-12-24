package project9;


public class Student implements Comparable{
	private String id;
	private String name;
	private int age;
	public Student(String id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	//根据年龄升序排序
    public int compareTo(Object o) {
        if (!(o instanceof Student))
            throw new RuntimeException("不是Student对象");
        Student p = (Student) o;
        if (this.age > p.age)
            return 1;
        if (this.age == p.age){
            return this.name.compareTo(p.name);
        }
        return -1;
    }
	public void showStudent() {
		System.out.println(id+" "+name+" "+age+"岁");
	}
}
