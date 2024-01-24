package tekup.tn.formsproject.web.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
// hadhi nwali eli kbalha manktbouch hata toString @Data
public class RegisterForm {
    @NotEmpty
    
    //@size(min=2, max =20)
	private String username;
    @NotEmpty
	private String password;
    @NotEmpty
	private String confirmPassword;
    @NotEmpty
    @Email
	private String email;

}