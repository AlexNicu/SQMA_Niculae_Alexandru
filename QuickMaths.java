import java.util.ArrayList;
import java.util.List;


public class QuickMaths {

	public int sum(int param1, int param2) {
		return param1 + param2;
	}

	public double report(int x, int y) {
		if(y==0){
			throw new IllegalArgumentException();
		}
		return (double)x / y;
	}

	public boolean isEven(int x) {
		return x % 2 == 0;
	}

	public List<Integer> evenNumberList(int n) {
		if(n==0) {
			return null;
		}
		if(n<0){
			throw new IllegalArgumentException();
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(i * 2);
		return list;
	}
}
