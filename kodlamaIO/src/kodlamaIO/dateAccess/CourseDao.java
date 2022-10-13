package kodlamaIO.dateAccess;

import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Educator;


public interface CourseDao {

		void add (Course course);
		void add (Category category);
		void add (Educator educator);
		//void add (Product product);
}
