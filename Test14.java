class Test14 {
	public static void main(String[] args) {
		//파일명 뿐만 아니라, 디렉토리 경로까지 포함된 문자열에서 확장자만 추출하기
		// d:/html_workspace/day06.13/mario.png
		String path="d:/html_workspace/day06.13/mario.png ";

		int index=path.lastIndexOf("."); //가장 마지막 점의 index 위치 반환
		System.out.println("마지막 점의 위치는 "+index);

		String result=path.substring(index+1, path.length());
		System.out.println("확장자는 "+result);
	}
}
