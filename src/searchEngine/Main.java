package searchEngine;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		/*
		 * TODO : 
		 *  - pour chaque doc : indexation (mot -> frequence d'apparition dans doc)
		 *  - indexation de la requete
		 *  - classement des doc par proximite avec la requete
		 */
		
		TreeMap<String, Keyword> keywords = Index.loadVocabulary();
		TreeMap<Integer, Document> documents = Index.loadDocuments();
		
		Document doc = documents.get(0);
		List<String> wordsFromDoc = Arrays.asList(doc.getText().split("[ .,;:\"()!?]+"));
		for (String word : wordsFromDoc) {
			if (keywords.keySet().contains(word)) {
				Keyword keyword = keywords.get(word);
				keyword.add1Occur(0, keyword.get1Occur(0) + 1);
			}
		}
		
		for (Keyword keyword : keywords.values()) {
			if (keyword.get1Occur(0) != null)
				System.out.println(keyword.getTerm() + " " + keyword.get1Occur(0));
		}
		
	}

}
