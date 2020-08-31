package br.com.nektar.recomendador;

import java.util.List;

import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendaProdutos {
	
	public static void main(String[] args) throws Exception {
		
		Recommender recommender = new RecomendadorBuilder().buildRecommender(new Recomendador().getModelo("dados.csv"));
		
		List<RecommendedItem> recomendacoes = recommender.recommend(6, 4);
		
		recomendacoes.forEach(r -> System.out.println(r));
	}
}
