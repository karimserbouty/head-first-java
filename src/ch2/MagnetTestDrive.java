class MagnetTestDrive {
	public static void main (String[] args) {	
		Magnet m = new Magnet();
		
		m.playSnare();
		
		m.snare = false;

		if (m.snare == true) {
			m.playSnare();
		}

		m.playTopHat();
	}
}