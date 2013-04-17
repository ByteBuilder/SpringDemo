package org.chy.jdbc;

public class TeacherServiceImpl implements TeacherService {
	private TeacherDao teacherDao;
	
	@Override
	public void insertAll(Teacher teacher1, Teacher teacher2, Teacher teacher3) {
		teacherDao.insert1(teacher1);
		teacherDao.insert2(teacher1);
		teacherDao.insert3(teacher1);
	}

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	
}
