package test1;
/**
 * 学生类 
 * 实现Comparable接口
 * @author   佬鬼
 *
 */
public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private String tel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Student(int id, String name, String tel) {
		this.id = id;
		this.name = name;
		this.tel = tel;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", tel=" + tel + "]";
	}
	
	public int compareTo(Student o) {
		if(this.getId() < o.getId()){
			return -1;
		}
		else if(this.getId() > o.getId()){
			return 1;
		}
		else{
			return 0;
		}
		
	}
	
	
}
