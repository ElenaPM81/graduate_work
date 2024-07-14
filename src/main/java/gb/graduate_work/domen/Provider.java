package gb.graduate_work.domen;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //аннотация для геттеров и сеттеров
@AllArgsConstructor  // аннотация для конструктора
@NoArgsConstructor   //  аннотация для конструктора без аргументов
// класс  который содержит информацию об объекте "Поставщик"
public class Provider {
    // в полях объявлены обязательные атрибуты

    private int id;
    @NotEmpty  // поле не может быть пустым
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]*$", message = "Name should consist only letters")// проверка на неправильные символы
    private String company_name;   // название компании
    private String application_day; // день заявки
    private String product_day;   // день поставки продукции
    private String payment_day;   // день оплаты
    private String address_company;  // адрес компании
    @Pattern(regexp = "\\+\\d+", message = "Telephone number consist of digits or + sign")
    private String phone;    //  номер телефона
    @Email(message = "Email is not valid")
    private String email;  // адрес электронной почты
    private String note;  // примечание
}


