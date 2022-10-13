package kodlamaIO.busines;

import java.util.ArrayList;
import java.util.List;
import kodlamaIO.core.logging.Logger;
import kodlamaIO.dateAccess.CourseDao;
import kodlamaIO.entities.Category;

public class CategoryManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private ArrayList<String> list;

	public CategoryManager(CourseDao courseDao, Logger[] loggers, ArrayList<String> list) {

		this.loggers = loggers;
		this.list = list;
		// TODO Auto-generated constructor stub
	}

	public void add(Category category) {
		boolean a = false;

		for (String list : list) {

			if (list == category.getName()) {
				System.out.println(list + "Kategori adları bunlardır tekrar edemez");

			} else {
				a = true;

			}
		}
		if (a) {

			System.out.println(category.getName() + ": Kategori eklendi");
			list.add(category.getName());

		}

	}

}
