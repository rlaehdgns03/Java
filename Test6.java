
public class Test6 {

	public static void main(String[] args) {
		int i=2;
		System.out.println("구구단 출력");
		
		while(i<=9)
		{
			int j=1;
			while(j<=9)
			{
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}
			i++;
		}

	}

}
