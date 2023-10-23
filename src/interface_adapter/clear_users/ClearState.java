package interface_adapter.clear_users;
public class ClearState {
    private List<String> all_users = null;
    public ClearState(ClearState copy){this.all_users = copy.all_users;}
    public ClearState(){};
    public List<String> delete_users(){return all_users;}
    public void setAll_users(List<String> users){this.all_users = all_users;}
    public List<String> getAll_users(){return all_users;}
}
