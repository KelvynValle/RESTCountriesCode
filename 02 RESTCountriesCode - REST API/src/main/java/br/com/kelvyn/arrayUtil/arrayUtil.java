package br.com.kelvyn.arrayUtil;

public class arrayUtil {
//indexOf case-sensitive
public static int indexOf(String[] array, String value) {
	for(int index = 0; index < array.length; index++) {
		if(array[index].equals(value)) {
			return index;
		}
	}
	return -1;
}

//indexOf case-insensitive
public static int indexOfInsensitive(String[] array, String value) {
	for(int index = 0; index < array.length; index++) {
		if(array[index].toUpperCase().equals(value.toUpperCase())) {
			return index;
		}
	}
	return -1;
}

//indexOf contains case-insensitive
public static int indexOfContains(String[] array, String value) {
	for(int index = 0; index < array.length; index++) {
		if(array[index].toUpperCase().contains(value.toUpperCase())) {
			return index;
		}
	}
	return -1;
}
}
