package br.com.nektar.recomendador;

import java.util.List;

import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendaCursos {
	
	public static void main(String[] args) throws Exception {
		Recommender recommender = new RecomendadorBuilder().buildRecommender(new Recomendador().getModelo("cursos.csv"));
		List<RecommendedItem> recomendacoes = recommender.recommend(15, 6);
		recomendacoes.forEach(r -> System.out.println(r));
	}
}
