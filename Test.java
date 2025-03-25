	public static void main(String[] args) {
		
		String str = "TestUser_24_03_10;TestUser_24_03_11";
		String strArray [] = str.split(";");
		List<String> strList = Stream.of(strArray).collect(Collectors.toList());
		System.out.println(strList);
	}
