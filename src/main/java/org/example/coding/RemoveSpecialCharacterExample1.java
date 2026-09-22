package org.example.coding;


/*
M10297811990055I�5�&
	M10297811990055I�4�&
	M10297811990055I&G�&
	M10297811990055I&E�&

	M 1029 5011 9800 11 I
	1990009I
* */
public class RemoveSpecialCharacterExample1 {
    public static void main(String args[]) {
        String str = "M102978119900 @ MM";
        String characterFiltering = binSpecialCharacterFiltering(str);
        System.out.println(characterFiltering);
    }

    public static String binSpecialCharacterFiltering(String bin) {
        bin.replaceAll("[^a-zA-Z0-9]", "");
        if (bin.length() >= 16) {
            return bin.substring(0, 16);
        }
        if (bin.length() >= 8 && bin.length() < 16) {
            return bin.substring(0, 8);
        }
        throw new RuntimeException();
    }
}
