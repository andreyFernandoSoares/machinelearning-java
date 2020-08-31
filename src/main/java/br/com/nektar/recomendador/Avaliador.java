package br.com.nektar.recomendador;

import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.common.RandomUtils;

public class Avaliador {
	
	public static void main(String[] args) throws Exception {
		RandomUtils.useTestSeed();
		RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
		RecommenderBuilder builder = new RecomendadorBuilder();
		double erro = evaluator.evaluate(builder, null, new Recomendador().getModelo("cursos2.csv"), 0.9, 1.0);
		System.out.println(erro);
	}
}
