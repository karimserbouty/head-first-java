class Randomizer {
	public static void main(String[] args) {

		String[] companyList = {"IBM", "Microsoft", "Oracle", "Red Hat"};
		String[] countryList = {"Canada", "France", "Japan", "USA"};

		int companyLength = companyList.length;
		int countryLength = countryList.length;

		java.util.Random randomGenerator = new java.util.Random();
		
		int companyIndex = randomGenerator.nextInt(companyLength);
		int countryIndex = randomGenerator.nextInt(countryLength);

		String copyright = companyList[companyIndex] +
							" " + countryList[countryIndex] +
							". All rights reserved.";

		System.out.println(copyright);
	}
}