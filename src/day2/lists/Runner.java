package day2.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();

		nums.add(37);
		nums.add(353);
		nums.add(4353);
		nums.add(46);
		nums.add(35);
		nums.add(46);
//		nums.add(null);

		for (int i = 0; i < nums.size(); i++) {
			Integer num = nums.get(i);
			System.out.println(num);
		}

		System.out.println(nums);
		Collections.sort(nums, (a, b) -> {
			if (a > b)
				return -1;
			else if (a == b)
				return 0;
			else
				return 1;
		});
		System.out.println(nums);

		if (true)
			return;
		ArrayList<Integer> toRemove = new ArrayList<>();
		for (Integer num : nums) {
			System.out.println(num);
			if (num % 2 == 0)
				toRemove.add(num);
		}
		nums.removeAll(toRemove);

		nums.remove(0);
	}

}
