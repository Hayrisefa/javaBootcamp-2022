package kodlamaIO.busines;

import java.util.ArrayList;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dateAccess.CourseDao;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Educator;

public class EducatorManager {
	private CourseDao courseDao;
	private Educator educator;
	private Logger[] logers;
	private ArrayList<String> list;

	public EducatorManager(CourseDao courseDao, Logger[] loggers, ArrayList<String> list) {

		this.logers = loggers;
		this.courseDao = courseDao;
		this.list = list;
	}

	public void add(Educator educator) throws Exception {
		// iş kuralları
		boolean flag = false;

		for (String list : list) {

			if (list == educator.getName()) {
				System.out.println(list + " : Egitmen adları bunlardır tekrar edemez");

			} else {
				flag = true;

			}
		}
		if (flag) {

			System.out.println(educator.getName() + ": Egitmen eklendi");
			list.add(educator.getName());
			
			

		}

	}

}
