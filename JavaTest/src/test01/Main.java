package test01;

public class Main {
// 1. 선택 정렬
//	public int[] solution (int n, int[] arr)
//	{
//		for (int i=0; i < n-1; i++)
//		{
//			int idx = 1;
//			for (int j=i+1; j<n; j++)
//			{
//				if (arr[j]< arr[idx])
//					idx = j;
//			}
//			int tmp = arr[i];
//			arr[i] = arr[idx];
//			arr[idx] = tmp;
//		}
//		return arr;
//	}
// 2. 버블 정렬
//	public int[] solution (int n, int[] arr)
//	{
//		for (int i=0; i < n-1; i++)
//		{
//			for (int j=0; j <n-i-1; j++)
//			{
//				int tmp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = tmp;
//			}
//		}
//		return arr;
//	}
// 3. 삽입 정렬
//	public int[] solution (int n, int[] arr)
//	{
//		for (int i=1; i<n; i++)
//		{
//			int tmp = arr[i], j;
//			for (j=i-1; j>=0; j--)
//			{
//				if (arr[j]>tmp)
//					arr[j+1] = arr[j];
//				else
//					break;
//			}
//			arr[j+1] = tmp;
//		}
//		return arr;
//	}
// 4. LRU
	public int[] solution (int size, int n, int[] arr)
	{
		int[] cache = new int[size];
		for (int x : arr)
		{
			int pos = -1;
			for (int i=0; i<size; i++)
				if (x == cache[i])
					pos = i;
			if (pos == -1)
			{
				for (int i=size-1; i>=1; i--)
				{
					cache[i] = cache[i-1];
				}
			}
			else
			{
				for (int i=pos; i>=1; i--)
				{
					cache[i] = cache[i-1];
				}
			}
			cache[0] = x;
		}
		return cache;
	}
//	public static void main(String[] args) {
//		Main T = new Main();
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i=0; i < n; i++)
//			arr[i] = sc.nextInt();
//		for (int x : T.solution(n, x, arr))
//			System.out.println(x + " ");
//	}
}

