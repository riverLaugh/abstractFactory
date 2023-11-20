package dao;

public class DaoFactoryImpl {
    public static DaoFactoryImpl getInstance(String type) {
        switch (type) {
            case "MySql":
                return new MysqlDaoFactory();
            case "SqlServer":
                return new SqlServerDao();
            default:
                return null;
        }
    }

    public StaffDao createStaffDao() {
        return null;
    }

    public ComputerDao createComputerDao() {
        return null;
    }
}
