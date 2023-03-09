package ch13.lecture.p01generic;

public class C01Generic {
	public static void main(String[] args) {
		//제네릭이 없던 시절 코드
		MyClass01 o1 = new MyClass01();
		o1.setItem("java");
		
		//위험한 코드
	   String s1 = (String)o1.getItem();
	   
	   String s2 = null;
	   Object o2 = o1.getItem();
	   
	   if (o2 instanceof String) {
		   s1 = (String) o2;
	   }
	   
	   if (s1 != null) {
		   System.out.println(s1.length());
	   }
	}
}

class MyClass01 {
	private Object item;
	//필드의 타입이 결정되지않았을때 object를 사용했음
	//모든타입이 다가능
	public Object getItem() {
		return item;
	}
	
	public void setItem(Object item) {
		this.item = item;
	}
}