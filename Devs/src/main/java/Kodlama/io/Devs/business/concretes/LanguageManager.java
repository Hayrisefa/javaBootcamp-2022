package Kodlama.io.Devs.business.concretes;

import java.util.List;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracrs.LanguageRepository;
import Kodlama.io.Devs.entities.Language;

public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public Language getByid(int id) {

		return languageRepository.getById(id);
	}

	@Override
	public List<Language> getAll() {
		List<Language> obj = languageRepository.getAll();

		return obj;
	}

	@Override
	public void add(Language language) {

		if (language.getName() == null) {

			System.out.println("İsim boş girilemez");
		}
		List<Language> obje = languageRepository.getAll();

		for (Language item : obje) {
			if (item.getName() == language.getName()) {
				System.out.println("İsim aynı  girilemez");
			}

		}

		languageRepository.add(language);
		System.out.println("Nesne eklendi");
	}

	@Override
	public void delete(int id) {
		Language obje = languageRepository.getById(id);
		languageRepository.delete(obje);
		System.out.println("Nesne silindi");
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Language language) {
		Language obje = languageRepository.getById(language.getId());
		obje.setName(language.getName());
		languageRepository.update(obje);
		System.out.println("Nesne güncellendi");
		// TODO Auto-generated method stub

	}

}
