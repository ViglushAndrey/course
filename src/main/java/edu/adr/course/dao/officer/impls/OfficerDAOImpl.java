package edu.adr.course.dao.officer.impls;

import edu.adr.course.dao.officer.interfaces.IOfficerDAO;
import edu.adr.course.data.FakeData;
import edu.adr.course.model.Officers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * course.OfficerDAOImpl
 *
 * @Autor: Andrey
 * @DateTime: 8.03.2021|14:03
 * @Version: OfficerDAOImpl: 1.0
 */


@Repository
public class OfficerDAOImpl implements IOfficerDAO {

    @Autowired
    FakeData fakeData;

    @Override
    public Officers getById(String id) {
        return this.getAll().stream()
                .filter(officers -> officers.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public Officers create(Officers officers) {
        String id = String.valueOf(this.getAll().stream()
                .mapToInt(el ->Integer.parseInt(el.getId())).max().orElse(0) + 1);
        officers.setId(id);
        this.getAll().add(officers);
        return officers;
    }

    @Override
    public Officers update(Officers officers) {
        this.delete(officers.getId());
        this.getAll().add(officers);
        return officers;
    }

    @Override
    public Officers delete(String id) {
        Officers officers = this.getById(id);
        this.getAll().remove(officers);
        return officers;
    }

    @Override
    public List<Officers> getAll() {
        return fakeData.getOfficers();
    }


}
    