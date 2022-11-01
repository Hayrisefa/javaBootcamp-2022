package Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageControllers {

	private LanguageService languageService;
	@Autowired
		public LanguageControllers(LanguageService languageService) {
			this.languageService=languageService;

		}
	
		
		@GetMapping("/getall")
		public List<Language> getAll(){
			return languageService.getAll();
		}
		
		@GetMapping("/getById")
		public Language getById(int id) {
			return languageService.getByid(id);
		}
		
		@GetMapping("/add")
		public void add(Language language) throws Exception {
			languageService.add(language);

		}
		
		@GetMapping("/update")
		public void update(Language language) throws Exception {
			languageService.update(language);
			
		}
		
		@GetMapping("/delete")
		public void delete(int id) {
			languageService.delete(id);

		}
}

