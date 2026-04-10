public abstract class Usuario {
    private int id;
    private String username;
    private String email;
    private String password;

    public Usuario (int id, String username, String email, String password){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getid(){
        return id;
    }

    public String getusername(){
        return username;
    }

    public String getemail(){
        return email;
    }

    public String getpassword(){
        return password;
    }

    public boolean login(String username, String email, String password) {
        if (username.equals(this.username)&&email.equals(this.email)&&password.equals(this.password)){
            return true;
        }else{
            return false;
        }
    }

    public void setusername(String username){
        this.username = username;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public void setpassword(String password){
        this.password = password;
    }
}
