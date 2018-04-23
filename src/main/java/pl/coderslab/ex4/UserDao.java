package pl.coderslab.ex4;

import pl.coderslab.advanced.dao.simple.exercise.AbstractDao;
import pl.coderslab.advanced.dao.simple.exercise.Group;
import pl.coderslab.advanced.dao.simple.exercise.GroupDao;
import pl.coderslab.advanced.dao.simple.exercise.Model;
import pl.coderslab.ex4.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao extends AbstractDao {

    private static final String LOAD_ALL_QUERY = "SELECT * FROM user;";
    private static final String LOAD_BY_ID_QUERY = "SELECT * FROM user WHERE id=?;";
    private static final String CREATE_QUERY = "INSERT INTO user(name, group_id) VALUES(?,?);";
    private static final String UPDATE_QUERY = "UPDATE user SET name=?, group_id=? WHERE id=?;";
    private static final String DELETE_QUERY = "DELETE FROM user WHERE id=?;";

    @Override
    protected Model newFromResultSet(ResultSet rs) throws SQLException {
        GroupDao groupDao = new GroupDao();
        Group group = (Group) groupDao.loadById(rs.getInt("group_id"));
        return new User(rs.getLong("id"), rs.getString("name"), group);
    }

    @Override
    protected String getLoadAllQuery() {
        return LOAD_ALL_QUERY;
    }

    @Override
    protected String getLoadByIdQuery() {
        return LOAD_BY_ID_QUERY;
    }

    @Override
    protected PreparedStatement saveNewStatement(Connection con, Model item) throws SQLException {
        String[] generatedColumns = {"id"};
        PreparedStatement ps = con.prepareStatement(CREATE_QUERY, generatedColumns);
        ps.setString(1, ((User)item).getName());
        ps.setLong(2, ((User)item).getGroup().getId());
        return ps;
    }

    @Override
    protected PreparedStatement updateExistingStatement(Connection con, Model item) throws SQLException {
        String[] generatedColumns = {"id"};
        PreparedStatement ps = con.prepareStatement(UPDATE_QUERY, generatedColumns);
        ps.setString(1, ((User)item).getName());
        ps.setLong(2, ((User)item).getGroup().getId());
        ps.setLong(3, item.getId());
        return ps;
    }

    @Override
    protected PreparedStatement deleteStatement(Connection con, Model item) throws SQLException {
        String[] generatedColumns = {"id"};
        PreparedStatement ps = con.prepareStatement(DELETE_QUERY, generatedColumns);
        ps.setLong(1, item.getId());
        return ps;
    }
}
