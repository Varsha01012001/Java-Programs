package loops;

public class looping {
	
	Public static void main(string[]arg) {
	int i;
	System.out.println("break example");
	for(i=1;i<=10;i++)
	{
		if(i==5)
			break;
		System.out.println(i+" ");

}
	System.out.println("\ncontinue example");
	for(i=1;i<=10;i++) {
		if(i==5)
			continue;
		System.out.println(i+" ");
	}
}
}