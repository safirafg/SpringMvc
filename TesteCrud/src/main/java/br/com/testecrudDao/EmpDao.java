package br.com.testecrudDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


import br.com.testecrud.Emp;

public class EmpDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Emp p) {
		String sql = "insert into Emp99(nome,salario,designacao) values('" + p.getNome() + "'," + p.getSalario() + ",'"
				+ p.getDesignacao() + "')";
		return template.update(sql);

	}

	public int update(Emp p) {
		String sql = "update Emp99 set nome='" + p.getNome() + "', salario=" + p.getSalario() + ",designacao='"
				+ p.getDesignacao() + "' where id=" + p.getId() + "";
		return template.update(sql);
	}

	public int delete(int id) {
		String sql = "delete from Emp99 where id=" + id + "";
		return template.update(sql);
	}

	public Emp getEmpById(int id) {
		String sql = "select * from Emp99 where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Emp>(Emp.class));
	}

	public List<Emp> getEmployees() {
		return template.query("select * from Emp99", new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setNome(rs.getString(2));
				e.setSalario(rs.getFloat(3));
				e.setDesignacao(rs.getString(4));
				return e;
			}
		});
	}
}
