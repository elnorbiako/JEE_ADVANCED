package pl.coderslab.ex3;

import pl.coderslab.advanced.dao.simple.exercise.AbstractDao;
import pl.coderslab.advanced.dao.simple.exercise.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExcerciseDao extends AbstractDao {



    private static final String LOAD_ALL_QUERY = "SELECT * FROM excercise;";
    private static final String LOAD_BY_ID_QUERY = "SELECT * FROM excercise WHERE id=?;";
    private static final String CREATE_QUERY = "INSERT INTO excercise(title,description) VALUES(?,?);";
    private static final String UPDATE_QUERY = "UPDATE excercise SET title=?, description=? WHERE id=?;";
    private static final String DELETE_QUERY = "DELETE FROM excercise WHERE id=?;";

    @Override
    protected PreparedStatement saveNewStatement(Connection con, Model excercise) throws SQLException {
        String[] genereatedColumns = { "id" };
        PreparedStatement ps = con.prepareStatement(CREATE_QUERY, genereatedColumns);
        ps.setString(1, ((Excercise) excercise).getTitle());
        ps.setString(2, ((Excercise) excercise).getDescription());
        return ps;

    }

    @Override
    protected PreparedStatement updateExistingStatement(Connection con, Model excercise) throws SQLException {
        PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
        ps.setString(1, ((Excercise) excercise).getTitle());
        ps.setString(2, ((Excercise) excercise).getDescription());
        ps.setLong(3, excercise.getId());
        return ps;
    }

    @Override
    protected PreparedStatement deleteStatement(Connection con, Model excercise) throws SQLException {
        PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
        ps.setLong(1, excercise.getId());
        return ps;

    }

    @Override
    protected Model newFromResultSet(ResultSet rs) throws SQLException {
        return new Excercise(rs.getLong("id"), rs.getString("title"), rs.getString("description"));
    }

    @Override
    protected String getLoadAllQuery() {
        return LOAD_ALL_QUERY;
    }

    @Override
    protected String getLoadByIdQuery() {
        return LOAD_BY_ID_QUERY;
    }
}




