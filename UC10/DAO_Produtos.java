import java.sql.*;

public class DAO_Produtos {

    Conexao obj_conexao = new Conexao();

    /*metodo para consultar produtos*/
    public void consultar(){
        obj_conexao.conexao();
        Statement stm = null;
        ResultSet rs = null;

        try
        {
            stm = obj_conexao.conn.createStatement();
            rs = stm.executeQuery("select * from produtos");
            while(rs.next())
                System.out.println(rs.getInt(1) +
                        " " + rs.getString(2) +
                        " " + rs.getDouble(3) +
                        " " + rs.getDouble(4) +
                        " " + rs.getInt(5));
            obj_conexao.desconecta();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    /*metodo para inserir produtos, que recebe um argumento do tipo Produto*/
    public void inserir(Produto p){
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Produtos (cd_produto, ds_produto, vl_produto, qt_produto, cd_unidade) VALUES (?,?,?,?,?)";
        try
        {
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1,p.getCd_produto());
            pst.setString(2, p.getDs_produto());
            pst.setDouble(3, p.getVl_produto());
            pst.setDouble(4, p.getQt_produto());
            pst.setInt(5,p.getCd_unidade());
            pst.execute();
            obj_conexao.desconecta();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    /*metodo para alterar produtos, que recebe um argumento do tipo Produto*/
    public void alterar(Produto p){
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "UPDATE Produtos SET ds_produto=?, vl_produto=?, qt_produto=?, cd_unidade=? WHERE cd_produto=?";
        try
        {
            pst = obj_conexao.conn.prepareStatement(sql);

            pst.setString(1, p.getDs_produto());
            pst.setDouble(2, p.getVl_produto());
            pst.setDouble(3, p.getQt_produto());
            pst.setInt(4,p.getCd_unidade());
            pst.setInt(5,p.getCd_produto());
            pst.execute();
            obj_conexao.desconecta();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    /*m excluir produtos, e recebe um valor do tipo inteiro*/
    public void excluir(int id){
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "DELETE from Produtos WHERE cd_produto=?";
        try
        {
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            obj_conexao.desconecta();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}