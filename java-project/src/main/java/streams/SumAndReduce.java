// { autofold
package streams;

import java.util.*;

public class SumAndReduce {
// }

	public static int calculate(List<Integer> numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

// { autofold
}
// }