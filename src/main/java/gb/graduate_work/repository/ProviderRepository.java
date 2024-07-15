package gb.graduate_work.repository;

import gb.graduate_work.config.DbQueries;
import gb.graduate_work.domen.Provider;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
// класс который работает с базой данных
@Repository
public class ProviderRepository {
    private final JdbcTemplate jdbc;
    private final DbQueries dbQueries;

    public ProviderRepository(JdbcTemplate jdbc, DbQueries dbQueries) {
        this.jdbc = jdbc;
        this.dbQueries = dbQueries;
    }
    //далее прописываем методы, которые будут взаимодействовать с базой данных
    RowMapper<Provider> providerRowMapper = (r, i) -> {
        Provider rowObject = new Provider();
        rowObject.setId(r.getInt("id"));
        rowObject.setCompany_name(r.getString("company_name"));//
        rowObject.setApplication_day(r.getString("application_day"));//
        rowObject.setProduct_day(r.getString("product_day"));
        rowObject.setPayment_day(r.getString("payment_day"));
        rowObject.setAddress_company(r.getString("address_company"));
        rowObject.setPhone(r.getString("phone"));
        rowObject.setEmail(r.getString("email"));
        rowObject.setNote(r.getString("note"));
        return rowObject; // возвращаем созданный объект
    };

    public List<Provider> findAll() {
        return jdbc.query(dbQueries.getFindAll(), providerRowMapper);
        } //метод   возвращающий список объектов

    public Provider save(Provider provider) {
        jdbc.update(dbQueries.getSave(), provider.getCompany_name(), provider.getApplication_day(), provider.getProduct_day(), provider.getPayment_day(), provider.getAddress_company(), provider.getPhone(), provider.getEmail(), provider.getNote()); //метод, добавляющий новую запись в таблицу
        return provider;
    }

    public void deleteById(int id) {
        jdbc.update(dbQueries.getDelete(), id);
    } //метод, удаляющий запись из таблицы по id

    public Provider getOne(int id) {
        return jdbc.query(dbQueries.getGet(), new Object[]{id}, providerRowMapper).get(0);//метод, возвращающий один объект по id
    }

    public Provider update(Provider provider) {
        jdbc.update(dbQueries.getUpdate(), provider.getCompany_name(),  provider.getApplication_day(), provider.getProduct_day(), provider.getPayment_day(), provider.getAddress_company(), provider.getPhone(), provider.getEmail(), provider.getNote(), provider.getId());
        return provider;  //метод, обновляющий запись в таблице
    }
}


