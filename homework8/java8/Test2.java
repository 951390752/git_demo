package java8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
 
public class Test2 {
	int id;
	String name;
	int age;
	String sex;
 
	public Test2(int id, String name, int age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + "]";
	}
 
	public static void listToMap() {
		Test2 s1 = new Test2(101, "����", 20, "��");
		Test2 s2 = new Test2(102, "����", 23, "��");
		Test2 s3 = new Test2(103, "��÷", 21, "Ů");
		Test2 s4 = new Test2(104, "����", 24, "��");
		Test2 s5 = new Test2(105, "�Ƿ�", 19, "Ů");
		List<Test2> ar = new ArrayList<Test2>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		ar.add(s5);
		HashMap<Integer, Test2> hm = new HashMap<Integer, Test2>();
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			hm.put(ar.get(i).id, ar.get(i));
		}
		System.out.println("====ListתMap====");
		Set<Entry<Integer, Test2>> en = hm.entrySet();
		for (Entry<Integer, Test2> k : en) {
			System.out.println("key:" + k.getKey() + ",value" + k.getValue());
		}
 
	}
 
	public static void mapToList() {
		Test2 s1 = new Test2(1, "����", 20, "��");
		Test2 s2 = new Test2(2, "����", 23, "��");
		Test2 s3 = new Test2(3, "��÷", 21, "Ů");
		Test2 s4 = new Test2(4, "����", 24, "��");
		Test2 s5 = new Test2(5, "�Ƿ�", 19, "Ů");
		LinkedHashMap<Integer, Test2> hm = new LinkedHashMap<Integer, Test2>();
		hm.put(s1.id, s1);
		hm.put(s2.id, s2);
		hm.put(s3.id, s3);
		hm.put(s4.id, s4);
		hm.put(s5.id, s5);
		System.out.println(hm);
		System.out.println("====MapתList====");
		ArrayList<Test2> students = new ArrayList<Test2>();
		for (int i = 1; i <= hm.size(); i++) {
			students.add(hm.get( i));
		}
 
		for (Test2 student : students) {
			System.out.println(student);
		}
 
	}
 
	public static void main(String[] args) {
		listToMap();
		System.out.println("=====================================");
		mapToList();
	}
}
