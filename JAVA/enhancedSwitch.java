class enhancedswitch {
	public static void main(String[] args){
		int caseId = 7;
		
		String access = switch(caseId){
			case 1 -> "Player";
			case 2 -> "Umpier";
			case 3,7,8 -> "Captain";
			default -> "unknown";
			};
			
		System.out.println(access);
	};
};
