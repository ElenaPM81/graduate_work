package gb.graduate_work.domen;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// класс который содержит информацию об объекте "Поставщик"
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Provider {

    private int id;
    @NotEmpty
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]*$", message = "Name should consist only letters")
    private String company_name;
    private String application_day;
    private String product_day;
    private String payment_day;
    private String address_company;
    @Pattern(regexp = "\\+\\d+", message = "Telephone number consist of digits or + sign")
    private String phone;
    @Email(message = "Email is not valid")
    private String email;
    private String note;
}


