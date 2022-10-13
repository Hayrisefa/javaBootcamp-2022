package kodlamaIO;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.busines.CategoryManager;
import kodlamaIO.busines.CourseManager;
import kodlamaIO.busines.EducatorManager;
import kodlamaIO.core.logging.DatabaseLogger;
import kodlamaIO.core.logging.Filelogger;
import kodlamaIO.core.logging.Logger;
import kodlamaIO.core.logging.MailLogger;
import kodlamaIO.dateAccess.CourseDao;
import kodlamaIO.dateAccess.HibernateProductDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Kurs listesi
		ArrayList<String> couseList1 = new ArrayList<String>();
		// Eğitmen Listesi
		
		// Kategori Listesi
		ArrayList<String> categoryList = new ArrayList<String>();
		Logger[] loggers = { new MailLogger(), new DatabaseLogger() };

		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		course1.setKategori_id("Programlama");
		course1.setEgitmen("Engin Demirog");
		course1.setPrice(5);

		Course course2 = new Course();
		course2.setId(2);
		course2.setName("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)");
		course2.setKategori_id("Programlama");
		course2.setEgitmen("Engin Demirog");
		course2.setPrice(5);

		Course course3 = new Course();
		course3.setId(3);
		course3.setName("Senior Yazılım Geliştirici Yetiştirme Kampı");
		course3.setKategori_id("Programlama");
		course3.setEgitmen("Engin Demirog");
		course3.setPrice(5);

		Course course4 = new Course();
		course4.setId(4);
		course4.setName("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA");
		course4.setKategori_id("Programlama");
		course4.setEgitmen("Engin Demirog");
		course4.setPrice(5);
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Mimari");
		categoryList.add(course1.getKategori());

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Tasarım");
		categoryList.add(course2.getKategori());
		
		Educator educator1 = new Educator();
		educator1.setId(1);
		educator1.setName("Engin Demirog");
		
		Educator educator2 = new Educator();
		educator2.setId(2);
		educator2.setName("Emre Burak Gül");
		
		ArrayList<String> educatorList = new ArrayList<String>();
		educatorList.add(educator1.getName());
		
		

		EducatorManager educatorManager = new EducatorManager(new HibernateProductDao(), loggers, educatorList);
		
		educatorManager.add(educator2);
	
		//Kurs adlarının listeye eklenmesi
		couseList1.add(course1.getName());
		couseList1.add(course2.getName());
		couseList1.add(course3.getName());
		couseList1.add(course4.getName());

		

		CategoryManager categoryManager = new CategoryManager(new HibernateProductDao(), loggers, categoryList);
		categoryManager.add(category1);
		categoryManager.add(category2);

		CourseManager courseManager = new CourseManager(new HibernateProductDao(), loggers, couseList1);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);

	}

}
