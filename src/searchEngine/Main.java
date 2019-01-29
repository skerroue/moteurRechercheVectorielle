package searchEngine;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		/*
		 * TODO : 
		 *  - pour chaque doc : indexation (mot -> frequence d'apparition dans doc)
		 *  - indexation de la requete
		 *  - classement des doc par proximite avec la requete
		 */
		
		TreeMap<String, Keyword> vocabulary = Index.loadVocabulary();
		
		for (Entry<String, Keyword> string : vocabulary.entrySet()) {
			System.out.println(string);
		}
		
	}

}
