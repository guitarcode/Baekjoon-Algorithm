import java.util.*;

public class BOJ11055 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int A = sc.nextInt();
		int[] arr = new int[A];
		int[] DP = new int[A];
		
		for(int i = 0; i < A; i++) {		
			arr[i] = sc.nextInt();
			//DP[i]�� arr[i]�� ���� ������ �ʱ�ȭ
			//���� �ʱ�ȭ�� ���� ���� �� ���� �迭�� ������ ��� ����迭���� Ŭ ��쿡 ���� �迭���� ���õǴ� ��� �߻�
			DP[i] = arr[i];
		}
		
		DP[0] = arr[0];
		for(int i = 1; i < A; i++) {
			for(int j = 0; j < i; j++) {
				//�����ϴ� �κм����� ���ǿ� ���� arr[i]���� ���� arr[j]��
				if( arr[i] > arr[j] )
					//���� ���� ū DP[j]�� arr[i]�� ���ؼ� ����
					DP[i] = DP[i] < DP[j] + arr[i] ? DP[j] + arr[i] : DP[i];
			}
		}		
		
		int max = 0;
		for(int i = 0; i< A; i++) {
			max = DP[i] > max ? DP[i] : max;
		}
		
		System.out.println(max);		
		
	}

}
