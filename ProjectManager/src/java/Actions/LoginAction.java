/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author SuperG
 */
public class LoginAction extends ActionSupport
{
    private String userName;
    private String userPass;
    
    public LoginAction()
    {
    }
    
    public String execute() throws Exception
    {
        if("Super".equals(this.getUserName()) && "5465".equals(this.getUserPass()))
            return SUCCESS;
        else return ERROR;
    }

    /**
     * @return the userName
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /**
     * @return the userPass
     */
    public String getUserPass()
    {
        return userPass;
    }

    /**
     * @param userPass the userPass to set
     */
    public void setUserPass(String userPass)
    {
        this.userPass = userPass;
    }
    
}
