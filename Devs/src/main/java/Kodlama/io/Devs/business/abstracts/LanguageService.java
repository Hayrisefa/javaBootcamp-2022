package Kodlama.io.Devs.business.abstracts;

import java.util.List;
import Kodlama.io.Devs.entities.Language;

public interface LanguageService {
	List<Language> getAll();
	void add(Language language);
	void delete(int id);
	void update(Language language);
	Language getByid(int id);
	

}
