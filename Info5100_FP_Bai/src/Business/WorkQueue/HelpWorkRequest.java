/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author yutingbai
 */
public class HelpWorkRequest extends WorkRequest{
    
    private String Result;
    private boolean approval = false;
    private UserAccount approvedBy;
    
    

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        this.Result = result;
    }
    
    
}
