package models;

public class Authorization {

    private String grant_type;
    private String username;
    private String password;
    private String scope;

    public Authorization()
    {

    }

    public Authorization(String grant_type,String username,String password,String scope)
    {
        setGrant_type(grant_type);
        setUsername(username);
        setPassword(password);
        setScope(scope);
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
