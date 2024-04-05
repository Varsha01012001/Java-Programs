package ObjectandWrapper;

public class AutoBoxinUnBoxing {
	public static void main(String []args) {
      int a = 10;
      
      Integer obj1 = a;                          //AutoBoxing: primitive - object
      
      Integer obj3 = Integer.valueOf(a);        // before java5
      
      Integer obj2 = new Integer(20);
      
      int b= obj2;                              //UnBoxing : object - primitive
      
      int c=obj2.intValue();                   //before java5
      
      
	}

}
