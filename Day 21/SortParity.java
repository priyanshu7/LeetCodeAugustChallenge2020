package august2020;

public class SortParity {
	
	public int[] sortArrayByParity(int[] A) {
        int i = 0, j = 0;
        for(; j < A.length;){
            if(A[j]%2 == 0){
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
                i++; j++;
            }else{
                j++;
            }
        }
        return A;
    }

}
