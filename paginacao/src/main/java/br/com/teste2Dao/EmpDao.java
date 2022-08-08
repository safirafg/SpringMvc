package br.com.teste2Dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import br.com.teste2.Emp; 
    
public class EmpDao {    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
    
public List<Emp> getEmployeesByPage(int pageid,int total){    
    String sql="select * from emp limit "+(pageid-1)+","+total;    
    return template.query(sql,new RowMapper<Emp>(){    
        public Emp mapRow(ResultSet rs, int row) throws SQLException {    
            Emp e=new Emp();    
            e.setId(rs.getInt(1));    
            e.setNome(rs.getString(2));    
            e.setSalario(rs.getFloat(3));    
            return e;    
        }    
    });    
}    
}    