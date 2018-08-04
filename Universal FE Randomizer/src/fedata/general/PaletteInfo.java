package fedata.general;

public class PaletteInfo {
	long paletteOffset;

	int[] hairColorOffsets; // Lightest to Darkest
	int[] primaryColorOffsets; // Lightest to Darkest
	int[] secondaryColorOffsets; // Lightest to Darkest
	int[] tertiaryColorOffsets; // Lightest to Darkest
	
	public PaletteInfo(long offset, int hairStart, int hairCount, int primaryStart, int primaryCount) {
		this.paletteOffset = offset;
		
		hairColorOffsets = new int[hairCount];
		int hairPointer = hairStart;
		for (int i = 0; i < hairCount; i++) {
			hairColorOffsets[i] = hairPointer;
			hairPointer += 2;
		}
		
		primaryColorOffsets = new int[primaryCount];
		int primaryPointer = primaryStart;
		for (int i = 0; i < primaryCount; i++) {
			primaryColorOffsets[i] = primaryPointer;
			primaryPointer += 2;
		}
		
		secondaryColorOffsets = new int[] {};
		tertiaryColorOffsets = new int[] {};
	}
	
	public PaletteInfo(long offset, int hairStart, int hairCount, int primaryStart, int primaryCount, int secondaryStart, int secondaryCount) {
		this.paletteOffset = offset;
		
		hairColorOffsets = new int[hairCount];
		int hairPointer = hairStart;
		for (int i = 0; i < hairCount; i++) {
			hairColorOffsets[i] = hairPointer;
			hairPointer += 2;
		}
		
		primaryColorOffsets = new int[primaryCount];
		int primaryPointer = primaryStart;
		for (int i = 0; i < primaryCount; i++) {
			primaryColorOffsets[i] = primaryPointer;
			primaryPointer += 2;
		}
		
		secondaryColorOffsets = new int[secondaryCount];
		int secondaryPointer = secondaryStart;
		for (int i = 0; i < secondaryCount; i++) {
			secondaryColorOffsets[i] = secondaryPointer;
			secondaryPointer += 2;
		}
		
		tertiaryColorOffsets = new int[] {};
	}
	
	public PaletteInfo(long offset, int[] hairColors, int[] primaryColors, int[] secondaryColors) {
		this.paletteOffset = offset;
		
		this.hairColorOffsets = hairColors;
		this.primaryColorOffsets = primaryColors;
		this.secondaryColorOffsets = secondaryColors;
		this.tertiaryColorOffsets = new int[] {};
	}
	
	public PaletteInfo(long offset, int[] hairColors, int[] primaryColors, int[] secondaryColors, int[] tertiaryColors) {
		this.paletteOffset = offset;
		
		this.hairColorOffsets = hairColors;
		this.primaryColorOffsets = primaryColors;
		this.secondaryColorOffsets = secondaryColors;
		this.tertiaryColorOffsets = tertiaryColors;
	}
}