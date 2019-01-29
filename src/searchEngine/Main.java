package searchEngine;


public class Main {

	public static void main(String[] args) {
		/*
		 * TODO : 
		 *  - pour chaque doc : indexation (mot -> frequence d'apparition dans doc)
		 *  - indexation de la requete
		 *  - classement des doc par proximite avec la requete
		 */
		
		System.out.println(Index.loadVocabulary());
		System.out.println(Index.loadDocuments());
		
	}

}
