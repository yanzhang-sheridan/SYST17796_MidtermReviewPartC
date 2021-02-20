

package midtermreviewcodeforpartc;

/**
 *This class +++Insert Description here+++
 *
 * @author Yan Zhang
 */
public class PasswordValidator {
    
    private String password;
    //private boolean validPassword = false;
    
    public PasswordValidator(String ps){
        password = ps;
    }
    
    
    //setter and getter
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //method to validating th epassword
    public boolean validPassword() {

        boolean isValid = false;
        int specialCharCount = 0;
        //iterate over each character to see if it is a special character
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                //now we know there is at least one special character
                specialCharCount++;
            }
        }
        if (specialCharCount > 0 && password.length() > 7) {
            isValid = true;
        }
        return isValid;
    }

    
}  
    
    

