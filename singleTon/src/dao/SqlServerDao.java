package dao;

public class SqlServerDao extends DaoFactoryImpl implements DaoFactory{
    @Override
    public ComputerDao createComputerDao() {
        return new SqlServerComputerDao();
    }

    @Override
    public StaffDao createStaffDao() {
        return new SqlServerStaffDao();
    }
}
