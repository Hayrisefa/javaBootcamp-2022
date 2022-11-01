package Kodlama.io.Devs.dataAccess.abstracrs;

import java.util.List;

import Kodlama.io.Devs.entities.Language;


public interface LanguageRepository {
	
	List<Language> getAll();
	
	void add(Language language);
	void update(Language language);
	void delete(Language language);
	Language getById(int id);

}
