package jump2java;

public class TestStringBuffer {
	public static void main(String[] args) {
		// append method
        StringBuffer sb = new StringBuffer();
        sb.append("1. hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());
        
        // insert method
        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0, "2. hello ");
        System.out.println(sb2.toString());
        
        // substring method
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Hello jump to java");
        System.out.println(sb3.substring(0, 4));
    }
}
