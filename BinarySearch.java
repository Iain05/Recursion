class Main {
  	public static void main(String[] args) {
    
  	}	
	int binarySearch(int[] arr, int l, int r, int x) {
		{
			if (r >= 1) {
				int mid = l + (r - l) / 2;
				if (arr[mid] == x) 
					return mid;
		
				if (arr[mid] > x) 
					return binarySearch(arr, l, mid - 1, x);
				
				return binarySearch(arr, mid + 1, r, x);
			}
			return -1;
		}
	}
}
