
public class sort2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		System.out.println("Befor sort");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		sort(matrix);
		System.out.println("after sort");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static void sort(int m[][]) {

		for (int i = 0; i < m.length - 1; i++) {
			int minIndex = i;
			int minCurrent = m[i][0];

			for (int j = i + 1; j < m.length; j++) {
				if (minCurrent > m[j][0] || minCurrent == m[j][0] && m[minIndex][1] > m[j][1]) {
					minCurrent = m[j][0];
					minIndex = j;
				}

			}
			if (minIndex != i) {
				int tempL = m[minIndex][0];
				m[minIndex][0] = m[i][0];
				m[i][0] = tempL;

				int tempR = m[minIndex][1];
				m[minIndex][1] = m[i][1];
				m[i][1] = tempR;

			}

		}

	}
}
