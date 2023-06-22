class Test10 {
	public static void main(String[] args) {
		for(int a=1;a<=5;a++){
			for(int i=1;i<=5;i++){ //5호수
				if(a==i){ //층수와 호수가 같은 값이라면..
					System.out.print("★");
				}else{
					System.out.print("☆");
				}
			}
			System.out.println(); //층수만큼 줄바꿈..
		}
	}
}
