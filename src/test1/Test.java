package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * 测试类
 * @author   佬鬼
 *
 */
public class Test {

	public static void main(String[] args) {
//		Map<String,Student> map = new HashMap<String,Student>();
		
//		Student s1 = new Student(1,"张三1","123234213");
//		Student s2 = new Student(2,"张三2","123234213");
//		Student s3 = new Student(3,"张三3","123234213");
//		Student s4 = new Student(4,"张三4","123234213");
		
//		map.put("zs1", s1);
//		map.put("zs2", s2);
//		map.put("zs3", s3);
//		map.put("zs3", s4);
//		
//		Set<Map.Entry<String, Student>> setmap = map.entrySet();
//		Iterator<Map.Entry<String,Student>> it = setmap.iterator();
//		
//		while(it.hasNext()){
//			Map.Entry<String,Student> entry = it.next();
//			
//			System.out.println(entry.getKey() + "===" + entry.getValue());
//		}
		
		
		//获取map所有的键
		/*Set<String> sets = map.keySet();
		
		for(String s : sets){
			System.out.println(s + "===" + map.get(s));
		}
		
		//获取map所有的值
		for(Student stu : map.values()){
			System.out.println(stu);
		}*/
		
		
		/*List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s);
		}
		
		
		Set<Student> set = new HashSet<Student>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		Iterator<Student> its = set.iterator();
		
		while(its.hasNext()){
			Student s = its.next();
			System.out.println("set===" + s);
		}*/
		
		
		//1.封装Book类,有id,书名,价格等属性
		//2.实例化多个book对象,将这些book对象放入到List泛型集合中,并且循环遍历(三种循环方式都写出来)
		/*Book b1 = new Book(1,"西游记",20.2);
		Book b2 = new Book(2,"三国演义",20.2);
		Book b3 = new Book(3,"红楼梦",20.2);
		Book b4 = new Book(4,"水浒传",20.2);
		
		List<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===================");
		
		for (Book book : list) {
			System.out.println(book);
		}
		
		System.out.println("===================");
		
		Iterator<Book> it = list.iterator();
		while(it.hasNext()){
			Book b =  it.next();
			
			System.out.println(b);
		}*/
		//有学生类Student id,name,tel
		//将多个学生放入到List stuList1,stuList2,stuList3集合中
		//将多个stuList集合放入到map中,这个map表示班级
		//然后循环所有的班级信息
		
		Student s1 = new Student(1,"张三1","123234213");
		Student s2 = new Student(2,"张三2","123234213");
		Student s3 = new Student(3,"张三3","123234213");
		Student s4 = new Student(4,"张三4","123234213");
		Student s5 = new Student(5,"张三5","123234213");
		Student s6 = new Student(6,"张三6","123234213");
		Student s7 = new Student(7,"张三7","123234213");
		Student s8 = new Student(8,"张三8","123234213");
		
		List<Student> list1 = new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		
		List<Student> list2 = new ArrayList<Student>();
		list2.add(s3);
		list2.add(s4);
		list2.add(s5);
		
		List<Student> list3 = new ArrayList<Student>();
		list3.add(s6);
		list3.add(s7);
		list3.add(s8);
		
		Map<String,List<Student>> map = new HashMap<String,List<Student>>();
		map.put("java", list1);
		map.put("js", list2);
		map.put("php", list3);
		
		Set<String> ss = map.keySet();
		
		for (String s : ss) {
			System.out.println("班级名字是:" + s);
			List<Student> l = map.get(s);
			for (Student student : l) {
				System.out.println(student);
			}
		}
		
		
		
	}


}
