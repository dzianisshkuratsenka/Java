
public class HM6threee {
	public static void main(String[] args) {
		int[][] a = { { 1, 1, 1}, { 1, 1, 1 }, { 1, 1,1 },  };
		// should be true
		boolean boo=false;;
		for (int i = 0; i < a.length; i++) {
			 
				if (a.length == a[i].length) {
					boo = true;
				} else {
					boo = false;
					break;
				
			}

		}
		System.out.println(boo);
	}
}
