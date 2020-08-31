package br.com.nektar.recomendador;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

public class Recomendador {
	
	public DataModel getModelo(String modelo) throws IOException {
		return new FileDataModel(new File("src/main/resources/"+modelo));
	}
}
