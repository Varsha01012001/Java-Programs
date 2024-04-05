package basic.java8features;
interface Sayable{
	String say(String str);
}
public class LambdaEx2 {

	public static void main(String[] args) {
		Sayable s1 = (name) -> "Hello"+name;
		System.out.println(s1.say("Varsha!"));
		
		Sayable s2 = (msg)->{
			return "Message : "+msg;
		};
		System.out.println(s2.say("Learning Java 8 feature!"));
	}

}
