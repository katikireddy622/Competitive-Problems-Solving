package info.katikireddy622.problems;

class Solution {

	int max = -1000;

	public int solution(int[] A) {

		int[] a = A;

		for (int i = 0; i < a.length; i++) {
			path(a, i, i, 0, 0);
		}

		return max;
	}

	public void path(int b[], int i, int j, int count, int count1) {
		if (i == j && count1 == 1) {
			if (max < count)
				max = count;
		} else {
			count++;
			path(b, b[i], j, count, 1);
		}

	}

	public static void main(String[] args) {

		Solution sol = new Solution();
		int x = sol.solution(new int[] { 5, 4, 0, 3, 1, 6, 2 });
		System.out.println(x);
	}
}
