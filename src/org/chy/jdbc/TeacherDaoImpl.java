package org.chy.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class TeacherDaoImpl implements TeacherDao {
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insert1(Teacher teacher) {
		String sql = "INSERT INTO TEACHER (NAME,AGE,MALE) VALUES (?,?,?)";
		Object[] params = new Object[] { teacher.getName(), teacher.getAge(),
				teacher.getMale() };

		jdbcTemplate.update(sql, params);
	}
	
	@Override
	public void insert2(Teacher teacher) {
		String sql = "INSERT INTO TEACHER (NAME,AGE,MALE) VALUES (?,?,?)";
		Object[] params = new Object[] { teacher.getName(), teacher.getAge(),
				teacher.getMale() };

		jdbcTemplate.update(sql, params);
	}
	
	@Override
	public void insert3(Teacher teacher) {
		String sql = "INSERT INTO TEACHER (NAME,AGE,MALE) VALUES (?,?,?)";
		Object[] params = new Object[] { teacher.getName(), teacher.getAge(),
				teacher.getMale() };

		jdbcTemplate.update(sql, params);
	}

	
	@Override
	public int getNum() {
		return jdbcTemplate.queryForInt("SELECT COUNT(ID) FROM TEACHER");
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
