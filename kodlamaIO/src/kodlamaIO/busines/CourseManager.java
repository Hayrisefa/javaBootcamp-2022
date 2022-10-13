package kodlamaIO.busines;


import java.util.ArrayList;
import kodlamaIO.core.logging.*;
import kodlamaIO.dateAccess.CourseDao;
import kodlamaIO.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Course course;
	private Logger[] loggers;
	public  CourseManager(CourseDao courseDao,Logger[] loggers , ArrayList<String> list ) {
		// TODO Auto-generated constructor stub
		this.courseDao=courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		//iş kuralları
		if (course.getPrice()<0) {	
			throw new Exception("Ürün fiyatı 0 dan küçük olmaz ");
			
		}else  {
			courseDao.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getName());
		
						}
			
		}
		
}
}
