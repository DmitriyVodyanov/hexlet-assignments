package exercise;

import java.util.*;



class App {


	static Map<String, Integer> occurrences;
	String str;
	public static Map getWordCount(String symbols) {
		String[] splitWords = symbols.split(" ");
		System.out.println(Arrays.toString(splitWords));
		occurrences = new HashMap<>();
		for (String word : splitWords) {
			if (word.equals("")) {
				break;
			}
			Integer oldCount = occurrences.get(word);
			if ( oldCount == null ) {
				oldCount = 0;
			}
			occurrences.put(word, oldCount + 1);
		}
		System.out.println(occurrences);
		return occurrences;
	}

	public static String toString1(Map<String, Integer> map) {
		StringBuilder mapAsString = new StringBuilder("{");
		map.forEach((key, value) -> mapAsString.append("\"  " + key + ": " + value +  "\n,  "));
		mapAsString.delete(mapAsString.length()-2, mapAsString.length()).append("}");
		return mapAsString.toString();
	}

	public static Map getWordCount1(String sentence) {

		String[] words = sentence.split(" ");
		Map map = new HashMap();

		if (sentence.length() == 0) {
			return map;
		}

		for (String word : words) {
			int wordCount = (int) map.getOrDefault(word, 0);
			wordCount += 1;
			map.put(word, wordCount);
		}

		return map;
	}
	public static String toString(Map wordsCount) {
		if (wordsCount.isEmpty()) {
			return "{}";
		}
		StringBuilder result = new StringBuilder("{\n");
		for (Object key : wordsCount.keySet()) {
			result.append("  " + key + ": " + wordsCount.get(key) + "\n");
		}
		result.append("}");
		return result.toString();
	}
}
