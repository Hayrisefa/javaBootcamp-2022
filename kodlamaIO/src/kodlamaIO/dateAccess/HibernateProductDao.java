package kodlamaIO.dateAccess;

import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Educator;

public class HibernateProductDao implements CourseDao{
		

		@Override
		public void add(Category category) {
			// TODO Auto-generated method stub
			System.out.print("Hibernate ile veritabanına eklendi");
		}

		@Override
		public void add(Course course) {
			// TODO Auto-generated method stub
			System.out.print("Hibernate ile veritabanına eklendi");
		}

		@Override
		public void add(Educator educator) {
			// TODO Auto-generated method stub
			System.out.print("Hibernate ile veritabanına eklendi");
		}
	 
	}
