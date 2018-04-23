package pl.coderslab.advanced.dao.simple.exercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public abstract class AbstractDao implements pl.coderslab.advanced.dao.simple.exercise.DaoInterface {

	protected abstract pl.coderslab.advanced.dao.simple.exercise.Model newFromResultSet(ResultSet rs) throws SQLException;

	protected abstract String getLoadAllQuery();

	protected abstract String getLoadByIdQuery();

	protected abstract PreparedStatement saveNewStatement(Connection con, pl.coderslab.advanced.dao.simple.exercise.Model item) throws SQLException;

	protected abstract PreparedStatement updateExistingStatement(Connection con, pl.coderslab.advanced.dao.simple.exercise.Model item) throws SQLException;

	protected abstract PreparedStatement deleteStatement(Connection con, pl.coderslab.advanced.dao.simple.exercise.Model item) throws SQLException;

	public List<pl.coderslab.advanced.dao.simple.exercise.Model> loadAll() {
		List<pl.coderslab.advanced.dao.simple.exercise.Model> list = new ArrayList<>();
		try (Connection con = pl.coderslab.advanced.dao.simple.exercise.DbUtil.getConnection()) {
			try (ResultSet rs = con.prepareStatement(getLoadAllQuery()).executeQuery()) {
				while (rs.next()) {
					list.add(newFromResultSet(rs));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public pl.coderslab.advanced.dao.simple.exercise.Model loadById(int id) {
		try (Connection con = pl.coderslab.advanced.dao.simple.exercise.DbUtil.getConnection()) {
			try (PreparedStatement ps = con.prepareStatement(getLoadByIdQuery())) {
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();

				if (rs.next()) {
					return newFromResultSet(rs);
				}
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void save(pl.coderslab.advanced.dao.simple.exercise.Model item) {
		try (Connection con = pl.coderslab.advanced.dao.simple.exercise.DbUtil.getConnection()) {
			if (item.getId() == null) {
				saveNewToDb(con, item);
			} else {
				updateExistingInDb(con, item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void saveNewToDb(Connection con, pl.coderslab.advanced.dao.simple.exercise.Model item) throws SQLException {
		try (PreparedStatement ps = saveNewStatement(con, item)) {
			ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				item.setId(rs.getInt(1));
			}
			rs.close();
		}
	}

	private void updateExistingInDb(Connection con, pl.coderslab.advanced.dao.simple.exercise.Model item) throws SQLException {
		try (PreparedStatement ps = updateExistingStatement(con, item)) {
			ps.executeUpdate();
		}
	}

	public void delete(pl.coderslab.advanced.dao.simple.exercise.Model item) {
		try (Connection con = pl.coderslab.advanced.dao.simple.exercise.DbUtil.getConnection()) {
			if (item.getId() != 0) {
				try (PreparedStatement ps = deleteStatement(con, item)) {
					ps.executeUpdate();
				}
				item.setId(0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
