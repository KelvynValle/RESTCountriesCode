package br.com.kelvyn.arrayUtil;

public class arrayUtil {
public static int indexOf(String[] array, String value) {
	for(int index = 0; index < array.length; index++) {
		if(array[index] == value) {
			return index;
		}
	}
	return -1;
}
}
