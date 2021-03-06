package com.data.dao.singleForm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import com.data.model.tb_adminModel;

public class tb_adminDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		// TODO Auto-generated method stub

	}

	public JdbcTemplate getJdbcTemple() {
		// TODO Auto-generated method stub
		return jdbcTemplate;
	}
	
	// 用来判断管理员的Account是否存在,如果数目为0,则代表不存在,否则用户名已经存在
		@SuppressWarnings("deprecation")
		public int queryAccountNumber(String sql) {
			return jdbcTemplate.queryForInt(sql);
		}
		
	public Object queryAccount(String sql) {
		return  jdbcTemplate.queryForObject(sql,
				new RowMapper<Object>() {
					@Override
					public Object mapRow(ResultSet rs, int arg1)
							throws SQLException {
						
						return rs.getString("Account");
					}
				});
	}
	// 根据Account
		public Object queryArid(String sql) {
			return  jdbcTemplate.queryForObject(sql,
					new RowMapper<Object>() {
						@Override
						public Object mapRow(ResultSet rs, int arg1)
								throws SQLException {
							return rs.getString("Arid");
						}
					});
		}

	public Object queryAid(String sql) {// 根据账户名(Account)
		return jdbcTemplate.queryForObject(sql, new RowMapper<Object>() {
			@Override
			public tb_adminModel mapRow(ResultSet rs, int arg1)
					throws SQLException {
				tb_adminModel adminModel = new tb_adminModel();
				adminModel.setAid(rs.getString("Aid"));
				return adminModel;
			}
		});
	}

	// 查询Account，Aid，Email,Privilege,CreateTime
	public List<Object> queryRecord(String sql, final List<Object> param) {
		final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return jdbcTemplate.query(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				for (int i = 0; i < param.size(); i++) {
					try {
						ps.setObject(i + 1, param.get(i));
						// System.out.println(param.get(i) + "1111111111");
					} catch (SQLException e) {
						System.out.println("Pstmt中Sql语句参数注入异常");
						e.printStackTrace();
					}
				}
			}
		}, new RowMapper<Object>() {
			@Override
			public tb_adminModel mapRow(ResultSet rs, int arg1)
					throws SQLException {
				tb_adminModel adminModel = new tb_adminModel();
				adminModel.setAccount(rs.getString("Account"));
				adminModel.setAid(rs.getString("Aid"));
				adminModel.setEmail(rs.getString("Email"));
				adminModel.setPrivilege(rs.getString("Privilege"));
				adminModel.setCreateTime(sdf.format(rs
						.getTimestamp("CreateTime")));
				return adminModel;
			}
		});

	}
	// 查询Account,Aid,Sid,CreateTime(一条或多条纪录)
		public List<Object> query2(String sql, final List<Object> param) {
			final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			return jdbcTemplate.query(sql, new PreparedStatementSetter() {
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					for (int i = 0; i < param.size(); i++) {
						try {
							ps.setObject(i + 1, param.get(i));
							// System.out.println(param.get(i) + "1111111111");
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}, new RowMapper<Object>() {
				@Override
				public tb_adminModel mapRow(ResultSet rs, int arg1)
						throws SQLException {
					tb_adminModel adminModel = new tb_adminModel();
					adminModel.setAccount(rs.getString("Account"));
					adminModel.setAid(rs.getString("Aid"));
					adminModel.setSid(rs.getString("Sid"));
					adminModel.setCreateTime(sdf.format(rs
							.getTimestamp("CreateTime")));
					return adminModel;
				}
			});

		}
		// 查询Account,Aid(一条或多条纪录)
				public List<Object> query3(String sql, final List<Object> param) {
					final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					return jdbcTemplate.query(sql, new PreparedStatementSetter() {
						@Override
						public void setValues(PreparedStatement ps) throws SQLException {
							for (int i = 0; i < param.size(); i++) {
								try {
									ps.setObject(i + 1, param.get(i));
									// System.out.println(param.get(i) + "1111111111");
								} catch (SQLException e) {
									e.printStackTrace();
								}
							}
						}
					}, new RowMapper<Object>() {
						@Override
						public tb_adminModel mapRow(ResultSet rs, int arg1)
								throws SQLException {
							tb_adminModel adminModel = new tb_adminModel();
							adminModel.setAccount(rs.getString("Account"));
							adminModel.setAid(rs.getString("Aid"));
							return adminModel;
						}
					});

				}
	public List<Object> queryAids(String sql, final List<Object> param) {
		final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return jdbcTemplate.query(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				for (int i = 0; i < param.size(); i++) {
					try {
						ps.setObject(i + 1, param.get(i));
						// System.out.println(param.get(i) + "1111111111");
					} catch (SQLException e) {
						System.out.println("Pstmt中Sql语句参数注入异常");
						e.printStackTrace();
					}
				}
			}
		}, new RowMapper<Object>() {
			@Override
			public tb_adminModel mapRow(ResultSet rs, int arg1)
					throws SQLException {
				tb_adminModel adminModel = new tb_adminModel();
				adminModel.setAid(rs.getString("Aid"));
				return adminModel;
			}
		});

	}
	@SuppressWarnings("deprecation")
	public int queryRecordNumber(String sql) {
		return jdbcTemplate.queryForInt(sql);

	}
	public void update(String sql, final List<Object> param) {

		jdbcTemplate.update(sql, new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				for (int i = 0; i < param.size(); i++) {
					try {
						ps.setObject(i + 1, param.get(i));
						System.out.println(param.get(i));
						// System.out.println("dao"+sql);
					} catch (SQLException e) {
						System.out
								.println("checkAdviceDao:Pstmt中的Sql语句参数注入异常。。。");
						e.printStackTrace();
					}
				}
			}
		});

	}
}
