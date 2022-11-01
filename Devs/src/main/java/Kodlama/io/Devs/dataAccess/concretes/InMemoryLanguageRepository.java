package Kodlama.io.Devs.dataAccess.concretes;

import java.util.List;

import Kodlama.io.Devs.dataAccess.abstracrs.LanguageRepository;
import Kodlama.io.Devs.entities.Language;



public class InMemoryLanguageRepository implements LanguageRepository{

	 List<Language> Language;

	
	public InMemoryLanguageRepository() {
		Language.add(new Language(1, "java"));
		Language.add(new Language(2, "c#"));
		Language.add(new Language(3, "c++"));
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return Language;
	}

	@Override
	public void add(Language language) {
		Language.add(language);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Language language) {
		Language.set(language.getId()+1,language);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Language language) {
		Language.remove(language);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kodlama.io.Devs.entities.Language getById(int id) {
		Language obj = Language.get(id);
		// TODO Auto-generated method stub
		return obj;
	}
		

	
}
