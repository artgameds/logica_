public class Unidade{
    private int cd_unidade;
    private srting ds_unidade;

    public Unidade(int cd_unidade, srting ds_unidade) {
        this.setcd_unidade (cd_unidade);
        this.setds_unidade (ds_unidade);

    }

    public Unidade() {
    }

    public int getCd_unidade() {
        return cd_unidade;
    }

    public void setCd_unidade(int cd_unidade) {
        this.cd_unidade = cd_unidade;
    }

    public srting getDs_unidade() {
        return ds_unidade;
    }

    public void setDs_unidade(srting ds_unidade) {
        this.ds_unidade = ds_unidade;
    }
}
