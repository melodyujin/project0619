class Test7{
	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);

		//반복문의 범위 : 시작값 n-1, 끝값 n+1
		for(int i=n-1;i<=n+1;i++){
			System.out.println(i);
		}
	}
}
